package ex65;

public class ex65 {

	public static void main(String[] args) {
		variables var = new variables();
		
		var.iv++;
		var.cv++;
		System.out.println(var.iv);
		System.out.println("cv "+var.cv);
		
		variables var2 = new variables();
		var2.iv++;
		var2.cv++;
		System.out.println(var2.iv);
		System.out.println("cv2 "+var.cv);
		
		variables var3 = new variables();
		var3.iv++;
		var3.cv++;
		System.out.println(var3.iv);
		System.out.println("cv2 "+var3.cv);
		
		System.out.println("-----------");
		
		variables var4= new variables();
		System.out.println(var4.iv);// 클래스 변수는 객체 생성하지 않고 접근가능 이유는 객체생성 전에 메모리 공간이 올라가 있음
		
	}

}

class variables{
	int iv;//인스턴스변수
	static int cv;//클래스 변수
	
	void method() {
		int lv=0;//지역변수
	}
}