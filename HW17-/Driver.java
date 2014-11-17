import java.util.*;

public class Driver{


    public static void main(String args[]){

	//*********ARRAYLIST*************
	System.out.println("ArrayList Randomizer");
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	for (int i=0;i<25;i++){
	    al.add(i);
	}

      	System.out.println("ArrayList Before Randomization: "+al);

 
	ArrayList<Integer> newAl = new ArrayList<Integer>();


	for(int i=0;i<al.size();i=i){
	    int val = al.remove(r.nextInt(al.size()));
	    newAl.add(val);
	}
	al=newAl;

       	System.out.println("ArrayList After Ramdomization: "+al);	


	//*************ARRAY************


	System.out.println("\n" +"Array Randomizer");
	int[] a = new int[25];
	for(int i=0;i<a.length;i++){
	    a[i]=i;
	}
	


	System.out.println("Array Before Randomization: "+Arrays.toString(a));
	


	int firstindex = 0;
	int secondindex = 0;
	int firstval = 0;

	for (int i=0;i<a.length*10;i++){
	    firstindex=r.nextInt(a.length);
	    secondindex=r.nextInt(a.length);
	    firstval=a[firstindex];
	    a[firstindex]=a[secondindex];
	    a[secondindex]=firstval;
	}
	
	System.out.println("Array After Randomization: " +Arrays.toString(a));

    }

    // In the end, it seems that the method Henry and I thought up of works best for Arrays, but the other team's code suits ArrayLists better. (I can't remember which team we borrowed it from)

}
