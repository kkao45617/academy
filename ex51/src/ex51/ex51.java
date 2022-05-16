package ex51;
//입력한 수중 가장 큰것은
import java.util.*;
public class ex51 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		int max = 0,min = 0,med = 0;
		System.out.println("1번째 입력하세요");
		num1 = sc.nextInt();
		System.out.println("2번째 입력하세요");
		num2=sc.nextInt();
		System.out.println("3번째 입력하세요");
		num3=sc.nextInt();
		
		if(num1>num3&&num1>num2) {
			System.out.println("max"+num1);
		}else if(num2>num3&&num2>num1) {
			System.out.println("max"+num2);
		}else
			System.out.println("max"+num3);
		
		System.out.println("-------------------");
		
		if(num2>num1) {
			if(num2>num3) {
				max=num2;
				if(num1>num3) {
					med=num1;
					min=num3;
				}
				else {
					med=num3;
					min=num1;
				}
			}
			else {
				max=num3;
				med=num2;
				min=num1;
			}
		}else if(num3>num1)
			max=num3;
		
		
		
		System.out.println(max+","+med+","+min);
		
		System.out.println("--------------------------------");
		
		
		}

}