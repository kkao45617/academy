package ex73;
import lombok.*;
//»ý¼ºÀÚ¸¦ ÅëÇÑ ÀÌ¿ë¹ý
public class ex73 {

	public static void main(String[] args) {
		sutdacard card1 = new sutdacard(3,false);
		sutdacard card2 = new sutdacard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class sutdacard{
	int num;
	boolean iskwang;
	
	public sutdacard(int num, boolean iskwang) {
		this.num=num;
		this.iskwang=iskwang;
	}
	public sutdacard() {
		this.num=1;
		this.iskwang=true;
	}
	
	String info(){
		return num + (iskwang==true?"k":" ");
	}
	

	
	
}