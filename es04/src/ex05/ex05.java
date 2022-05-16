package ex05;
//sort 메소드 활용하는 방법
import java.util.Arrays;

public class ex05 {

	public static void main(String[] args) {
		person a = new person();
		person[] per = new person[3];
		per[0] =new person("김대철",25);
		per[1] = new person("김신",10);
		per[2]= new person("남중신중",22);
		
		Arrays.sort(per);
		
		for(person i: per) {
			System.out.println(i);
		}
	}
}

class person implements Comparable{
	private String name;
	private int age;

	/*public person(String name, int age) {
		this.name=name;
		this.age=age;
	}*/
	public person() {
	}
	
	@Override
	public String toString() {
		return "person[name=" +name+",age="+age+"]";
	}
	
	public person(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	@Override
	public int compareTo(Object o) {
		person p= (person)o;
		
		//if(this.age>p.age)return 1;
		//else if(this.age<p.age)return -1;
		//else return 0;
		return p.name.length()-this.name.length();
	}
	
}