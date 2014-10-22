
public class Mage extends Basechar{
    private int mana;
    private String name;
    

    //Default
    public Mage(){
	name = "Gandalf";
	mana = 9001;
    }

    //Select Name
    public Mage(String n){
    	name = n;
    }
    
    //Select Name and Manna
    public Mage(String n, int m){
	name = n;
    	mana = m;
    }
    

    public String getName(){
	return name;
    }

    public int getManna(){
	return mana;
    }
}
