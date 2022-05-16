package es06;
//토크나이져를 통하여 저장되어 있는 스트링값 변수에서 특정한 부분을 잘라서 출력해준다.
import java.util.StringTokenizer;

public class es06 {

	public static void main(String[] args) {

		String source = "100,200,300,400,500";
		StringTokenizer st= new StringTokenizer(source,"0");
		
		
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
