/* Page 12 in the book
   Page 46 in the PDF
   Using a while loop
*/

public class Loopy {
	public static void main (String[] args) {
		int x = 1;
		System.out.println("Before the Loop");
		while(x < 4) {
			System.out.println("In the Loop");
			System.out.println("Value of x is " + x);
			x = x + 1;
		}
		System.out.println("After the Loop");
	}
}