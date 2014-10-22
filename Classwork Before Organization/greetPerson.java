public class greetPerson {
   

    private String greeting = new String("Hello,");

    public void setGreeting(String s) {
	greeting = s;
    }

    private String name = new String("Tommy");

    public void setName(String n) {
	name = n;
    }

    public void greet(){
	System.out.println(greeting + " " + name);
    }



}
