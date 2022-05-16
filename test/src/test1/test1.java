package test1;

import java.util.Arrays;

public class test1 {

	public static void main(String[] args) {
		int count=1;
		int a=0;
		int num=0;
		int avg[]=new int[count+1];
		
		for(int i=0; i<=100;i++) {
			if(i%2==0 && i%7==0) {
			avg[num]=i;
			num++;
			count++;
			a+=i;
			}
		}
		System.out.println("ÃÑÇÕÀº :"+a+"°¹¼ö´Â:"+count);
		System.out.println("¼ıÀÚµé "+Arrays.toString(avg));

	}

}
