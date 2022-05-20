package ex014;

import java.util.Random;

interface conerator{
	int rand();
}

public class ex014 {

	public static void main(String[] args) {
		conerator gen = () ->{return 0;} ;
		int num = gen.rand();
		System.out.println(num);
	}

}
