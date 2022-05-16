package ex42;

import java.util.Arrays;


//1. 1~100까지 총합과 평균 구하는 공식
//2. 1~100의 배수이면서 7의 배수 갯수 및 총합 출력

public class ex42 {

	public static void main(String[] args) {
		//ex42의 클래스를 초기화 하여서 이용하기 용이하게 만들기
		ex42 s=new ex42();
		//sum함수값을 불러오기
		s.sum();
		s.multi();
	}
	
	//void의 형태로 리턴의 값을 보내기보다는 프린트 문에서 값을 출력
	static void sum() {
		int a=0;

		for(int i=0; i<=100; i++) 
				a+=i;
		
		System.out.println("총합:"+a);
		System.out.println("평균:"+(a/100));
	}
	//이하 동문
	static void multi() {
		int count=0;
		int a=0;
		int num=0;
		int avg[]=new int[num];
	
			
			
			for(int i=0; i<=100;i++) {
				if(i%2==0 && i%7==0) {
					num++;
				}
				if(i%2==0 && i%7==0) {
				avg[count]=i;
				count++;
				a+=i;
				}
				
			
		}
		System.out.println("총합은 :"+a+"갯수는:"+count);
		System.out.println("���ڵ� "+Arrays.toString(avg));
		
	}
}
