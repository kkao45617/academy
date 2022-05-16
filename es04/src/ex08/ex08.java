package ex08;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class strsort implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareToIgnoreCase(o2);
	}
	
}
public class ex08 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("robot");
		list.add("apple");
		list.add("box");
		list.add("box");
		list.add("car");
		
		strsort sort = new strsort();
		for(String s:list)
			System.out.println(s);
	}

}
