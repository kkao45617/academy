package ex04;

import java.util.ArrayList;

class fruit implements eatable{
	public String toString() {
		return "fruit";
	}
}
class apple extends fruit{
	public String toString() {
		return "apple";
	}
}
class grape extends fruit {
	public String toString() {
		return "grape";
	}
}
class toy {
	public String toString() {
		return "toy";
	}
}
interface eatable{
	
}

public class ex04 {

	public static void main(String[] args) {
		fruitbox<fruit> fruitbox = new fruitbox<fruit>();
		fruitbox<apple> applebox = new fruitbox<apple>();
		fruitbox<grape> grapebox = new fruitbox<grape>();
		
		fruitbox.add(new fruit());
		fruitbox.add(new apple());
		fruitbox.add(new grape());
		applebox.add(new apple());
		grapebox.add(new grape());
		
		System.out.println("fruitbox :" + fruitbox);
		System.out.println("applebox :"+applebox);
		System.out.println("grapebox :"+grapebox);
	}

}
class fruitbox<T extends fruit & eatable> extends box<T>{}
class box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}