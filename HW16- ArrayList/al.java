import java.util.*;

public class al {
    
    public void removeAdjacent(ArrayList x){
	for (int i=0; i<x.size(); i++){
	    while (x.get(i) == x.get(i+1)){
		x.remove(i);
	    }
	}
    }

    public static void main(String[] args){
	ArrayList<Integer> list;
	list = new ArrayList<Integer>();
	Random r = new Random();
	al a = new al();


	for (int i=0; i < 20; i++){
	    list.add(r.nextInt(5));
	}
	System.out.println(list);
	
	//	a.removeAdjacent(list); THIS GAVE ME AN ERROR, 
	//	SO I DECIDED TO DO IT MANUALLY

	for (int i=0; i<list.size(); i++){
	    while (list.get(i) == list.get(i+1)){
		list.remove(i);
	    }
	}


	System.out.println(list);
    }
}
