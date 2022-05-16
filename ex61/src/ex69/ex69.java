package ex69;

public class ex69 {

	public static void main(String[] args) {
		student s = new student();
		s.setName("È«±æµ¿");
		s.setBan(1);
		s.setNo(1);
		s.setKor(100);
		s.setKor(100);
		s.setEng(60);
		s.setMath(75);
		//s.name="È«±æµ¿";
		//s.ban=1;
		//s.no=1;
		//s.kor=100;
		//s.eng=60;
		//s.math=76;
		
		System.out.println("ÀÌ¸§:"+s.getname());
		System.out.println("ÃÑÁ¡:"+s.gettotal());
		System.out.println("Æò±Õ:"+s.getaverage());
	}

}
class student{
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public String getname() {
		return name;
	}
	int gettotal() {
		return kor+eng+math;
	}
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
	double getaverage() {
		return (double)(gettotal())/3;
	}
	
	
}
