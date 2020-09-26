// Updated Code Snippet 1 to exit while loop and complete
// This wasn't requested in the original exercise
class Exercise1aUpdated {
  public static void main(String [] args) {
    int x = 1;
    while (x < 10) {
      if (x > 3) {
        System.out.println("big x");
      }
	  x = x + 1;
    }
  }
}