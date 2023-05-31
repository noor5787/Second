package in.ineuron.in;
import java.util.Arrays;
public class MinScoreOfArray {
	


	    public static int minScore(int[] nums, int k) {
	        int n = nums.length;
	        if (n == 1) {
	            return 0;
	        }
	        
	        Arrays.sort(nums);
	        
	        int min = nums[0];
	        int max = nums[n - 1];
	        int diff = max - min;
	        
	        if (diff <= 2 * k) {
	            return 0;
	        } else {
	            return diff - 2 * k;
	        }
	    }
	    
	    public static void main(String[] args) {
	        int[] nums = {1};
	        int k = 0;
	        int minScore = minScore(nums, k);
	        System.out.println("Minimum score: " + minScore);
	    }
	}



