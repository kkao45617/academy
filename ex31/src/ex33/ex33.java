package ex33;

public class ex33 {

	public static void main(String[] args) {
		int[] score= {79,88,91,33,100,55,95};
		int max=score[0];
		int min=score[0];
		
		for(int i=1; i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
			}else if(score[i]<min) {
				min=score[i];
			}
		}
		System.out.println("최대"+max);
		System.out.println("최소"+min);
	}

}
