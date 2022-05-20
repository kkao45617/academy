package ex05;

interface Printable{
	void print();
}
class papers{
	private String con;
	public papers(String s) {
		con=s;
	}
	
	public Printable getprinter(){
		
		//local 클래스
		class printer implements Printable {
			public void print() {
			System.out.println("1  " +con);
			}
		}
		return new printer();
	}
	
}
public class ex05 {

	public static void main(String[] args) {
		papers p = new papers("masssge");
		Printable prn = p.getprinter();
		prn.print();
		
	}

}
