import java.util.*;
import java.io.*;


public class DriverHW3 {
    public static void main(String[] args){
	String s = "greg redozubov";
	System.out.println("My name is: " + s);
	int index = s.indexOf(" ");
	System.out.println("The space is on: " + index);
	String firstName = s.substring(0, index);
	System.out.println("First Name: " + firstName);
	String lastName = s.substring(index + 1);
	System.out.println("Last Name: " + lastName);
	
    }
	    
}