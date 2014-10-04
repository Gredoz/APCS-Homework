public class hwFrame{
    public String frame(int h, int l){
	String ans = "";
	int first;
	int last;
	int mid;
	for(first=0; first<l; first++){
	    ans += "*";
	}
	ans += "\n";
	for(mid=0; mid< (h-2); mid++){
	    ans += "*";
	    int space;
	    for(space=0; space< (l-2); space++){
		ans += " ";
	    }
	    ans += "*"; 
	    ans += "\n";
	}
	for(last=0; last<l; last++){
	    ans += "*";
	}
	return ans;
    }
}