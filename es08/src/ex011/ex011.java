package ex011;


interface printable4 {
	void print(String s);
}
interface calculate {
	public int cal(int num1, int num2);
}
class caltor implements calculate{
	public int cal(int num1, int num2) {
		return num1+num2;
	}
}


public class ex011 {

	public static void main(String[] args) {
		//람다식
		
		calculate cc;
		cc =(int n,int y) -> n+y;
		cc.cal(5, 2);

	}

}
