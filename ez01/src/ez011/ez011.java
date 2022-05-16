package ez011;

public class ez011 {

	public static void main(String[] args) throws CloneNotSupportedException {
		rectangle org = new rectangle(1, 1, 8, 8);
		rectangle cpy;
		
		cpy = (rectangle) org.clone();
		org.showpostion();
		cpy.showpostion();
		
		
		org.changepos(3, 3, 7, 7);
		org.showpostion();
		cpy.showpostion();
	}

}
class rectangle implements Cloneable{
	private point upperleft;
	private point lowerright;
	
	public rectangle(int x1, int y1, int x2, int y2) {
		upperleft = new point(x1,y1);
		lowerright = new point(x2,y2);
	}
	public void changepos(int x1, int y1,int x2,int y2) {//좌표수정
		upperleft.changepos(x1, y1);
		lowerright.changepos(x2, y2);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	public void showpostion() {//사각형 좌표 출력
		System.out.println("좌측 상단");
		upperleft.showposiotion();
		System.out.println("우측하단");
		lowerright.showposiotion();
	}
}

class point implements Cloneable{
	private int xpos;
	private int ypos;
	
	public point(int x, int y) {
		xpos = x; ypos = y;
	}
	public void changepos(int x, int y) {
		xpos = x;
		ypos = y;
	}
	public void showposiotion() {
		System.out.println("["+xpos+","+xpos+"]");
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}