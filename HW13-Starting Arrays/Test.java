public class Test{



    public int[] frontPiece(int[] nums) {
	int[] ans;
	ans = new int[2];
	if (nums.length < 3) {
	    return nums;
	}
	else {
	    ans[0] = nums[0];
	    ans[1] = nums[1];
	    return ans;
	}
 
    }


    public int sum13(int[] nums) {
	int ans = 0;
	int index = 0;
	int len = nums.length;
	if (len == 0){
	    return 0;
	}
	if (len == 1 && nums[index] != 13){
	    return nums[index];
	}
	if (len == 1 && nums[index] == 13) {
	    return 0;
	}
	while (index < len - 2){
	    if (nums[index] == 13){
		index += 2;
	    }
	    else {
		ans += nums[index];
		index += 1;
	    }
	}
	if (nums[index] == 13){
	    return ans;
	}
	else {
	    ans += nums[index];
	    index += 1;
	}
	if (nums[index] != 13){
	    ans += nums[index];
	}
	return ans;
    }

	//	System.out.println(" Should be {1, 2}: " + frontPiece({1, 2, 3}));
	//	System.out.println(" Should be 6: " + sum13({1, 2, 3, 13}));
    
}