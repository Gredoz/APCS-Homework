public class boxMaker{
    public String makeBox(int x, int y, String Char){
	int indexY = 0;
	int indexX = 0;
	String ans = "";
	while (indexY < y){
	    while (indexX < x){
		ans = ans + Char;
		indexX = indexX + 1;
	    }
	    indexX =0;
	    ans = ans + "\n";
	    indexY = indexY + 1;
	}
	return ans;
    }
}
