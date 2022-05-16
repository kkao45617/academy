package ez02;
//직접 예외처리를 만들어 제공한다.
import java.util.Scanner;

class readageexcption extends Exception{
	public readageexcption() {
		super("유효하지 않은 나이가 입력되었습니다.");
	}
}
public class ez02 {

	public static void main(String[] args) {
		System.out.println("나이 입력 :");
		
		try {
			int age =readage();
			System.out.println("입력된 나이 :" +age);
		}catch (readageexcption e) {
			System.out.println(e.getMessage());
		}
		
	}

	public static int readage() throws readageexcption {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if(age<0)
			throw new readageexcption();
		return age;
	}

}
