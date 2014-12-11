import java.util.*;
import java.io.*;

public class Driver {
    public static void main(String[] args) {
        Mage[] mage = new Mage[10];
        Random r = new Random();


	for(int i =0; i<mage.length; i++){
	    String name = "";
	    name += (char)('A' + r.nextInt(26));
	    mage[i] = new Mage();
	    mage[i].setName(name);
	}
	System.out.println("mage before: " + Arrays.toString(mage));
	Arrays.sort(mage);
	System.out.println("mage after: " + Arrays.toString(mage));
	
	ArrayList<Warrior> warrior = new ArrayList<Warrior>();
	for(int i =0;i<10;i++){
	    String name = "";
	    name += (char)('A' + r.nextInt(26));
	    Warrior k = new Warrior();
	    k.setName(name);
	    warrior.add(k);
	}
	System.out.println("warrior before: " + warrior);
	Collections.sort(warrior);
	System.out.println("warrior after: " + warrior);
      
    }
}