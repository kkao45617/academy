package ex78;
//private 생성자 호출 방법
public class ex78 {

	public static void main(String[] args) {
		car c1=new car();
		car c2=new car();
		car c3=new car();
		c1.num++;
		
		System.out.println(c1.num);
		System.out.println(c2.num);
		System.out.println(c3.num);
		car2 c10 = car2.getinstace();
		System.out.println(c10.num);
		
	}

}


class car{
	int num=10;
	public car() {
		
	}
}

class car2{
	private static car2 abc=null;
	
	int num=100;
	private car2() {
	}
	static car2 getinstace() {
		if(abc==null)
			abc=new car2();//생성자 호출
		return abc;
	}
}
// 1. 일반적으로 객체 생성할 대 생성자 통해서 객체 생성한다.
// 2. 싱글톤은 생성자 private >> 외부접근 금지
// 3. 어떻게 접근할 것인가??==> getinstance 메소드에서 객체를 생성하고 있다.
// 4. 외부에서 객체를 생성하려면 getinstance 통해서만 가능하다
// 5. getinstance 도 메소드이기 때문에 외부에서 접근하려면 객체를 생성하고 접근해야한다.
// 6. static 메소드는 객체를 생성하지 않고서도 접근 가능하다. 따라서 getinstance를 static 메소드로 변경한다.
// 7.getinstance static 메소드에서 객체를 생성해서 참조변수 car2에게 생성된 객체 주소값을 넘겨준다.
// 8. Car2 car2이 아이는 어떻게 설정해야되는가?==>static으로 static변수(클래스변수로 설정)