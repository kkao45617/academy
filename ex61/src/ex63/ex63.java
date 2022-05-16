package ex63;
import java.util.*;
public class ex63{
	int balance;
	
	private int sum;
	//getter,  setter ==>값 출력, 값 입력
	/*void setsum(int sum) {
		this.sum = sum;
	}
	int getsum() {
		return this.sum;
	}*/
	
	int deposit(int amonunt) {// 입금
		balance +=amonunt;
		return balance;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	int withdraw(int amonunt) {//출급
		balance-=amonunt;
		return balance;
	}
	int checkbanace() {//잔고확인
		System.out.println("잔액 : "+balance);
		return 0;
	}
}

class mainclass {
	public static void main(String[] args) {
		ex63[] bank = new ex63[3];
		
			bank[0] =new ex63();
			bank[1] =new ex63();
			bank[2] =new ex63();
			
			bank[0].deposit(10000);
			bank[0].withdraw(3000);
			System.out.print(bank[0].checkbanace());
			
			
		
	}

}