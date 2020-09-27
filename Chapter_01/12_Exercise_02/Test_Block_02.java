// Output
// 00 11 23 36 410
// Output Block 7

class Test_Block_02 {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Block 2
	  y = y + x;
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}
