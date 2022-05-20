package ex06;

interface Printable{
	void print();
}
class papers{
	private String con;
	public papers(String s) {
		con=s;
	}

	public Printable getprinter() {//익명클래스
		return new Printable() {//익명클래스 정의 와 인스턴스 생성
			public void print() {
				System.out.println(con);
			}
		};
	}
	
}

public class ex06 {

	public static void main(String[] args) {
		papers p = new papers("masssge");
		Printable prn = p.getprinter();
		prn.print();
		
	}

}
