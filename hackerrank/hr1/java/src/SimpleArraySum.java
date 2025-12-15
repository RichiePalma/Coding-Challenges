/**
 * HackerRank Problem: Simple Array Sum
 * Given an array of integers, find the sum of its elements.
 */
public class SimpleArraySum {
    
    /**
     * Returns the sum of all elements in the array
     * @param ar array of integers
     * @return sum of all elements
     */
    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int num : ar) {
            sum += num;
        }
        return sum;
    }
}
