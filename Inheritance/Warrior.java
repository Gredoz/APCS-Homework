public class Warrior extends baseChar{
    private int healthboost=5;
    private int health=12345;
    public void setHealth(int i){
	health = i;
    }

    public int getHealth() {
	return health+super.getHealth();
    }
}
