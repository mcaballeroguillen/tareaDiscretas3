package tarea2;

import java.util.ArrayList;
/**
 * Objeto que calcula la distancia entre los nodos de un
 * grado dirgido no ciclíco 
 * @author Marco Caballero
 *
 */
public class Costos {
	protected ArrayList<ArrayList<Integer>> matrizini;
	protected ArrayList<ArrayList<Double>> matricostos;
	protected ArrayList<Integer> pila;
	/**
	 * Constructor de La Objeto que calcula Distancias
	 * @param matris: matriz de adyancencia
	 */
	public Costos(ArrayList<ArrayList<Integer>> matris){
		this.matrizini=matris;
		this.matricostos= new ArrayList<ArrayList<Double>>();
		this.pila =  new ArrayList<Integer>();
				
	}
	/**
	 * Carga la distancia a todos los nodos a los cuaes el puede llegar
	 * 
	 * @param nodo :nodo del cual se quiere calcular la distacia
	 */
	public void cargarlargo(Integer nodo){
		ArrayList<Integer>vecinos = this.matrizini.get(nodo);
		ArrayList<Double>micosto = new ArrayList<Double>();
		for(Integer vecino: vecinos){
			if(vecino==0){micosto.add(Double.POSITIVE_INFINITY);}else{micosto.add(1.0);}
			}
		int x;
		//Este ciclo for es para es para esperar mientras mis vecinos calculan la distancia
		// a los nodos a los cuales ellos pueden llegar, si el nodo vecino ya estan en la fila
		//signfica que ya se conocen sus distancias, por lo cual se pasan.
		for(x=0;x<vecinos.size();x++){
			if(vecinos.get(x)==0){continue;}else{
				if(pila.contains(x)){continue;}else{
					cargarlargo(x);
				}
				
			}
		}
		
		for(x=0;x<vecinos.size();x++){
			if(vecinos.get(x)==1){
				ArrayList<Double>costovecino = this.matricostos.get(x);
				for(int y=0;y<costovecino.size();y++){
					if(costovecino.get(y)<micosto.get(y)){micosto.set(y, costovecino.get(y)+1);}
				}
			}
			
		}
		this.matricostos.set(nodo, micosto);
		this.pila.add(nodo);
		
	}
	/**
	 * Método que recorre todo la matriz por si la hacer recorridos
	 * dejamos nodos por fuera, así nos aseguramos que calculemos la 
	 * distancia de todos los nodos.
	 */
	public void cargarmatris(){
		int x;
		for(x=0; x<this.matrizini.size();x++){
			ArrayList<Double> fila= new ArrayList<Double>();
			this.matricostos.add(fila);
		}
		for( x=0; x<this.matrizini.size();x++){
			if(pila.contains(x)){continue;}else{this.cargarlargo(x);}
		}
	}
	/**
	 * Devuelve la matriz de distancia de todos con todos;
	 * primero se debe ejecutar el métedo cargarmatris()
	 * @return matris de costos
	 */
	public ArrayList<ArrayList<Double>> getCostos(){
		return this.matricostos;
	}
}
