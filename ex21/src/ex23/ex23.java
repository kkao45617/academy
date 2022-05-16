package ex23;

public class ex23 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int k=10; k>i; k--) {
				System.out.print(" ");
			}
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			for(int j=0;j<i;j++) {
				System.out.printf("*");
			}
			for(int k=10; k>i; k--) {
				System.out.print(" ");
			}
			
			
			System.out.println();
			
		}
		for(int i=0; i<10; i++) {
			for(int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			for(int k=10; k>i; k--) {
				System.out.print("*");
			}
			for(int k=10; k>i; k--) {
				System.out.print("*");
			}
			for(int j=0;j<i;j++) {
				System.out.printf(" ");
			}
			
			
			
			System.out.println();
			
		}

		

	}

}
