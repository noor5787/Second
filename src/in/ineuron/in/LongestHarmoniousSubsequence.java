package in.ineuron.in;
import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
	

	    public static int findLHS(int[] nums) {
	        Map<Integer, Integer> freqMap = new HashMap<>();

	        for (int num : nums) {
	            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
	        }

	        int longestSubsequence = 0;
	        for (int num : freqMap.keySet()) {
	            if (freqMap.containsKey(num + 1)) {
	                int subsequenceLength = freqMap.get(num) + freqMap.get(num + 1);
	                longestSubsequence = Math.max(longestSubsequence, subsequenceLength);
	            }
	        }

	        return longestSubsequence;
	    }

	    public static void main(String[] args) {
	        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
	        int longestSubsequence = findLHS(nums);
	        System.out.println("Longest harmonious subsequence length: " + longestSubsequence);
	    }
	}


