package ex018;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

public class ex018 {

	public static void main(String[] args) {
		Consumer<String> c = s->System.out.println(s);
		
		c.accept("java good");
		c.accept("java consumer");
		
		//                       s= <String>  i=int
		ObjIntConsumer<String> cc=(s,i)->System.out.println(s+","+i);
		ObjIntConsumer<String> c3 = (s , d) -> System.out.println(s+","+d);
		
		int n=1;
		double d=1.1;
		
		cc.accept("toy",n++);
		cc.accept("robot", n++);
		cc.accept("box", n++);
		

		//c3.accept("toy",d++);
		//c3.accept("robot", d++);
		//c3.accept("box", d++);
	}

}
