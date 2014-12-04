java.util.*;

public class al {
    
    public void removeAdjacent(ArrayList x){
	for (int i=0; i<x.size(); i++){
	    while (x.get(i) == x.get(i+1)){
		x.remove(i);
	    }
	}
    }

    public static void main(String[] args){
	ArrayList<int> al;
	al = new ArrayList<int>();

	//define the ArrayList
	//check the method "removeAdjacent" 
