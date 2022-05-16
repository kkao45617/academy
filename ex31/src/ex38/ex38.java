package ex38;

public class ex38 {

	public static void main(String[] args) {
		int[] ball=new int[45];
		for(int i=0;i<ball.length; i++) {
			ball[i]=i+1;
		}
		
		int tmp=0;
		for(int i=0; i<45;i++) {
			int k=(int)(Math.random()*45);
			tmp=ball[i];
			ball[i]=ball[k];
			ball[k]=tmp;
		}
		
		for(int i=0; i<6;i++)
			System.out.printf(" ball[%d]:"+ball[i],i);

	}

}
