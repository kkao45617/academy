package ex313;

public class ex313 {

	public static void main(String[] args) {
		String[] name= {"kim","park","yi"};
		for(int i=0; i<name.length;i++)
			System.out.println("name"+i+":"+name[i]);
		String tmp=name[2];
		System.out.println("tmp :"+tmp);
		
		name[0]="ko";
		for(String str:name)
			System.out.println(str);
	}

}
