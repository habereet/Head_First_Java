// Output:
// 00 11 21 32 42
// Output Block 5

class Test_Block_01 {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      // Block 1
	  y = x - y;
      System.out.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}
