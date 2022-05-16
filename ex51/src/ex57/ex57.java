package ex57;
import java.util.*;
//랜덤 함수 배치
public class ex57 {

	public static void main(String[] args) {
	Random rand =new Random(7);
	Scanner sc= new Scanner(System.in);
	
	System.out.println("배열 갯수 입력 :");
	int n= sc.nextInt();
	int [] b= new int[n];
	
	b[0]=rand.nextInt();
	
	for(int i=0; i<b.length; i++) {
		do{
			b[i]=rand.nextInt();
			}while(b[i]==b[i-1]);
		}
	System.out.println(Arrays.toString(b));
	
	}

}
