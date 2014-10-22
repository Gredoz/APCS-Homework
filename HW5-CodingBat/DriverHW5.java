public class DriverHW5 {
    public static void main(String[] args){
	StringStuff5 HW = new StringStuff5();
	System.out.println("Should be ABBA: " + HW.makeAbba("A","B"));
	System.out.println("Should be regular: " + HW.nonStart("Greg","gular"));
	System.out.println("Should be 11: " + HW.diff21(10));
	System.out.println("Should be 18: " + HW.diff21(30));
    }
}
