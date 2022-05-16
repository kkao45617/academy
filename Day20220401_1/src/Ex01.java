import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 정수형 byte, short, int, long
		//		 1		2	  4	 	8
		//bit(0,1)
		//byte (8bit)
		//Kbyte (1024byte)
		//Mbyte (1024kbyte)
		//Gbyte (1024mbyte)
		
		//byte(1) -128 ~ 127
		//short(2) -32,768 ~ 32,767
		//int(4)  -2147483648 - 2147483647
		
		
		//int age = 10;
		
		int a = 10;
		int b = 20;
		
		
		System.out.println("before a : " + a);
		System.out.println("before b : " + b); //sysout 입력후 + ctrl + space
		
		//
		
		int c; 
		c = a; 
		a = b; 
		b = c;

		
		//
		
		
		System.out.println("a + b : " + a + b);
		System.out.println("a + b : " + (a + b));
	
		
		int age = 20;
		int max = 100;
		System.out.println("age : " + age + "," +  "max : " + max);
		
		//					"age : " + "20" ==> age : 20
		System.out.printf("age : %d, max : %d\n ", age, max);
		System.out.printf("age : %o, max : %o\n ", age, max);
		System.out.printf("age : %x, max : %x\n ", age, max);
		
		
		//  이름, 나이 출력.
		
		int age2 = 20;
		String name;
		
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		
		
		System.out.printf("name : %s, age2 : %d\n",name, age2);
		System.out.println("name : " + name + ", age2 : " + age2);
	}
}


