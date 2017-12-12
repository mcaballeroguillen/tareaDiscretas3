package tarea2;

import java.util.ArrayList;

public class MainP2 {

	public static void main(String[] args){
		//Construcción de la matris de adyacensia
		ArrayList<Integer> a= new ArrayList<Integer>();
		ArrayList<Integer> b= new ArrayList<Integer>();
		ArrayList<Integer> c= new ArrayList<Integer>();
		ArrayList<Integer> d= new ArrayList<Integer>();
		ArrayList<Integer> e= new ArrayList<Integer>();
		ArrayList<Integer> f= new ArrayList<Integer>();
		ArrayList<Integer> g= new ArrayList<Integer>();
		ArrayList<Integer> h= new ArrayList<Integer>();
		a.add(0);a.add(1);a.add(0);a.add(1);a.add(0);a.add(0);a.add(0);a.add(0);
		b.add(0);b.add(0);b.add(0);b.add(0);b.add(1);b.add(0);b.add(0);b.add(0);
		c.add(0);c.add(1);c.add(0);c.add(0);c.add(0);c.add(1);c.add(0);c.add(0);
		d.add(0);d.add(0);d.add(1);d.add(0);d.add(0);d.add(0);d.add(0);d.add(0);
		e.add(0);e.add(0);e.add(0);e.add(0);e.add(0);e.add(1);e.add(1);e.add(0);
		f.add(0);f.add(0);f.add(0);f.add(0);f.add(0);f.add(0);f.add(0);f.add(0);
		g.add(0);g.add(0);g.add(0);g.add(0);g.add(0);g.add(0);g.add(0);g.add(1);
		h.add(0);h.add(0);h.add(0);h.add(0);h.add(0);h.add(0);h.add(0);h.add(0);
		
		ArrayList<ArrayList<Integer>>matris= new ArrayList<ArrayList<Integer>>();
		matris.add(a);matris.add(b);matris.add(c);matris.add(d);matris.add(e);
		matris.add(f);matris.add(g);matris.add(h);
		
		//Crear un Objeto que calcula el orden topologico 
		OrdenTop orden = new OrdenTop(matris);
		orden.caragarmatris();
		ArrayList<Integer> output= orden.ordentopologico();
		//mostrar respuesta en consola 
		System.out.println("Un orden topológico es "+ output.toString());
		
		Costos costos = new Costos(matris);
		costos.cargarmatris();
		ArrayList<ArrayList<Double>> output1= costos.getCostos();
		System.out.println("Los distancia entre nodos es: ");
		System.out.println(output1.toString());
	}
}
