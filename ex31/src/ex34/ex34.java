package ex34;

public class ex34 {

	public static void main(String[] args) {
		int[] numarr=new int[10];
		for(int i=0; i<numarr.length;i++) {
			numarr[i]=i;
			System.out.print(numarr[i]);
		}
		System.out.println();
		
		for(int i=0; i<100;i++) {
			int n=(int)(Math.random()*10);
			int tmp=numarr[0];
			numarr[0]=numarr[n];
			numarr[n]=tmp;
		}
		for(int i=0; i<numarr.length;i++)
			System.out.print(numarr[i]+" ");
	}

}
