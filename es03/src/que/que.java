package que;

import java.util.LinkedList;
import java.util.Queue;

public class que {

	public static void main(String[] args) {
		Queue<String>  que = new LinkedList<String>();
		
		que.offer("box");
		que.offer("toy");
		que.offer("robot");
		
		System.out.println(que);
		System.out.println(que.poll());
		
		System.out.println(que);
		System.out.println(que.poll());
		
		
		System.out.println(que);
		System.out.println(que.poll());
	}

}
