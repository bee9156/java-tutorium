package ss2011.aufgabe02;

import java.util.LinkedList;
import java.util.List;

public class UseAufgabe2 {
	public static void main(String[] args) {
		Complex c1 = new Complex(4, 5);
		Complex c2 = new Complex(7, 7);
		c1.addiere(c2);
		
		System.out.println(String.format("c1 neu: %s", c1.toString()));
		
		Vector3D v1 = new Vector3D(1,1,1);
		Vector3D v2 = new Vector3D(1,1,1);
		Vector3D v3 = new Vector3D(3,3,3);
		
		v1.addiere(v2);
		System.out.println(v2);
		
		List<Vector3D> liste = new LinkedList<Vector3D>();
		liste.add(v1);
		liste.add(v2);
		liste.add(v3);
		
		Vector3D v4 = Vector3D.summe3d(liste);
		
		System.out.println(v4);
	}
}
