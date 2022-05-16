package ex22;
import java.util.*;
public class ex22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int max=0;
		int tmp=0;
		int conunt=0;
		
		for(int i=0; i<5+conunt; i++) {
		System.out.println("입력하세요 (0~100까지):");
		tmp = sc.nextInt();
		if(0<=tmp && tmp<=100) {
			if(max<=tmp)
				max=tmp;
			System.out.println("큰수"+max);
			}
		if(!(0<=tmp && tmp<=100)) {
		System.out.println("잘못입력하셨습니다.다시 입력하세요");
		conunt+=1;

			}
		}
		
		
		
		System.out.println("���� ū ��:"+max);

	}

}
