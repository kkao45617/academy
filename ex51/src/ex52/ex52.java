package ex52;
import java.util.*;
//함수 이용한 max계산
public class ex52 {
	static int num1,num2,num3;
	
	public static void main(String[] args) {
		count();
		max(num1,num2,num3);
		
		
	}
	static void count() {
		Scanner sc=new Scanner(System.in);
		System.out.println("입력하세요");
		num1=sc.nextInt();
		System.out.println("입력하세요");
		num2=sc.nextInt();
		System.out.println("입력하세요");
		num3=sc.nextInt();
		
	}
	
	static void max(int a, int b, int c) {
		if(num1>num3&&num1>num2) {
			System.out.println("max"+num1);
		}else if(num2>num3&&num2>num1) {
			System.out.println("max"+num2);
		}else
			System.out.println("max"+num3);
	}
	
	
	

}
