package ez09;
class point implements Cloneable{
	int x,y;
	point (int x, int y){
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "x="+x+", y="+y;
	}
	public Object clone() {
		Object obj=null;
		try{
			obj=super.clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return obj;
	}
}
public class ez09 {

	public static void main(String[] args) {
		point original = new point(3, 5);
		point copy = (point)original.clone();
		System.out.println(original);
		System.out.println(copy);
	}

}
