package ex04;

import java.util.*;


interface Printable{
	void print();
}
class papers{
	private String con;
	public papers(String s) {
		con=s;
	}
	public Printable getprinter() {
		return new printer2();
	}
	private class printer implements Printable{
		public void print() {
			System.out.println("1  " +con);
		}
	}
	private class printer2 implements Printable{
		public void print() {
			System.out.println("2  "+con);
		}
	}
}

public class ex04 {

	public static void main(String[] args) {
		papers p = new papers("masssge");
		Printable prn = p.getprinter();
		prn.print();
		
		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("bbb");
		list.add("cccc");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
	}

}
