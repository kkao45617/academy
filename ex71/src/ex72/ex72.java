package ex72;
import lombok.*;
//lombok을 이용한 get,set을 자동 구현하는 방법
class ex72 {

	public static void main(String[] args) {
		Student3 s = new Student3("손흥민",1,10,70,100); //생성자 호출>>디폴트 생성자
		System.out.println(s.getName());
		System.out.println(s.getNo());
		System.out.println(s.getKor());
		
		Student3 s2 = new Student3("용기사",4,12,65,15); //생성자 호출>>디폴트 생성자
		System.out.println(s2.getName());
		System.out.println(s2.getNo());
		System.out.println(s2.getKor());
		
		Student3 s3 = new Student3("주지홍",3,64,14,76); //생성자 호출>>디폴트 생성자
		System.out.println(s3.getName());
		System.out.println(s3.getNo());
		System.out.println(s3.getKor());
		
	}
}

// private < default < protected < public
@Getter
@Setter
@ToString
class Student3{
	//변수>> 인스턴스변수, 클래스변수, 지역변수
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public Student3(String name, int num,int kor,int eng,int math) {
		this.name=name;
		this.ban=ban;
		this.no=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
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