package ex013;


interface calculate {
	public int cal(int num1, int num2);
}

class caltor implements calculate{
	public int cal(int x, int y) {
		return x*y;
	}
}


public class ex013 {

	public static void main(String[] args) {
		//람다식
		calculate cc;
		cc =(int n,int y) -> n*y;
		System.out.println(cc.cal(3, 4));
		
		
		 calculate a= new caltor();
		 int b=a.cal(3, 4);
		 System.out.println(b);
	}

}
