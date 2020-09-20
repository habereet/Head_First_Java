// Code Snippet 1
// Should compile
// Won't exit the while loop because x is never incremented
class Exercise1a {
  public static void main(String [] args) {
    int x = 1;
    while (x < 10) {
      if (x > 3) {
        System.out.println("big x");
      }
    }
  }
}