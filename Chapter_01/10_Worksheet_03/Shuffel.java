// Code Snippet 3
class Shuffel {
	public static void main(String[] args) {
		// Code Snippet 5
		int x = 3;
		// Code Snippet 7
		while (x > 0) {
			// Code Snippet 4
			if (x > 2) {
				System.out.print("a");
			}
			// Code Snippet 2
			if (x == 2) {
				System.out.print("b c");
			}
			// Code Snippet 1
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
			// Code Snippet 6
			x = x - 1;
			System.out.print("-");
		}
	}
}