package testing;

public class ReverseFactorial {
	public static String find(int num) {
		int i = 1;
		int factorial = 1;
		
		while (factorial < num) {
			factorial *= i;
			i++;
		}
		
		if (factorial > num) {
			return "NONE";
		}
		return (i - 1) + "!";
	}

	static int factorial(int num) {
		int factorial = 1;
		for (int i = 1; i <= num; i++) {
			factorial *= i;
		}
		return factorial;
	}
}
