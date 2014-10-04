public class hwFrame{



    ///////////////Frame////////////////
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


    ///////////stringSplosion///////////////////
    public String stringSplosion(String str) {
	String ans = "";
	int len = str.length();
	int i;
	for (i=0; i<len; i++){
	    ans += str.substring(0,i+1);
	}
	return ans;
    }
    
    ////////////////stringX////////////////
    public String stringX(String str) {
	String ans = "";
	int i;
	int len = str.length();
	if (len == 0){
	    return "";
	}
    
    
	ans += str.substring(0, 1);
	for (i = 1; i<len-1; i++){
	    if (str.charAt(i) != 'x'){
		ans += str.substring(i, i+1);
	    }
	}
	ans += str.substring(i);
	return ans;
    }


}