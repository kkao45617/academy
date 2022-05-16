package ex71;

public class ex71 {

	public static void main(String[] args) {
	int num=10;
		Student2 s = new Student2();
		
		s.getAverage();
		String name = s.getName();
		s.setName("홍길동");
		s.getKor();
		s.setKor(80);
		s.setBan(30);
		System.out.println(s.getKor());
		System.out.println(s.getName());
		System.out.println(s.getBan());
	}
}

// private < default < protected < public

class Student2{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	
	
	
	//get 형태
	public String getName() {
		return name;
	}
	//set 형태
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	
	
	//함수 --> 인스턴스메소드, 클래스메소드
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	double getAverage() {
		return getTotal()/3.0;
	}
}