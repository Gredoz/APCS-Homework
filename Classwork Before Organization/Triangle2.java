public class Triangle2{
        public String tri2(int x){
	int indexX = 1;
	int indexY = 1;
	int Count = 1;
	String ans = "";
	while (indexY <= x){
	    int space = x - Count;
	    while (space > 0){
		ans = ans + " ";
		space = space - 1;
	    }
	    while (indexX > 0){
		ans = ans + "*";
		indexX = indexX - 1;
	    }
	    indexY = indexY + 1;
	    Count = indexY;
	    indexX = (indexY * 2) - 1;
	    ans = ans + "\n";
	}
	return ans;
    }
}
