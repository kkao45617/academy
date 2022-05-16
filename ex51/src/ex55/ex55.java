package ex55;
import java.util.*;
public class ex55 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int re=0;
		System.out.println("그 해 경과 일수를 구한다");
		do {
			System.out.printf("년 입력 : ");
			int year = sc.nextInt();
			System.out.printf("월 입력 : ");
			int month=sc.nextInt();
			System.out.printf("일 입력 : ");
			int day=sc.nextInt();
			System.out.printf("그 해 %d의 날입니다",dayofyear(year,month,day));
			System.out.println("반복(1), 취소(0)");
			re=sc.nextInt();
		}while(re==1);
	}
	
	static int[][] mday= {
			{31,28,31,30,31,30,31,30,31,30,31,30,31}
			,{31,29,31,30,31,30,31,30,31,30,31,30,31}
	};
	
	static int dayofyear(int year, int month, int day) {
		int days=day;
		for(int i=1;i<month; i++)
			days+=mday[isleap(year)][i-1];
		return days;
	}
	static int isleap(int year) {
		return (year%4==0&&year%100!=0 ||year %400==0)?1:0;
	}
}
