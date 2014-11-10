
public class Student extends Mensch{
	// Attribute 
	
	String Matnr;
	boolean b2;
	
	// Konstruktor 
	
	Student(){
		super();
		Matnr = "";
		b2 = false;
	}
	
	Student(String name, double gewicht, boolean d, String mnr){
		super(name, gewicht,d);
		
		b2 = true;
		Matnr = mnr;
	}
	
	// getter / setter
	
	// public meths
	
	// private meths
	
	public static void main (String[] args){
		
		Mensch[] m = {new Student()};
		int x = 0;
		for(Mensch me : m){
			x += me.gewicht;
		}
		
		Student[] arr = {new Student(), new Student() };
		
		
		for (Student s : arr){
			System.out.println(s);
		}
		
	}
}
