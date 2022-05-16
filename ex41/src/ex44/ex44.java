package ex44;
import java.util.*;
public class ex44 {

	public static void main(String[] args) {

		System.out.println("나이를 입력하세요");
		int a=num();
		double c= sale(a);
		result(a,c);
	}
	static int num() {
		Scanner sc=new Scanner(System.in);
		int num =  sc.nextInt();
		
		return num;
	}
	
	
	static double sale(int age) {
		double count= 0;
		
		double a=0;
		if(0<=age && age<=3) {
			count=1;
		}
		else if(4<=age&&age<=13) {
			count=0.5;
		}
		else if(14<=age && age<=19) {
			count=0.25;
		}
		else if(20<=age&&age<=64) {
			count=0;
		}
		else if(65<=age) {
			count=1;
		}
		
		return count;
		
		
	}
	static void result(int num,double num2) {
		System.out.println("나이 : "+num+" 버스비 : "+(int)(2500-(2500*num2)));
	}

}
