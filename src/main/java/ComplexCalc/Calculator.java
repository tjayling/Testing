package ComplexCalc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {
	
	
	
	static String relationships(Integer[] nums) {
		List<Integer[]> permutations = Heap.findPermutations(nums);
		
		List<String> possibleResults = new ArrayList<>();
		
		for (Integer[] permutation : permutations) {
			if (addition(permutation[0], permutation[1], permutation[2])) {
				possibleResults.add(permutation[0] + "+" + permutation[1] + "=" + permutation[2]);
			}
			
			if (subtraction(permutation[0], permutation[1], permutation[2])) {
				possibleResults.add(permutation[0] + "-" + permutation[1] + "=" + permutation[2]);
			}
			
			if (multiplication(permutation[0], permutation[1], permutation[2])) {
				possibleResults.add(permutation[0] + "*" + permutation[1] + "=" + permutation[2]);
			}
			
			if (division(permutation[0], permutation[1], permutation[2])) {
				possibleResults.add(permutation[0] + "/" + permutation[1] + "=" + permutation[2]);
			}
		}
		
		System.out.println(String.join(", or ", possibleResults));
	
		return new String();
	}

	static boolean addition(int a, int b, int c) {
		return (a + b == c);
	}

	static boolean subtraction(int a, int b, int c) {
		return (a - b == c);
	}

	static boolean multiplication(int a, int b, int c) {
		return (a * b == c);
	}

	static boolean division(int a, int b, int c) {
		return (a / b == c);
	}

	/*
	 * String str1 = l.get(1) + "*" + l.get(0) + "=" + (l.get(0) * l.get(1)); String
	 * str2 = l.get(2) + "/" + l.get(0) + "=" + (l.get(2) / l.get(0)); String str3 =
	 * l.get(2) + "/" + l.get(1) + "=" + (l.get(2) / l.get(1));
	 * 
	 * String completeString = str1 + ", or " + str2 + ", or " + str3;
	 * 
	 * return completeString; }
	 */
}
