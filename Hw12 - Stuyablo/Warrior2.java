public class Warrior{

 

    // Powerful attack that deals 1.5 damage, reduces Stamina by 5
    public String swipe(Basechar opponent){
	double Damage = (this.strength * 1.5);


	
	if (Success() == true){ 
	    // this checkes whether the attack connects
	    if (randomValue(1,100) > 20){
		double newHealth = opponent.getHealth() - Damage;
	    
		opponent.setHealth(newHealth);
	    
		String s = this + "hit " + opponent + " with his sword!";
		s = s + "/n" + "the attack dealt " + Damage + " damage.";
		s = s + "/n" + opponent + " now has " + opponent.getHealth() + " health.";
		s = s + "/n" + this + " now has " + opponent.getStamina() + " stamina.";
		return s;
	    }

	    //What if the opponent blocks?
	    else {
		double newHealth = opponent.getHealth() - (Damage - opponent.getDefence());
		String s = opponent + " has blocked " + this + "'s attack!"
		    }

	}
	
	//If the attack misses
	else {
	    String s = this + "'s attack missed!";
	    return s
		}
    }
}
