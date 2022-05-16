package ex312;

import java.util.Arrays;

public class ex312 {

	public static void main(String[] args) {
		int[] numarr= new int[10];
		int[] counter=new int[10];
		
		for(int i=0; i<numarr.length;i++) {
			numarr[i]=(int)(Math.random()*10);
			System.out.print(numarr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numarr.length;i++) {
			counter[numarr[i]]++;
		}
	
		for(int i=0; i<numarr.length;i++) {
			System.out.println(i+"ÀÇ °³¼ö :"+counter[i]);
	
		}
	}
}
