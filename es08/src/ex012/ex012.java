package ex012;


interface printable3 {
	void print(int s);
}

class printer implements printable3{
	public void print(int s) {
		System.out.println(s);
	}
}

public class ex012 {

	public static void main(String[] args) {
		//람다식
		printable3 prn = (s)-> System.out.println(s+2);
		prn.print(3);
	}

}
