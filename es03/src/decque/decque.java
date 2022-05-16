package decque;
//addfrist() 넣기
//removefisrt 꺼내기
//getfirst() 확인하기


//addlast()넣기
//removelast()꺼내기
//getlast

import java.util.ArrayDeque;
import java.util.Deque;
public class decque {

	public static void main(String[] args) {
		Deque<String> deq = new ArrayDeque<String>();
		
		deq.offerFirst("1.box");
		deq.offerFirst("2.toy");
		deq.offerFirst("3.robot");
		
		//System.out.println(deq.pollFirst());
		//System.out.println(deq.pollFirst());
		//System.out.println(deq.pollFirst());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
		System.out.println(deq.pollLast());
	}

}
