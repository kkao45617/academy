package ez03;
//강제적으로 예외처리 시키는 경우
public class ez03 {

	public static void main(String[] args) throws Exception {
		
		try {
			method1();
		}catch (Exception e) {
			System.out.println("main메서드에서 예외 처리가 되었습니다");
			e.printStackTrace();
		}
	}
	static void method1() throws Exception{
		throw new Exception();
	}
}
