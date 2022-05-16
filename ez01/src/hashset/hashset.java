package hashset;

import java.util.HashSet;
//오버라이딩과 메소드를 호출하여 자신의 함수로 리턴시키는 형식
public class hashset {

	public static void main(String[] args) {
		HashSet<num> set =new HashSet<>();
		
		set.add(new num(100));
		set.add(new num(200));
		set.add(new num(300));
		set.add(new num(100));
		set.add(new num(500));
		set.add(new num(100));
		set.add(new num(700));
		set.add(new num(100));
		set.add(new num(200));
		
		
		for(num n : set)
			System.out.println(n);
	}

}

class num{
	private int num; 
	public num(int n) {
			num=n;
	}
	
	@Override
	public int hashCode() {
		System.out.println("해쉬코드");
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("비교");
			return num==((num)obj).num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
}