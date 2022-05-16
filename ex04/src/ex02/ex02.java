package ex02;
//list를 이용한 알고리즘 구현방식 iterrator를 이용하는 방법
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ex02 {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("toy","box","robot","box");

		
		System.out.println(list);
		
		list=new ArrayList<String>(list);
		
		ListIterator<String> it=list.listIterator(); //양방향
		 while(it.hasNext()) {
			 String str=it.next();
			 System.out.println(str);
		 }
		 while(it.hasNext()) {
			 String str=it.next();
			 System.out.println(str);
		 }
		 System.out.println();
		 
		 while(it.hasPrevious()) {
			String str =it.previous();
			System.out.println(str);
		 }
		 
		 System.out.println();
		 for(Iterator<String> itr=list.iterator();itr.hasNext();)
			 System.out.println(itr.next());
		 
	}

}
