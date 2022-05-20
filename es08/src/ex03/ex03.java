package ex03;


class outer{
	private int num=0;
	class member{
		void add(int n) {
			num+=n;
		}
		int get() {
				return num;
		}
	}
	
	
}

public class ex03 {

	public static void main(String[] args) {
		outer out1 = new outer();
		outer out2 = new outer();
		
		outer.member o1 = out1.new member();
		outer.member o2 = out2.new member();
		
		o1.add(5);
		System.out.println(o1.get());
		
		o2.add(10);
		System.out.println(o2.get());
	}

}
