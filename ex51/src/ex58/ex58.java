package ex58;
//랜덤함수
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
public class ex58 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Random rand= new Random();
		int count=0;
		System.out.println("입력하세요");
		int num=sc.nextInt();
		
		int[] n = new int[num];
		
		for(int i=0;i<(n.length)+count;i++) {
			n[i]+=rand.nextInt(10);
			for(int j=0;j<i;j++) {
				if(n[i]==n[j]) {
					n[i]=0;
					count++;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(n));
		

	}

}
