import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n){
	int ans = -1;
	for (int i=0; i<a.length; i++){
	    if (a[i] == n){
		ans = i;
		break;
	    }
	}
	return ans;
    }

    public int maxVal(){
	int ans = 0;
	for (int i=0; i<a.length; i++){
	    if (a[i] > ans){
		ans = a[i];
	    }
	}
	return ans;
    }

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);

	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	
	
    }
}
