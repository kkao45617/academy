package ez06;


public class ez06 {

	public static void main(String[] args) {
		
		value v1 = new value(10);
		value v2 = new value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		}else
			System.out.println("v1 과 v2는 다릅니다");
		
		v2=v1;
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다");
		}else
			System.out.println("v1과 v2는 다릅니다.");
	}

}
class value{
	int value;
	value(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
			if(obj instanceof value) {
				return value==((value)obj).value;
			}
			return false;
	}
}