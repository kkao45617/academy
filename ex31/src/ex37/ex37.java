package ex37;
import java.util.*;
public class ex37 {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<10; i++)
			for(int j=0; j<10;j++)
				sum=i*j;
		System.out.print(sum);
	}

}
