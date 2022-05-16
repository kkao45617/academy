package ez05;
//finally 를 통하여 강제적으로 실행시키는 구문
public class ez05 {

	public static void main(String[] args) {
		int a=100;
		int b;
		
		try {
			b=a/10;
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("무조건 실행");
		}
		
		System.out.println("asdfasdfa");
	}
	
}
