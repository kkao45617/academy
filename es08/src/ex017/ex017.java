package ex017;

import java.util.*;
import java.util.function.Supplier;

public class ex017 {
	public static List<Integer> makeIntList(Supplier<Integer> s,int n){
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<n; i++) {
			list.add(s.get());
		}
		return list;
	}
	public static void main(String[] args) {
		//입력 x, 출력 o >>get
		Supplier<Integer> spr = ()->{
			Random rand = new Random();
			return rand.nextInt(50);
		};
		
		List<Integer> list = makeIntList(spr, 5);
		System.out.println(list);
		

		List<Integer> list2 = makeIntList(spr, 15);
		System.out.println(list2);
		
		for(int i=0; i<5;i++) {
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1;
		System.out.println(s.get());
		}
	}

}
