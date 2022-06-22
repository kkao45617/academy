package examprj;

public class bulidtest {
	int num1,num2;
	
	public bulidtest() {
		this(1,1);
	}
	public bulidtest(int x, int y) {
		num1=x;
		num2=y;
	}
	int add() {
		return num1+num2;
	}
	int sub() {
		return num1-num2;
	}
	int mul() {
		return num1*num2;
	}
	double div() {
		return num1/(double)num2;
	}
	
	public void getinfo() {
		System.out.println("두 정수 : "+num1+","+num2);
		System.out.println("더하기 = "+(num1+num2));
		System.out.println("빼기 = "+(num1-num2));
		System.out.println("곱하기 = "+(num1*num2));
		System.out.println("나누기 = "+(num1/num2));
	}

}
