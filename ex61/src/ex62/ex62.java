package ex62;
import java.util.*;
public class ex62{
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
		return balance;
	}
}

class mainclass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.nextLine();
		
		
		ex62 mn=new ex62();
	
		mn.deposit(10000);
		mn.checkbanace();
		mn.withdraw(3000);
		mn.checkbanace();
		
		ex62 park=new ex62();
		
		park.deposit(80000);
		park.checkbanace();
		park.withdraw(1000);
		park.checkbanace();
		
		ex62 kim=new ex62();
		
		kim.deposit(5000);
		kim.checkbanace();
		kim.withdraw(300);
		kim.checkbanace();
		
		
		System.out.println("-----------------------");
		kim=park;
		kim.checkbanace();
		kim.deposit(100000);
		park.checkbanace();
		
			
		
	}

}