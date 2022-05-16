package ex74;

public class ex74 {

	public static void main(String[] args) {
		student s1= new student();
		
		s1.setName("È«±æµ¿");
		s1.setBan(1);
		s1.setEng(50);
		s1.setNo(1);
		s1.setKor(74);
		s1.setMath(75);
		
		System.out.println("ÀÌ¸§ : "+s1.getName());
		System.out.println("ÃÑÇÕ : "+s1.gettotal());
		System.out.println("Æò±Õ : "+s1.getaverage());
		
		student s2= new student();
		
		s2.setName("ÀÌ¹«°³");
		s2.setBan(1);
		s2.setEng(80);
		s2.setNo(2);
		s2.setKor(70);
		s2.setMath(80);
		
		System.out.println("ÀÌ¸§ : "+s2.getName());
		System.out.println("ÃÑÇÕ : "+s2.gettotal());
		System.out.println("Æò±Õ : "+s2.getaverage());
	}

}

class student{
	private String name;
	int ban;
	int no;
	int kor;
	int eng;
	int math;
	
	
	public String getName() {
		return name;
	}
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
	
	
	int gettotal() {
		return kor+eng+math;
	}
	double getaverage() {
		return gettotal()/3.0;
	}
}