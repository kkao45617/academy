package ex015;
@FunctionalInterface
interface calculate<T>{
	T cal(T a, T b);
}
public class ex015 {

	public static void main(String[] args) {
		calculate<Integer> c = (a,b)->a+b;
		
		System.out.println(c.cal(10, 10));
		calculate<Double> c1= (a,b)-> a*b;
		System.out.println(c1.cal(1.2, 2.2));
	}

}
