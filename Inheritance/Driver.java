public class Driver {
    public static void main(String[] args){
	baseChar c = new baseChar();

	c.setHealth(150);
	System.out.println(c.getHealth());

	Warrior w = new Warrior();
	w.setHealth(200);
	System.out.println(w.getHealth());
    
	Mage m = new Mage();
	System.out.println(m.getManna());


    }


}
