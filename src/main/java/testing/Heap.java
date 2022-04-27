package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Heap {
	static List<Integer[]> result;
	static List<Integer[]> temp;

	public static List<Integer[]> findPermutations(Integer[] nums) {
		result = new ArrayList<>();
		temp = new ArrayList<>();
		
		permutations(nums, nums.length, nums.length);
		
		return temp;

		/*
		List<Integer[]> resultInt = new ArrayList<>();
		for (int i = 0; i < result.size(); i++) {
			resultInt.add(new Integer[nums.length]);
			for (int j = 0; j < resultInt.get(i).length; j++) {
				System.out.println(result.get(i).toCharArray()[j]);
				resultInt.get(i)[j] = (int) (result.get(i).toCharArray()[j] - 48);
			}
		}

		return resultInt;
		*/
		
	}

	static List<Integer[]> permutations(Integer[] a, int size, int n) {
		if (size == 1) {
			temp.add(a.clone());
			// System.out.println(Arrays.toString(results.get(results.size()-1)));
		}

		for (int i = 0; i < size; i++) {
			permutations(a, size - 1, n);

			if (size % 2 == 1) {
				int temp = a[0];
				a[0] = a[size - 1];
				a[size - 1] = temp;
			}

			else {
				int temp = a[i];
				a[i] = a[size - 1];
				a[size - 1] = temp;
			}
		}
		return temp;
	}
}
