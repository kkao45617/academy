package ex53;
import java.util.*;
public class ex53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		while(true) {
			System.out.println("10~99를 입력하세요");
			num=sc.nextInt();
			if(!(10<num&&99>num)) {
				System.out.println("다시입력하세요");
				continue;
			}else if(10<num &&99>num) {
				break;
			}
		}
		
		do {
			System.out.println("입력>>");
			num=sc.nextInt();
		}while(num<10||num>99);
		System.out.println(num);
		
		
	}

}
