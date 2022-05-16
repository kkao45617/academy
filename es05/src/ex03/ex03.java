package ex03;

import java.util.ArrayList;

class fruit{
	public String toString() {
		return "fruit";
	}
}
class apple extends fruit{
	public String toString() {
		return "apple";
	}
}
class grape extends fruit{
	public String toString() {
		return "grape";
	}
}
class toy{
	public String toString() {
		return "toy";
	}
}
public class ex03 {

	public static void main(String[] args) {
		box<fruit> fruitbox = new box<fruit>();
		box<apple> applebox = new box<apple>();
		box<toy> toybox = new box<toy>();
		//box<grape> grapebox = new box<apple>();
		
		fruitbox.add(new fruit());
		fruitbox.add(new apple());
		
		applebox.add(new apple());
		applebox.add(new apple());
		
		toybox.add(new toy());
		
		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(toybox);
	}

}

class box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}