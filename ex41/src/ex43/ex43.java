package ex43;
//선택적 정렬 알고리즘
import java.util.Arrays;

public class ex43 {

	public static void main(String[] args) {
		int []a= {9,6,7,3,5};
		for(int i=0; i<a.length;i++) {
			int index=i;
			
			for(int j=i+1; j<a.length;j++) {
				if(a[index]>a[j]) 
					index=j;
			}
			if(index !=i) {
				int tmp= a[index];
				a[index]= a[i];
				a[i]=tmp;
			}
		
			System.out.println(i+"ȸ��"+Arrays.toString(a));
		}

	}

}
