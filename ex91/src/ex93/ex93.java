package ex93;
//abstract 를 이용한 생성자를 통하여 활용법 and 생성자와 extends 를 이용한 상속관계 이용
abstract class shape{
	point p;
	shape() {
		this(new point(0,0));
	}
	shape(point p) {
		this.p=p;
	}
	abstract double calcarea();
	
	point getposition() {
		return p;
	}
	void setpoistion(point p) {
		this.p=p;
	}
}
class point {
	int x,y;
	point(){this(0,0);}
	point(int x, int y){
		this.x=x;
		this.y=y;
	}
	public String toString() {
		return "["+x+","+y+"]";
	}
}
class circle extends shape {
	double r;
	public circle() {}
	public circle(double r) {
		super(new point(0,0));
		this.r=r;
	}
	public circle(point p,double r) {
		super(p);
		this.r=r;}
	boolean circle() {
		return true;
	}

	@Override
	double calcarea() {
		
		return Math.PI*r*r;
	}
}
class rectangle extends shape{
	double width;
	double height;
	public rectangle(double width, double height) {
		//this.width=width;
		//this.height=height;
		this(new point(0,0),width,height);
	}
	public rectangle(point p, double width, double height) {
		super(p);
		this.width=width;
		this.height=height;
	}
	public rectangle() {
		this(new point(0,0),0,0);
	}

	@Override
	double calcarea() {
		
		return width*height;
	}
	boolean issquare(double a, double b) {
		if(width==height &&width*height!=0)
			return true;
		else
			return false;
	}
}


public class ex93 {

	public static void main(String[] args) {
		shape cir = new circle();
		
		shape cir2 = new circle(new point(1,2),3);
		
		shape s3 = new circle(5);
		
		System.out.println(cir2.calcarea());
		
		System.out.println(s3.calcarea());
		
		shape r = new rectangle();
		shape r2 = new rectangle(150,100);
		shape r3 = new rectangle(new point(100,100),150,50);
		System.out.println("=======================");
		System.out.println(r.calcarea());
		System.out.println(r2.calcarea());
		System.out.println(r3.calcarea());
		
	}

}