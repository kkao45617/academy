package questack1;
import java.util.*;
public class questack1 {
	public static Stack back = new Stack();
	public static Stack forward = new Stack();
	
	public static void main(String[] args) {
		gourl("1.네이트");
		gourl("2.야후");
		gourl("3.네이버");
		gourl("4.다음");
		
		
		printstatus();
		goback();
		System.out.println();
		System.out.println("=뒤로 버튼을 누른후 =");
		printstatus();		
		goback();
		System.out.println();
		System.out.println("=뒤로 버튼을 누른후=");
		printstatus();
		gourl("codechobo.com");
		System.out.println();
		System.out.println("=새로운 주소로 이동후=");
		printstatus();
	}
	public static void printstatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("현재화면은"+back.peek()+"입니다");
	}
	public static void gourl(String url) {
		back.push(url);
		if(!forward.empty())
			forward.clear();
	}
	public static void goforward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	public static void goback() {
		if(!back.empty())
			forward.push(back.pop());
	}

}
