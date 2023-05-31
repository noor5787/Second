package in.ineuron.in;
import java.util.HashSet;
import java.util.Set;


public class MaxDifferentCandies {
	
	    public static int maxDifferentCandies(int[] candyType) {
	      
	        int maxCandies = candyType.length / 2;

	      
	        Set<Integer> uniqueCandies = new HashSet<>();

	     
	        for (int candy : candyType) {
	            uniqueCandies.add(candy);

	            
	            if (uniqueCandies.size() == maxCandies) {
	                return maxCandies;
	            }
	        }

	       
	        return uniqueCandies.size();
	    }

	    public static void main(String[] args) {
	        int[] candyType = {1, 1, 2, 2, 3, 3};
	        int maxDifferentCandies = maxDifferentCandies(candyType);
	        System.out.println("Maximum number of different candies Alice can eat: " + maxDifferentCandies);
	    }
	}



