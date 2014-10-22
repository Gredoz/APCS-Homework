public class boxDriver{
    public static void main(String[] args){
	boxMaker test = new boxMaker();
	System.out.println(test.makeBox(3, 2, "*"));
	System.out.println("");
	System.out.println(test.makeBox(4, 3, "#"));
    }
}
