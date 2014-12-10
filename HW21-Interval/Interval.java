import java.io.*;
import java.util.*;

public class Interval{
    private int low, high;
    Random r = new Random();
    
    
    public Interval(){
	int m1 = r.nextInt(100);
	int m2 = r.nextInt(100);
	low = Math.min(m1, m2);
	high = Math.max(m1, m2); 
    }
    
    public String toString(){
	return ("[" + low + " " + high + "]");
    }

    public int getLow(){
	return low;
    }

    public int getHigh(){
	return high;
    }

    public int compareTo(Interval other){
	int ans = 0;
	ans = other.getLow() - low;
	if (ans == 0){
	    ans = other.getHigh() - high;
	}
	return ans;
    }



}
