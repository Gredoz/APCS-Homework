public class Driver {

    public static void main(String[] args){
	Basechar c = new Basechar(),c2;
	Warrior w = new Warrior(),w2;
	Mage m = new Mage();
	Mage m2 = new Mage("Merlin");
	Mage m3 = new Mage("Wizard of OZ", 1337);

	//	w.setName("Groo");
	//	m.setName("Mr. Sage");

	//	w.attack(m);
	//	m.attack(w);
	//	w.attack(w);

	System.out.println(m.getName());
	System.out.println(m.getManna());
	System.out.println(m2.getName());
	System.out.println(m2.getManna());
	System.out.println(m3.getName());
	System.out.println(m3.getManna());

    }


}
