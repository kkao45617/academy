package ex41;
import java.util.*;
public class ex41 {

	public static void main(String[] args) {
		int money=2500;
		int count=0;
		System.out.println("나이 입력");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(0<=age && age<=3) {
			count=1;
		}
		else if(4<=age&&age<=13) {
			count=2;
		}
		else if(14<=age && age<=19) {
			count=4;
		}
		else if(20<=age&&age<=64) {
			count=5;
		}
		else if(65<=age) {
			count=6;
		}
		
		switch(count) {
		case 1:
			money=money-(money*1);
			break;
		case 2:
			money=(int)(money-(money*0.5));
			break;
		case 3:
			money=(int)(money-(money*0.25));
			break;
		case 4:
			money=(int)(money-(money*0.25));
			break;
		case 5:
			money=money;
			break;
		case 6:
			money=money-(money*1);
			break;
			
			
			
		}
		
		
		System.out.println("나이:"+age+"\t"+"버스비:"+money);

		
		
	}

}
