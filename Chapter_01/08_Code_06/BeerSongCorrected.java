/* Page 14 in the book
   Page 48 in the PDF

   Should output the song 99 Bottles of Beer
*/

public class BeerSongCorrected {
	public static void main(String[] args) {
		int beerNum = 99;
		String word = "bottles";
		String wallText = "on the wall";
		
		while (beerNum > 0) {
			
			// Add check to only output this line at the beginning of the first verse
			if (beerNum == 99) {
				System.out.println(beerNum + " " + word + " of beer " + wallText);
			}
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down");
			System.out.println("Pass it around\n");
			
			beerNum = beerNum - 1;
			
			// Move the update to singular to bottom of main
			if (beerNum == 1) {
				word = "bottle";
			}
			
			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer " + wallText);
			} else {
				System.out.println("No more bottles of beer " + wallText);
			}
		}
	}
}