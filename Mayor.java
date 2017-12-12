package tarea2;

import java.util.ArrayList;
import java.util.HashMap;


public class Mayor {
	protected ArrayList<Integer> Camino;
	protected ArrayList<ArrayList<Integer>> matrizdecostos;
	protected ArrayList<Integer> nodoenfrontera;
	protected HashMap<Integer,Integer> asigCaminos;
	protected ArrayList<Integer> pila;
	
	public Mayor(ArrayList<ArrayList<Integer>> matrizdecostos){
		this.matrizdecostos=matrizdecostos;
		this.Camino = new ArrayList<Integer>();
		this.nodoenfrontera= new ArrayList<Integer>();
		this.asigCaminos=new  HashMap<Integer,Integer>();
		this.pila = new ArrayList<Integer>(); 
	}
	
	
	public Integer maxdeNodo(Integer nodo){
		ArrayList<Integer> pesos= this.matrizdecostos.get(nodo);
		int x;
		Integer max=-1;
		for(x=0;x<pesos.size();x++){
			
			if(pila.contains(x)){continue;}else{
				if(max<pesos.get(x)){max=pesos.get(x);}
				
			}				
		}
		return max;
	}
	
	public Integer Nodomax(){
		Integer nodomax=0,max;
		max=-1;
		for(Integer nodo: this.nodoenfrontera ){
			if(max<maxdeNodo(nodo)){nodomax=nodo;max=maxdeNodo(nodo);}
			
		}
		if(max==-1){nodomax=this.matrizdecostos.size()-1;}
		return nodomax;
	}
	
	public void AsignarCamino(Integer Camino, Integer Nodo){
		ArrayList<Integer> vecinos = this.matrizdecostos.get(Nodo);
		int x;
		for(x=0;x<vecinos.size();x++){
			if(vecinos.get(x)==-1){continue;}else{
				this.asigCaminos.put(x, Camino);
			}
		}
	}
	 public void Cargarafrontera(Integer nodo){
		 ArrayList<Integer> pesos= this.matrizdecostos.get(nodo);
		 int x;
		 for(x=0;x<pesos.size();x++){
			 if(pesos.get(x)==-1){continue;}else{
				 if(nodoenfrontera.contains(x)){continue;}else{
				 this.nodoenfrontera.add(x);}
			 }
		 }
		 
	 }
	
	public void cargarinicio(){
		ArrayList<Integer>pesosde1= this.matrizdecostos.get(0);
		int x;
		for(x=0;x<pesosde1.size();x++){
			if(pesosde1.get(x)==-1){continue;}else{
				this.nodoenfrontera.add(x);
								
				
			}
		}
		
	}
	
	public ArrayList<Integer> caminolargo(){
		this.cargarinicio();
		
		Integer nodofinal= this.matrizdecostos.size()-1;
		Integer nodomax= this.Nodomax();
		Camino.add(0);
		while(nodomax!=nodofinal){
			
			
			nodomax= this.Nodomax();
			
			this.nodoenfrontera.clear();
			this.Cargarafrontera(nodomax);
			Camino.add(nodomax);
			
		}
		
		
		return Camino;
		
	}
}
