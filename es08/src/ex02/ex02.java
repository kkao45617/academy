package ex02;
//nested 클래스와 inner클래스 
//nested--> static
/*inner
 *ineer -->>static xx
 * member inner class 
 * anonymous inner class
 */

class outer{
	private static int num=0;
	static class nested1{
		void add(int n) {
			num+=n;
		}
	}
	static class nested2{
		int get() {
			return num;
		}
	}
	
}


public class ex02 {

	public static void main(String[] args) {
		outer.nested1 nst1 = new outer.nested1();
		nst1.add(10);
		outer.nested2 nst2= new outer.nested2();
		System.out.println(nst2.get());
		
	}

}
