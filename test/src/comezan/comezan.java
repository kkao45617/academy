package comezan;

public class comezan {

	public static void main(String[] args) {
		sedan se =new sedan();
		se.setColor("red");
		System.out.println(se.getColor());
		
		se.setPassenger(4);
		se.setPassenger(51);
		se.setTire(4);
		se.setSeat(3);
		
		System.out.println(se.getColor()+","+se.getPassenger()+","+se.getSeat()+","+se.getTire());
		
		
		sedan se2= new sedan("blue",2,4,4);
		sports sp=new sports();
		
		sp.setColor("blue");
		System.out.println(sp.getColor());
		
		sports sp2= new sports("yellow",2,4,1,5000);
		sp2.run();
		
		System.out.println("---------------");
		sports me2=new sports();
		
	}

}
class sports extends sedan{
	int horsepower;
	public sports() {
		System.out.println("sports");
	}
	public sports(String color,int passenger, int tire,int seat, int horsepower) {
		super(color,passenger,tire,seat);
		this.horsepower=horsepower;
	}
	void run() {
		System.out.println("스포츠카 달려!!!");
	}
}
class car{
	private int passenger;
	private int tire;
	private int seat;
	
	public int getPassenger() {
		return passenger;
	}
	public void setPassenger(int passenger) {
		this.passenger = passenger;
	}
	public int getTire() {
		return tire;
	}
	public void setTire(int tire) {
		this.tire = tire;
	}
	public int getSeat() {
		return seat;
	}
	public void setSeat(int seat) {
		this.seat = seat;
	}
	void run() {
		System.out.println("달력!!!");
	}
	void stop() {}
	public car() {
		System.out.println("car");
	}
	public car(int passenger,int tire,int seat) {
		this.passenger=passenger;
		this.tire=tire;
		this.seat=seat;
	}

	
}

class sedan extends car{
	
	public sedan() {
		System.out.println("sedan");
	}

	public sedan(String color, int passenger,int tire,int seat) {
		super(passenger,tire,seat);
		this.color=color;
		 //상위클래스에게 전달==>car 생성자에게 전달
		
		//setPassenger(passenger);
		//setTire(tire);
		//setSeat(seat);
	}
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	void gas() {}
}
class bus extends car{
	

	void passengerload() {}
}
class truck extends car{
	int load;
	void objectload() {}
}