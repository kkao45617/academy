package ex81;
class blocktest{
	static {
		System.out.println("static{}");
	}
	{
		System.out.println("{ }");
	}
	public blocktest() {
		System.out.println("»ý¼ºÀÚ");
	}
}
public class ex81 {

	public static void main(String[] args) {
		System.out.println("blocktest bt= new blocktest();");
		blocktest bt= new blocktest();
		System.out.println("blocktest bt2=new blocktest();");
		blocktest bt2= new blocktest();
	}

}
