package ex21;

public class ex21 {

	public static void main(String[] args) {
		int a[]=new int[10];
		double avg=0.0;
		int total=1500;
		for(int i=0; i<a.length; i++) {
			a[i] = (int)(Math.random()*70);
		}
		for(int i=0; i<a.length; i++) {
			if(0<=a[i]&&a[i]<=3)
				avg=0.0;
			else if(4<=a[i]&&a[i]<=13)
				avg=0.5;
			else if(14<=a[i]&&a[i]<=19)
				avg=1;
			else if(20<=a[i]&& a[i]<=64)
				avg=1;
			else if(65<=a[i])
				avg=0.0;
			System.out.println("최종 요금 :" +a[i]+" , "+(int)(total*avg));
		}
		


	}


}
