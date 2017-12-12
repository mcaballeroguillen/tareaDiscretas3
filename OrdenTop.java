package tarea2;

import java.util.ArrayList;
/**
 * Clase que calcula el orden topologíco de un grafo dirigido 
 * aciclico 
 * @author Marco Caballer
 *
 */
public class OrdenTop {
	protected ArrayList<ArrayList<Integer>>matris;
	protected ArrayList<Integer>pila;
	protected ArrayList<Integer>visitados;
	/**
	 * Constructor del Objeto
	 * @param matris: Matris de Adyacencia del Grafo
	 */
	public OrdenTop(ArrayList<ArrayList<Integer>> matris){
		this.matris=matris;
		pila= new ArrayList<Integer>();
		
	}
	/**
	 * Método que se posiciona en la fila de adyacencia de un nodo
	 * y lo carga a la fila, pero primero esperea que se carguen a las pilas 
	 * los nodos con los que el esta conectado.
	 * @param fila: Fila del nodo.
	 */
	public void cargarfila(Integer fila){
		
		
		ArrayList<Integer>vecinos= matris.get(fila);
		int x=0;
		for(x=0;x<vecinos.size();x++){
			Integer celda=vecinos.get(x);
			
			if(celda==0){continue;}
			else{
				if(pila.contains(x)){continue;}else{this.cargarfila(x);}
				
			}
			
		}
		
		pila.add(fila);
	}
	/**
	 * Método que carga todas las filas de la matris, por si al
	 * hacer un recorrido en profundidad, no llegamos a un nodo,
	 * pero se salta los nodos que ya estan en la pila.
	 */
	public void caragarmatris(){
		int totalnodos= matris.size();
		Integer x;
		for(x=0;x<totalnodos;x++){
			if(pila.contains(x)){continue;}
			if(pila.size()==totalnodos){break;}
			this.cargarfila(x);
		}
		
	}
/**
 * Construccion del orden Topologico 
 * @return Arreglo con el orden Topologico 
 */
	public ArrayList<Integer> ordentopologico(){
	ArrayList<Integer> orden = new ArrayList<Integer> ();
	int x;
	for(x=0;x<pila.size();x++){
		orden.add(pila.indexOf(x));
	}
	return orden;
		
	}
	
}
