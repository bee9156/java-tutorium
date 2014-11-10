package simple;

public class SimpleClass {

	// Attribute
	public int a;
	public double b;
	public int c;
	public String name;
	
	// Konstruktoren
	SimpleClass(){
		// Standardwerte müssen vergeben werden
		a = 0;
		b = 0.0;
		c = 0;
		name = "unbenannt";
	}
	
	SimpleClass(int a, double b, int c, String n){
		this.a = a;
		this.b = b;
		this.c =c;
		name = n;
	}
	
	SimpleClass(SimpleClass other){
		a = other.a;
		b = other.b;
		c = other.c;
		name = other.name;
	}
	
	public void swapAC(){
		int buf = c;
		c = a;
		a = buf;
	}
	
	public void swapAC(SimpleClass other){
		swapAC(); other.swapAC(); swapAC();
	}
	
	public static void switchAttribs(SimpleClass first, SimpleClass second){
		SimpleClass tmp = new SimpleClass(first);
		
		first.a = second.a;
		first.b = second.b;
		first.c = second.c;

		second.a = tmp.a;
		second.b = tmp.b;
		second.c = tmp.c;
		
	}
	
	public void add(SimpleClass other){
		a += other.a;
		c += other.c;
	}
	
	public double distance(SimpleClass other){
		int dA = (a - other.a);
		int dC = (c - other.c);
		
		return Math.sqrt(dA*dA + dC*dC);
	}
	
	public void output(){
		System.out.println(a + ":" + c);
	}
	
	public String toString() {
		return String.format("%s hat folgende Werte: a = %d, b = %f, c = %d", name, a, b, c);
	}
	
	public String toStringFixed(){
		return String.format("%s hat folgende Werte: a = %03d, b = %5.2f, c = %2d", name, a, b, c);
	}
	
	public static void main(String[] args) {
		SimpleClass s1 = new SimpleClass();
		SimpleClass s2 = new SimpleClass(1, 0.4, 5, "Bsp2");
		SimpleClass s3 = new SimpleClass();
		SimpleClass s4 = new SimpleClass(1, 0.497465924659, 5, "Bsp4");
		
		s3.name = "Bsp3";

		System.out.println(s4);
		System.out.println(s4.toStringFixed());
		s4.output();
		
		System.out.println(s2);
		System.out.println(s2.toStringFixed());
		s2.output();
		
		/*System.out.println(s3);
		System.out.println(s3.toStringFixed());
		s3.output();
		System.out.println(s4);
		System.out.println(s4.toStringFixed());
		s4.output();
		
		s1.add(s2);
		System.out.println(s1);
		System.out.println(s1.toStringFixed());
		s1.output();
		
		SimpleClass.switchAttribs(s2, s3);
		
		System.out.println(s2);
		System.out.println(s2.toStringFixed());
		s2.output();
		System.out.println(s3);
		System.out.println(s3.toStringFixed());
		s3.output();*/
	}

}
