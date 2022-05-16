package ez01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ez01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("입력하세요");
		
		int sum=0;
		
		try {
		
		int num=sc.nextInt();
		int a=10/num;
		}
		catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		for(int i=0;i<=100; i++)
			sum+=i;
		System.out.println("sum"+sum);
		
		}
		

}


