package tarea2;

import java.util.ArrayList;
/**
 * Clase que Representa Un Nodo
 * @author Marco Caballero
 *
 */
public class Nodo {
	protected ArrayList<Nodo> vecinos;
	protected String color;
	/**
	 * Constructor, donde se crea un arreglo con sus vecinos, y que el nodo 
	 * actualmete no tiene color.
	 */
	public Nodo(){
		vecinos = new ArrayList<Nodo>();
		color= "append";
		
		
	}
	/**
	 * Devuelve un Arreglo con Sus vecinos
	 * @return Arreglo de Vecinos
	 */
	public ArrayList<Nodo> getVecinos(){
		return this.vecinos;
	}
	/**
	 * Devuleve el Color actual de Nodo.
	 * @return Color con el que esta coloreado 
	 */
	public String getColor(){
		return this.color;
					
	}
	/**
	 * Agrega un Nuevo Vecino, se usa para enlazar nodos.
	 * @param nodo: Nuevo Vecino
	 */
	public void addVecino(Nodo nodo){
		this.vecinos.add(nodo);
		
	}
	/**
	 * Cambia el Color
	 * @param newcolor : color a cambiar
	 */
	public void changeColor(String newcolor){
		this.color= newcolor;
		
	}

}
