package ex07;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.*;

class point{
	int x,y;
	public point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}
	//@Override
	//public int compareTo(point o) {
		// TODO Auto-generated method stub
	//	return this.x-o.x;
	//}
	
}
class mysort implements Comparator<point>{

	@Override
	public int compare(point o1, point o2) {
		return o1.y-o2.y;
	}
	
}
public class ex07 {

	public static void main(String[] args) {
		List<point> point = new ArrayList<point>();
		
		point.add(new point(10, 20));
		point.add(new point(50, 10));
		point.add(new point(30, 30));
		//Collection.sort(point);
		mysort sort = new mysort();
		Collections.sort(point,sort);
		for(point p:point)
			System.out.println(p);
	}

}
