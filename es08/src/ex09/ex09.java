package ex09;

interface printable {
	void print(String s);
}


public class ex09 {

	public static void main(String[] args) {
		printable prn = new printable() {
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn.print("java is lambda!!");
	}

}
