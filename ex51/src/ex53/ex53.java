package ex53;
import java.util.*;
public class ex53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		while(true) {
			System.out.println("10~99�� �Է��ϼ���");
			num=sc.nextInt();
			if(!(10<num&&99>num)) {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}else if(10<num &&99>num) {
				break;
			}
		}
		
		do {
			System.out.println("�Է�>>");
			num=sc.nextInt();
		}while(num<10||num>99);
		System.out.println(num);
		
		
	}

}
