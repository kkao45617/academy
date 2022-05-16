package ex03;
import java.util.*;
public class ex03 {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j=10; j>i; j--) {
					System.out.printf(" ");
				}
			for(int j=0; j<i; j++) {
					System.out.printf("*");
				}
			for(int j=10; j<i; j--) {
					System.out.printf(" ");
					}
			for(int j=0; j<i; j++) {
					System.out.printf("*");
					}
				
				System.out.println(" ");
		}
	
	}

}
