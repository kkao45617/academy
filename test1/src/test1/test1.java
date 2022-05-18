package test1;


public class test1 {

	    public static void main(String[] args) {
	    	gamecharacter client = new gamecharacter();
	        client.attack();

	        client.setweapon(new knife());
	        client.attack();

	        client.setweapon(new sword());
	        client.attack();
	    }
}

interface weapon{
	public void attack();
}
class knife implements weapon{
	public void attack() {1
		System.out.println("칼공격");
	}
}

class sword implements weapon{
	public void attack() {
		System.out.println("검공격");
	}
}

class gamecharacter{
	private weapon weapon;
	public gamecharacter() {}
	public void setweapon(weapon weapon) {
		this.weapon=weapon;
	}
	public void attack() {
		if(weapon==null) {
			System.out.println("맨손공격");
		}else {
			weapon.attack();
		}
	}
}