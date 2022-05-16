package ex01;
//제너릭스를 통한 오류잡기
class apple2{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "apple";
	}
}

class orange2{
	@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "orange";
			}
}

class applebox{
	private apple2 ap;

	public apple2 getAp() {
		return ap;
	}

	public void setAp(apple2 ap) {
		this.ap = ap;
	}
}
class orangebox{
	private orange2 or;

	public orange2 getOr() {
		return or;
	}

	public void setOr(orange2 or) {
		this.or = or;
	}
}


class box<T>{
	private T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}
	
}
public class ex01 {

	public static void main(String[] args) {
		box<apple2> abox = new box<apple2>();
		box<orange2> obox = new box<orange2>();
		
		abox.setOb(new apple2());
		obox.setOb(new orange2());
		
		apple2 ap = abox.getOb();
		orange2 or = new orange2();
		
		System.out.println(ap);
		System.out.println(or);
		
		//제네릭을 통해 에러를 잡고 접근을 제어한다.
		//abox.setOb("new apple2()");
		
	}

}
