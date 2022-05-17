package ex012;

import java.util.ArrayList;

class fruit{
	public String toString() {
		return "fruit";
	}
}

class apple extends fruit{
	public String toString(){
			return "apple";
	}
}
class grape extends fruit{
	public String toString() {
		return "grape";
	}
}

class juice{
	String name;
	juice (String name){
		this.name = name+"juice";
	}
	public String toString() {
		return name;
	}
}
class juicer{
	static juice makejuice(fruitbox<? extends fruit> box) {
		String tmp="";
		for(fruit f :box.getlist())
			tmp+=f+" ";
		return new juice(tmp);
	}
}
class fruitbox<T extends fruit> extends box<T>{}
class box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	ArrayList<T> getlist(){return list;}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}

public class ex012 {

	public static void main(String[] args) {
		fruitbox<fruit> fruitbox= new fruitbox<fruit>();
		fruitbox<apple> applebox= new fruitbox<apple>();
		
		fruitbox.add(new apple());
		fruitbox.add(new grape());
		applebox.add(new apple());
		applebox.add(new apple());
		
		
		System.out.println(juicer.makejuice(fruitbox));
		System.out.println(juicer.makejuice(applebox));
		
	}

}
