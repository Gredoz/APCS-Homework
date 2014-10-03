public class Triangle2{
    public String tri3(int x){
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
    public String diamond(int h){
	int points = 1;
	int stars = 1;
	int row = 1;
	int space = (h + 1) / 2;
	String ans = "";
	int blank = 0;
	while (points <= h){
	    blank = space - row;
	    while (blank > 0){
		ans = ans + " ";
		blank = blank - 1;
	    }
	    while (stars > 0){
		ans = ans + "*";
		stars = stars - 1;
	    }
	    ans = ans + "\n";
	    points = points + 2;
	    stars = points;
	    row = row + 1;
	}
	

	points = points - 2;
	row = row - 1;
	while (points > 0){
	    points = points - 2;
	    stars = points;
	    row = row + 1;
	    blank = row - space;
	    while (blank > 0){
		ans = ans + " ";
		blank = blank - 1;
	    }	      
	    while (stars > 0){
		ans = ans + "*";
		stars = stars - 1;
	    }
	    ans = ans + "\n";
	}
	return ans;
    }
	

    public String tri4(int h){
	int stars = h;
	int row = h;
	int space = 0;
	String ans = "";
	while (row > 0){
	    while (space > 0){
		ans = ans + " ";
		space = space - 1;
	    }
	    while (stars > 0){
		ans = ans + "*";
		stars = stars - 1;
	    }
	    row = row - 1;
	    stars = row;
	    space = h - row;
	    ans = ans + "\n";
	}
	return ans;
    }
    
}
