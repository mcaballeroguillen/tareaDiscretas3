package tarea2;

import java.util.ArrayList;

public class MainP1 {
	
	
	public static void main(String[] args){
		//Se crean los nodos necesarios.
		Nodo A= new Nodo(); Nodo A1= new Nodo();
		Nodo B= new Nodo(); Nodo B1= new Nodo();
		Nodo C= new Nodo(); Nodo C1= new Nodo();
		Nodo D= new Nodo(); Nodo D1= new Nodo();
		//Se enlasan los nodos del grafo1
		A.addVecino(B);A.addVecino(C);
		B.addVecino(D);B.addVecino(A);
		C.addVecino(A);C.addVecino(D);
		D.addVecino(B);D.addVecino(C);
		//Se enelasan los nodos del grafo2
		A1.addVecino(B1);A1.addVecino(C1); A1.addVecino(D1);
		B1.addVecino(A1);B1.addVecino(D1);
		C1.addVecino(A1);C1.addVecino(D1);
		D1.addVecino(C1);D1.addVecino(B1);D1.addVecino(A1);
		
		
		//Se contruye un arreglo con un nodo para acceder al grafo
		ArrayList<Nodo> Grafo1= new ArrayList<Nodo>();
		ArrayList<Nodo> Grafo2= new ArrayList<Nodo>();
		
		Grafo1.add(A);
		Grafo2.add(A1);
		
		//Se construyen los coloriadores
		Colored coloriador1= new Colored(Grafo1);
		Colored coloriador2= new Colored(Grafo2);
	
		//Se manda a coloriar, si el sistem no impre nada el grafo es dos-coloriable
		System.out.println("Se mando a Colorear el Grafo 1");
		 coloriador1.star();
		 System.out.println("Se mando a Colorear el Grafo 2");
		 coloriador2.star();
	
		
		
	}
	
	

}
