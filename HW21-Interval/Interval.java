import java.io.*;
import java.util.*;

public class Interval{
    private int low, high;
    Random r = new Random();
    
    
    public Interval(){
	int m1 = r.nextInt(200) -100;
	int m2 = r.nextInt(200) -100;
	low = Math.min(m1, m2);
	high = Math.max(m1, m2); 
    }
    
    public String toString(){
	return ("[" + low + " " + high + "]");
    }

    



}
