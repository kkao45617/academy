package ez08;
class card{
	String kind;
	int number;
	card(){
		this("spade",1);
	}
	card(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	
	@Override
	public String toString() {
		return "kind:"+kind+"  number:"+number;
	}
}
public class ez08 {

	public static void main(String[] args) {
		card c1=new card("red",10);
		card c2 = new card();
		System.out.println(c1);
		System.out.println(c2.toString());
	}

}
