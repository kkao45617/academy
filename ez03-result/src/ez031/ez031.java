package ez031;
//동전교환 코드
import java.util.Arrays;

public class ez031 {

	public static void main(String[] args) {
		int[] coin= {500,100,50,10};
		int money=2680;
		
		
		int tmp=0;
		for(int i=0;i<coin.length;i++) {
			tmp=money/coin[i];
			money=money%coin[i];
			System.out.println(tmp+"개");
		}
		System.out.println("money"+money);

	}

}
