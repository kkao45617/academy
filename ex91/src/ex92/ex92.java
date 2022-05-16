package ex92;

public class ex92 {

	public static void main(String[] args) {
		product pro= new tv();
		pro.func();
		
		Object obj= new tv();
		
		System.out.println(obj.toString());
	}

}


abstract class product{
	int price;
	product(int price){
		this.price=price;
	}
	void test() {
		System.out.println("product");
	}
	abstract void func();//Ãß»ó¸Þ¼Òµå
}
class tv extends product{
	tv(){super(100);}
	public String toString() {return "tv";}
	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("tv");
	}
}
class computer extends product{
	computer(){super(200);}
	
	public String toString() {return "computer";}

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("computer");
	}
}
class audio extends product{
	audio(){super(50);}
	
	public String toString() {return "audio";}

	@Override
	void func() {
		// TODO Auto-generated method stub
		System.out.println("audio");
	}
}