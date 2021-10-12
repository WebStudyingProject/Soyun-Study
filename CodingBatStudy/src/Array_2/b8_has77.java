package Array_2;
/*Array-2 > has77
Given an array of ints, return true if the array contains two 7's next to each other, or there are two 7's separated by one element, such as with {7, 1, 7}.
has77([1, 7, 7]) �� true
has77([1, 7, 1, 7]) �� true
has77([1, 7, 1, 1, 7]) �� false*/
public class b8_has77 {
	public boolean has77(int[] nums) {
		  if(nums.length<=1)return false;
		  for(int i=0; i<nums.length; i++){
		    if(i==0&&nums[i]==7&&(nums[i+1]==7||nums[i+2]==7))return true;
		    if(i<nums.length-2&&(nums[i]==7||nums[i+2]==7))return true;
		  }
		  return false;
		}
	
	// Solution
    public boolean shas77(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 7 && nums[i+1] == 7) return true;
            if (i > 0 && nums[i-1] == 7 && nums[i+1] == 7) return true;
        }
        return false;
    }
}
