import java.util.*;

public class part2 {

	public static void main(String[] args) {

		boolean evaluate = isStringPermutation("dcba", "abcd"); //true
		System.out.println(evaluate); 
		
		List<Integer> inputTestingArray = Arrays.asList(1, 2, 3, 4, 5);
	    System.out.println(pairsThatEqualSum(inputTestingArray, 5));
     
	}
	
//	Implement the function isStringPermutation() that takes two Strings as parameters and 
//	returns a Boolean denoting whether the first string is a permutation of the second string.


	public static boolean isStringPermutation(String s1, String s2) {

		// time complexity: O(n) space complexity is additional space we allocate: O(n)
		if (s1.length() != s2.length()) {
			return false;
		}
		char[] s1Array = s1.toCharArray();
		char[] s2Array = s2.toCharArray();
		Set<Character> adding = new HashSet<Character>();

		for (int i = 0; i < s1.length(); i++) {
			adding.add(s1Array[i]);
		}

		for (int j = 0; j < s2.length(); j++) {
			if (adding.add(s2Array[j])) {
				return false;
			}
		}

		return true;

	}
	
	//Implement the function pairsThatEqualSum() that takes an array of integers and a target integer and returns an array of pairs 
//	(i.e., an array of tuples) where each pair contains two numbers from the input array and the sum of each 
//	pair equals the target integer. (Order of the output does not matter).


	public static List<List<Integer>> pairsThatEqualSum(List<Integer> inputArray, Integer targetSum) {
		// pairsThatEqualSum(inputArray: [1, 2, 3, 4, 5], targetSum: 7) == [(2, 5), (3,
		// 4)]
		
		if(inputArray == null) {
			return null;
		}

		List<List<Integer>> pairsThatEqualSum = new ArrayList<List<Integer>>();

		for (int i = 0; i < inputArray.size(); i++) {
			for (int j = i + 1; j < inputArray.size(); j++) {
				if (inputArray.get(i) + inputArray.get(j) == targetSum) {
					List<Integer> pairs = new ArrayList<Integer>();
					pairs.add(inputArray.get(i));
					pairs.add(inputArray.get(j));
					pairsThatEqualSum.add(pairs);
				}
			}

		}

		return pairsThatEqualSum;

	}

}