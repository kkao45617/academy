package ex82;
//»ó¼Ó extend

public class ex82 {

	public static void main(String[] args) {
		sedan s = new sedan("white",5,4);
		//s.color="while";
		//s.passenger=5;
		//s.tire=2;
		System.out.println(s.color+","+s.passenger+","+s.tire);
		
		bus b = new bus();
		b.passenger=15;
		b.tire=6;
		System.out.println(b.passenger+","+b.tire);
		
		truck c = new truck();
		c.passenger=5;
		c.tire=2;
		System.out.println(c.passenger+","+c.tire);
		
		sports ss= new sports(2,4,2,"red",1000);
		System.out.println(ss.color+","+ss.passenger+","+ss.tire+","+ss.seat+","+ss.sports);
		
		
	}

}
class sports extends sedan{
	int sports;
	
	public sports(int passenger, int tire,int seat, String color, int sports) {
		super(passenger,tire,seat,color);
		this.sports=sports;
	}
}

class sedan extends car{
	
	String color;
	public sedan(String color, int passenger, int tire) {
		super(passenger,tire,0);
		this.color=color;
		//this.passenger=passenger;
		//this.tire=tire;
	}
	public sedan(int passenger, int tire,int seat, String color){
		super(passenger,tire,seat);
		this.color=color;
	}

}
class car{
	int passenger;
	int tire;
	int seat;
	
	public car(int passenger,int tire,int seat) {
		this.passenger=passenger;
		this.tire=tire;
		this.seat=seat;
	}
	public car() {}
	void run() {}
	void stop() {}
	
}

class bus extends car{
	
	
	void passengerload() {}
}
class truck extends car{
	
	
	void objectload() {}
}