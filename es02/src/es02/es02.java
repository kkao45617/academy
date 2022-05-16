package es02;
final class card{
	String kind;
	int num;
	
	card(){
		this("spade",1);
	}
	card(String kind,int num){
		this.kind=kind;
		this.num=num;
	}
	@Override
	public String toString() {
		return kind +":"+num;
	}
}
class es02 {

	public static void main(String[] args) throws Exception{
		card c = new card("heart",3);
		card c2 =card.class.newInstance();
		
		Class cobj=c.getClass();
//		Class cobj = Class.forName("es02.card");
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cobj.getName());
		System.out.println(cobj.toGenericString());
		System.out.println(cobj.toString());
	}

}

