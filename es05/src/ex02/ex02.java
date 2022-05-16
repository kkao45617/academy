package ex02;

//reflect 를 통하여 라이브러리를 활용한 forname 객체생성
import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ex02 {

	public static void main(String[] args) throws Exception {
		Class clsname = Class.forName("test");
		Object obj = clsname.getDeclaredConstructor().newInstance();
		
		System.out.println(obj.getClass().getName());
		Method[] method = clsname.getDeclaredMethods();
		
		System.out.println(method);
		for(Method m:method) {
			System.out.println(m);
		}
		Field[] fields = clsname.getFields();
		for(Field f : fields) {
			System.out.println(f);
		}
	}

}

class test{
	int num=10;
	double dnum = 10.5;
	String str = "korea";
	void func1() {
		
	}
	void func2() {
		
	}
	void func3() {
	
	}

}