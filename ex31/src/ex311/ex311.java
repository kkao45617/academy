package ex311;
import java.util.*;
public class ex311 {

	public static void main(String[] args) {
        int[] numarr=new int[10];
        for(int i=0; i<numarr.length; i++) {
        	System.out.print(numarr[i]=(int)(Math.random()*10));
        }
        System.out.println();
        for(int i=0; i<numarr.length-i; i++) {
        	boolean changed=false;
        	
        	for(int j=0; j<numarr.length-1-i;j++) {
        		if(numarr[j]>numarr[j+1]) {
        			int temp=numarr[j];
        			numarr[j]=numarr[j+1];
        			numarr[j+1]=temp;
        			changed=true;
        		}
        	}
        	
        	if(!changed) break;
        	
        	for(int k=0;k<numarr.length;k++)
        		System.out.print(numarr[k]);
        	System.out.println();
        }
	}

}
