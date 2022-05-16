package ex06;

import java.util.Arrays;
import java.util.Comparator;


public class ex06 {

	public static void main(String[] args) {
		String[] strarr= {"cat","dog","lion","tiger"};
		
		Arrays.sort(strarr);
		System.out.println("strarr"+Arrays.toString(strarr));
		
		Arrays.sort(strarr,String.CASE_INSENSITIVE_ORDER);
		System.out.println("strarr="+Arrays.toString(strarr));
		
		Arrays.sort(strarr,new descending());
		System.out.println("strarr="+Arrays.toString(strarr));
	}

}
class descending implements Comparator{
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1= (Comparable)o1;
			Comparable c2= (Comparable)o2;
			return c1.compareTo(c2)* -1;
			
		}
		return -1;
	}
}
