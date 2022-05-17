package test1;

public class test1 {

	    public static void main(String[] args) {
	    	gamecharacter character = new gamecharacter();
	    	character.attack();
	    	character.setweapon(new knife());
	    	character.attack();
	    	
	    	character.setweapon(new sword());
	    	character.attack();
	    }
	    public interface weapon{
	    	public void attack();
	    }
	    public class knife implements weapon{
	    	public void attack() {
	    		System.out.println("칼공격");
	    	}
	    }
	    public class sword implements weapon{
	    	public void attack() {
	    		System.out.println("검공격");
	    	}
	    }
	    public class gamecharacter{
	    	private weapon weapon;
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
}