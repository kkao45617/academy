package ex05;
import java.util.*;


public class ex04 {

	public static void main(String[] args) {
		int num=1;
		int num2=0;
		num2= 2+num++;
		System.out.println(num+","+num2);
				
	int i=10;
	int j=0;
	i=i-1;
	i-=1;
	
	i--;
	--i;
	System.out.println(i);
	j=i--;
	System.out.println(j+","+i);
	}

}
