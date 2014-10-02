public class Triangles {
    public String tri1(int x){
	int indexX = 1;
	int indexY = 1;
	String ans = "";
	while (indexY <= x){
	    while (indexX > 0){
		ans = ans + "*";
		indexX = indexX - 1;
	    }
	    ans = ans + "\n";
	    indexY = indexY + 1;
	    indexX = indexY;
	}
	return ans;
    }

    public String tri2(int x){
	int indexX = 1;
	int indexY = 1;
	String ans = "";
	while (indexY <= x){
	    int space = x - indexX;
	    while (space > 0){
		ans = ans + " ";
		space = space - 1;
	    }
	    while (indexX > 0){
		ans = ans + "*";
		indexX = indexX - 1;
	    }
	    indexY = indexY + 1;
	    indexX = indexY;
	    ans = ans + "\n";
	}
	return ans;
    }

}