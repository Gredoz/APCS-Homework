public class Driver3 {
    public static void main(String[] args){
	Greeter3 g1 = new Greeter3();
	Greeter3 g2 = new Greeter3();
	g1.greet();
	g2.greet();
	g1.setGreeting(new String("Sup!"));
	
	g1.greet();
	g2.greet();

	String s = g1.getGreeting();
	System.out.println("g1's greeting is: "+s);
        System.out.println("g2's greeting is: "+g2.getGreeting());
    

    }
}
