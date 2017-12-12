package tarea2;

import java.util.ArrayList;

public class MainP3 {

	public static void main(String[] args){
		ArrayList<Integer> a= new ArrayList<Integer>();
		ArrayList<Integer> b= new ArrayList<Integer>();
		ArrayList<Integer> c= new ArrayList<Integer>();
		ArrayList<Integer> d= new ArrayList<Integer>();
		ArrayList<Integer> e= new ArrayList<Integer>();
		ArrayList<Integer> f= new ArrayList<Integer>();
		ArrayList<Integer> g= new ArrayList<Integer>();
		ArrayList<Integer> h= new ArrayList<Integer>();
		a.add(-1);a.add(9);a.add(6);a.add(4);a.add(-1);a.add(-1);a.add(-1);a.add(-1);
		b.add(-1);b.add(-1);b.add(5);b.add(-1);b.add(-1);b.add(-1);b.add(-1);b.add(-1);
		c.add(-1);c.add(-1);c.add(-1);c.add(-1);c.add(3);c.add(5);c.add(-1);c.add(-1);
		d.add(-1);d.add(-1);d.add(-1);d.add(-1);d.add(-1);d.add(1);d.add(-1);d.add(-1);
		e.add(-1);e.add(-1);e.add(-1);e.add(-1);e.add(-1);e.add(-1);e.add(1);e.add(-1);
		f.add(-1);f.add(-1);f.add(-1);f.add(-1);f.add(-1);f.add(-1);f.add(3);f.add(-1);
		g.add(-1);g.add(-1);g.add(-1);g.add(-1);g.add(-1);g.add(-1);g.add(-1);g.add(5);
		h.add(-1);h.add(-1);h.add(-1);h.add(-1);h.add(-1);h.add(-1);h.add(-1);h.add(-1);
		
		ArrayList<ArrayList<Integer>>matris= new ArrayList<ArrayList<Integer>>();
		matris.add(a);matris.add(b);matris.add(c);matris.add(d);matris.add(e);
		matris.add(f);matris.add(g);matris.add(h);
		Mayor mayorcamino= new Mayor(matris);
		ArrayList<Integer> camino = mayorcamino.caminolargo();
		System.out.println("EL mejor camino es: " + camino.toString());
		
	}
	
	
}
