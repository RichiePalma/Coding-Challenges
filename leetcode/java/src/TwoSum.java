import java.util.Arrays;

public class TwoSum {
    public int[] solveWithTwoPointers(int[] nums, int target) {
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        int left = 0, right = sortedNums.length - 1;
        int [] answ = new int[2];
        boolean foundFirst = false;

        Arrays.sort(sortedNums);
        while(left != right) {
            if(sortedNums[left] + sortedNums[right] < target){
                left++;
            }
            else if (sortedNums[left] + sortedNums[right] > target) {
                right--;
            }
            else{
                for(int i = 0; i < nums.length; i++ ) {
                    if(nums[i] == sortedNums[left] && !foundFirst) {
                        answ[0] = i;
                        foundFirst = true;
                    }
                    else if(nums[i] == sortedNums[right]) {
                        answ[1] = i;
                    }
                }
                break;

            }
        }

        return answ;
    }
}