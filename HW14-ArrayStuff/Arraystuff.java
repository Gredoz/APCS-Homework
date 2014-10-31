import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/

    public int freq(int n){
	int ans=0;
	for (int i=0; i<a.length; i++){
	    if (a[i] == n){
		ans = ans + 1;
	    }
	}
	return ans;
    }


    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n){
	int ans = -1;
	for (int i=0; i<a.length; i++){
	    if (a[i] == n){
		ans = i;
		break;
	    }
	}
	return ans;
    }

    public int maxVal(){
	int ans = 0;
	for (int i=0; i<a.length; i++){
	    if (a[i] > ans){
		ans = a[i];
	    }
	}
	return ans;
    }



    public int sum67(int[] nums) {
	int ans = 0;
	boolean count = true;
	for(int i=0; i<nums.length; i++){
	    if (nums[i] == 6){
		count = false;
	    }
	    if (count) {
		ans = ans + nums[i];
	    }
	    if (nums[i] == 7){
		count = true;
	    }
	}
	return ans;
    }


    public boolean more14(int[] nums) {
	int ones = 0;
	int fours = 0;
	for (int i=0; i<nums.length; i++){
	    if (nums[i] == 1){
		ones = ones + 1;
	    }
	    if (nums[i] == 4){
		fours = fours + 1;
	    }
	}
	if (ones > fours){
	    return true;
	}
	return false;
    }


    public int[] tenRun(int[] nums) {
	int[] ans;
	ans = new int[nums.length];
	boolean mult = false;
	int multi = 0;
	for (int i=0; i<nums.length; i++){
	    if (mult ==false){
		ans[i] = nums[i];
	    }
	    if (nums[i]%10 == 0){
		mult = true;
		multi = nums[i];
	    }
	    if (mult){
		ans[i] = multi;
	    }
	}
	return ans;
    }


    public boolean tripleUp(int[] nums) {
	int count = 0;
	for (int i=0; i<(nums.length-1); i++){
	    if ((nums[i] + 1) == nums[i+1]){
		count = count + 1;
	    }
	    if ((nums[i] + 1) != nums[i+1]){
		count = 0;
	    }
	    if (count == 2){
		return true;
	    }
    
	}
	return false;
    }


    public boolean canBalance(int[] nums) {
	int left = 0;
   
	for (int i = 0; i < nums.length; i++) {
	    left += nums[i];
	    int right = 0;
	    for (int j = nums.length-1; j > i; j--) {
		right += nums[j];
	    }
	    if (right == left)
		return true;
	}
	return false;
    }



    public int[] seriesUp(int n) {
	int[] ans = new int[n * (n + 1) / 2];
	int pos = 0;
	for (int i=1; i <= n + 1; i++) {
	    for (int j = 1; j < i; j++) ans[pos++] = j;

	}
	return ans;
    }



    //HOMEWORK FOR FRIDAY(10/31/14)

    public int maxMirror(int[] nums) {

        int ans = 0;
        int mirrorNow = 0;
        int front = 0;
        int back = nums.length-1;
        int testNow = 0;
 
        while(front < nums.length) {
            mirrorNow = 0;
 
            while(back >= 0 && front < nums.length) {
                if(nums[front] == nums[back]) {
                    mirrorNow++;
                    front++;
                } else {
                    front = testNow;
                    mirrorNow = 0;
                }
                
                if(mirrorNow > ans) {
                    ans = mirrorNow;
                }
                
                back--;
            }
            
            if(back == -1) {
		front = testNow;
	    }
 
            front++;
            testNow++;
            back = nums.length-1;
        }
 
        return ans;
    }






    //--------------DRIVER SECTION-------------------
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);

	System.out.println(as.find(100));
	System.out.println(as.maxVal());
	
	
    }
}
