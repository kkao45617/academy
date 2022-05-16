package ex56;
//중복이 안돼는 함수
import java.util.Arrays;
import java.util.Random;
import java.util.*;

public class ex56 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("입력하세요");
		int num=sc.nextInt();
		int[] n = new int[num];
		int count=0;
		
		for(int i=0;i<n.length;i++) {
			n[i]+=(int)(Math.random()*10);
			for(int j=0;j<i;j++) {
				if(n[i]==n[j]) {
					n[i]=0;
					i--;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(n));
		
	}

}
