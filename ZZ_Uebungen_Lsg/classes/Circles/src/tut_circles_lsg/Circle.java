package tut_circles_lsg;

public class Circle {
	
	// Attributes
	double xCoord;
	double yCoord;
	double radius;
	
	// constructors
	Circle(){
		setX(0);
		setY(0);
		setR(1);
	}
	
	Circle(double x, double y, double r){
		setX(x);
		setY(y);
		setR(r);
	}
	
	// setter
	public void setR(double r){
		if (r <= 0){
			radius = 1;
		} else {
			radius = r;
		}
	}
	
	public void setX(double x){
		xCoord = x;
	}
	
	public void setY(double y){
		yCoord = y;
	}
	
	public void setFromCircle(Circle c){
		setR(c.getR());
		setX(c.getX());
		setY(c.getY());
	}
	
	// getter
	public double getR(){
		return radius;
	}
	
	public double getX(){
		return xCoord;
	}
	
	public double getY(){
		return yCoord;
	}
	
	// public methods
	public double getFlaeche(){
		return Math.PI*getR()*getR();		// pi*r²
	}
	
	public double getUmfang(){
		return 2*Math.PI*getR();			// 2 * pi * r
	}
	
	public boolean contains(double x, double y){
		double dx;
		double dy;
		
		if (x > getX()){
			dx = x-getX();
		} else {
			dx = getX()-x;
		}

		if (y > getY()){
			dy = y-getY();
		} else {
			dy = getY()-y;
		}
		
		if (Math.sqrt(dx*dx+dy*dy) < getR()){
			// punkt enthalten
			return true;
		} else {
			//punkt nicht enthalten
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
