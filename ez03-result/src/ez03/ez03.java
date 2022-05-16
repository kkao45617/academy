package ez03;
//랜덤한 3자리 중복x 숫자를 만들어 내는 프로그램
public class ez03 {

	public static void main(String[] args) {
		int[] ballarr= {1,2,3,4,5,6,7,8,9};
		int[]ball3=new int [3];
		//중복이 안돼게 끔 굴린다.
		for(int i=0; i<ballarr.length;i++) {
			int j=(int)(Math.random()*ballarr.length);
			int tmp=0;
			
			tmp=ballarr[i];
			ballarr[i]=ballarr[j];
			ballarr[j]=tmp;
			
			
		}
		
		for(int i=0; i<ball3.length;i++) {
			ball3[i]=ballarr[i];
		}
		
		
			for(int i=0;i<ball3.length;i++) {
				System.out.println(ball3[i]);
			}
		
	}

}