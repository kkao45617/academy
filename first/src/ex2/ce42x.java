package ex2;

import java.util.*;
public class ce42x {

	public static void main(String[] args) {
	int []a=new int[10];
	int sum=0;
	double avg=0.0;
	
	for(int i=0;i<10; i++) {
		a[i]=(int)((Math.random()*99)+1);
		sum+=a[i];
		System.out.println(a[i]);
	}
	avg=(double)sum/2;
	System.out.println("---------------");
	System.out.println(sum);
	System.out.println(avg);
	
	
	}

}
