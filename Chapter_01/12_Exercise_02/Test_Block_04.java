// Output:
// 11 34 59
// Output Block 2

class Test_Block_04 {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Block 4
	  x = x + 1;
	  y = y + x;
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}
