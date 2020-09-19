// Code from worksheet with my answers
// Target Output is:
// DooBeeDooBeeDo

public class DooBee {
	public static void main(String[] args) {
		int x = 1;
		while (x < 3) { // 3 <-- We want it to do this loop twice
			System.out.print("Doo"); // print <- Will not add a new line
			System.out.print("Bee"); // print <- Will not add a new line
			x = x + 1;
		}
		if (x == 3) { // 3 <-- exited while loop @3
			System.out.print("Do");
		}
	}
}