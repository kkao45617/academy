package ex54;

import java.util.Arrays;

public class ex54 {

	public static void main(String[] args) {
		int [] a = {10,20,3,40,50};
		int [] b = {10,20,3,40,51};
		boolean c = arrayequal(a,b);
		System.out.println(c);
		
		
	}
	static boolean arrayequal(int[] a, int[] b) {

		if(a.length!=b.length)
			return false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]!=b[i])
				return false;
		}
		
		return true;
		
		
	}
}
