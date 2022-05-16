package ex66;

public class ex66 {

	public static void main(String[] args) {
		System.out.println("card.width"+card.width);
		System.out.println("card.height"+card.height);
		
		card c1=new card();
		c1.kind="heart";
		c1.number=7;
		
		card c2 = new card();
		c2.kind = "spade";
		c2.number = 4;
		
		System.out.println("c1 은"+c1.kind+","+c1.number+"크기는"+c1.width+","+c1.height);
		System.out.println("c2 은"+c2.kind+","+c2.number+"크기는"+c2.width+","+c2.height);
		
		System.out.println("변경후");
		c1.width=50;
		c2.height=80;
		
		System.out.println("c1 은"+c1.kind+","+c1.number+"크기는"+c1.width+","+c1.height);
		System.out.println("c2 은"+c2.kind+","+c2.number+"크기는"+c2.width+","+c2.height);
		
	}

}

class card{
	String kind;
	int number;
	static int width=100;
	static int height=250;
}