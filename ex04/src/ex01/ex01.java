package ex01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ex01 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("toy");
		list.add("box");
		list.add("robot");
		list.add("toy");
		
		for(String a:list) {
			System.out.println(a);
		}
		//next()다음 값 반환
		//hashnext() 가져올 데이터 있는가?
		//remove next()호출통해 반환된 인스턴스 삭제
		System.out.println("---------------");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) {
			String str = it.next();
			if(str.equals("toy")) it.remove();
			System.out.println(str);
		}
		
		Iterator<String> it2 = list.iterator();
		System.out.println("---------------");
		while(it2.hasNext()) {
			String str = it2.next();
			if(str.equals("toy")) it.remove();
			System.out.println(str);
		}
		
	}

}
