package ex07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class strcmp implements Comparator<String>{
	public int compare(String o1, String o2) {
		return o1.length()-o2.length();
	}
}
public class ex07 {

	public static void main(String[] args) {
		List<String> list = new ArrayList();
		list.add("robot");
		list.add("apple");
		list.add("toy");
		
		strcmp sc= new strcmp();
		
		Collections.sort(list,sc);
		System.out.println(list);
		
	}

}
