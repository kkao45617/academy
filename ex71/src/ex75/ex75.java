package ex75;
import lombok.*;
public class ex75 {

	public static void main(String[] args) {
		student s = new student("홍길동",1,1,100,60,76);
		
		System.out.println(s.info());
		System.out.println(s.toString());
	}

}

//롬복을 통한 tostring화 시킨 자료 출력

@ToString
class student{
	String name;
	private int no;
	private int hag;
	private int eng;
	private int kor;
	private int math;
	
	student(String name,int no,int hag, int eng, int kor, int math){
		this.name=name;
		this.no=no;
		this.hag=hag;
		this.eng=eng;
		this.math=math;
		this.kor=kor;
	}
	
	int total() {
		return kor+eng+math;
	}
	double avg() {
		return total()/3.0;
	}
	
	String info() {
		return name+","+no+","+hag+","+eng+","+kor+","+math+","+total()+","+avg();
	}
}