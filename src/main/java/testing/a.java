package testing;

import java.util.ArrayList;

public class a {
	static ArrayList<Integer> a = new ArrayList<>();
	static ArrayList<String> b = new ArrayList<>();

	public static void main(String[] args) {

		a.add(8);
		a.add(5);
		a.add(10);
		a.add(40);

		generate(a);
	}

	public static void generate(ArrayList<Integer> a) {
		int i1;

		for (int i = 0; i < a.size() - 1; i++) {
			for (int j = i + 1; j <= a.size() - 1; j++) {
				i1 = a.get(i) + a.get(j);

				for (int k = 0; k < a.size(); k++) {
					if ((i1 % a.get(k)) == 0) {
						b.add(a.get(i) + " + " + a.get(j) + " = " + i1);
					}
				}
			}
		}

		for (String str : b) {
			System.out.println(str);
		}
	}

}
