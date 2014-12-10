public class Driver{
    public static void main(String[] args){
	Interval one = new Interval();
	Interval two = new Interval();

	System.out.println("one is: " + one);
	System.out.println("two is: " + two);
	System.out.println(one.compareTo(two));

    }
}