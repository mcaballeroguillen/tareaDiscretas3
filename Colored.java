package tarea2;

import java.util.ArrayList;
/**
 * Clase que Colorea Un Grafo con dos Colores(Azul y Rojo)
 * Comenzanod con Azul
 * @author Marco Caballero
 *
 */
public class Colored {
	protected String Color ="azul";
	public Integer Colornumber = 0;
	protected String[] Colores ={"azul","rojo"};
	protected ArrayList<Nodo> grafo;
	
	/**
	 * Para construir cun coloreador, este necesita tener como parametro un
	 * grafo al que colorear.
	 * @param grafo: Arreglo que Contiene los nodos para poder acceder a un grafo
	 * si el grafo no es conexo este arreglo debe tener un nodo de cada componente conexa.
	 */
	public Colored(ArrayList <Nodo> grafo){
		this.grafo=grafo;
	}
	/**
	 * Método que cambia el colore activo del coloreador
	 * @param i: Número del color a cambiar.
	 */
	public void changecolor(Integer i){
		this.Color= this.Colores[i];
		
	}
	
	/**
	 * Métedo que Colorea el Grafo.
	 */
	public void star(){
		for(Nodo nod: grafo){
			if(nod.getColor()=="append"){
			nod.changeColor(Color);break;}
			if(nod.getColor()==this.Color){return;}
			else{
			System.out.println("No es 2-coloreable");
			
			}
			}
		for(Nodo nod: grafo){
			Colored color2= new Colored(nod.getVecinos());
			Integer tempnum=1-this.Colornumber;
			color2.Colornumber=tempnum;
			color2.changecolor(tempnum);
			color2.star();
			
		}
		
	
		
	}
}
