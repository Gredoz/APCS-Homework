public class answers{
    
    //****************************FRONT TIMES***********************************
    public String frontTimes(String str, int n) {
	int frontNum = 3;
	if (str.length() < 3){
	    frontNum = str.length();
	}
	String front = str.substring(0, frontNum);
	String ans = "";
	while (n > 0){
	    ans = (ans + front);
	    n = (n - 1);
	}
	return ans;
    }
	
    //***************************STRING BITS*************************************
    public String stringBits(String str) {
	int index = 0;
	int len = str.length();
	String ans = "";
	while (index < len){
	    ans = (ans + str.substring(index, (index + 1)));
	    index = index + 2;
	}
	return ans;
    }

	
    //**************************STRING YAK*************************************
    public String stringYak(String str) {
	int index = 0;
	int locY;
	String ans = "";
	int len = str.length();
	while (index < len){
	    if ((str.charAt(index)=='y') && ((index + 2 < len)) && (str.charAt(index + 2)=='k')){
		index = index + 3;
	    }
	    else{ 
		ans = ans + str.charAt(index);
		index = index + 1;
	    }
	}
	return ans;
    }

    //**************************STRING MATCH************************************
    public int stringMatch(String a, String b) {
	int index = 0;
	int ans = 0;
	int len;
	String aSub = "";
	String bSub = "";
	if (a.length() > b.length()){
	    len = b.length();
	}
	else {
	    len = a.length();
	}
    
	while (index + 2 < len){
	    aSub = a.substring(index, index + 2);
	    bSub = b.substring(index, index + 2);
	    if (aSub.equals(bSub)){
		ans = ans + 1;
	    }
	    index = index + 1;
	}
    
	if (len > 1 && (a.length() < b.length())){
	    aSub = a.substring(len - 2);
	    bSub = b.substring(len - 2, len);
	}
    
	if (len > 1 && (a.length() > b.length())){
	    aSub = a.substring(len - 2, len);
	    bSub = b.substring(len -2);
	}
 
    
	if (aSub.equals(bSub)){
	    ans = ans + 1;
	}
  
	if (len < 2){
	    return 0;
	}
  
	return ans;
    }
}
