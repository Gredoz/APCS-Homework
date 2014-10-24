public class Driver{
    public static void main(String[] args){

	Test HW = new Test();
	
	System.out.println(" Should be {1, 2}: " + frontPiece({1, 2, 3}));
	System.out.println(" Should be 6: " + sum13({1, 2, 3, 13}));
    }
}