public class Greeter3 {

    //instance variables are almost always private
    //we access them with "accessor methods" get and set
    private String greeting = new String("Hello world!");

    public void setGreeting(String s) {
	greeting = s;
    }


    //String is the "return type" that is, the type of the data that we
    //will send back using the return statement.
    //void is a special "return type" which means we won't be returning
    //any value
    public String getGreeting() {
	return greeting;
    }


    public String greet() {
	return greeting;
    }


    public void greet() {
	//String greeting = new String("Sup!");
	System.out.println(greeting);
    }
    public void ungreet() {
	System.out.println(greeting);
    }


    public Greeter3(Sting g) {
	System.out.println("In the constructor");
	greeting = g;
    }



}


