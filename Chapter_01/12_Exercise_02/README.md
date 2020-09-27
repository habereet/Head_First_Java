A short program is below.

One block is missing.

Below the code are 5 blocks of code with 8 potential outputs. Match the blocks with the outputs they producs. Not all outputs will be used.

```Java
class Test {
  public static void main(String[] args) {
    int x = 0;
    int y = 0;
    while (x < 5) {
      /*
        Missing Block
      */
      System.oug.print(x + "" + y + " ");
      x = x + 1;
    }
  }
}
```

Candidate Blocks
```Java
// Block 1
y = x - y;

// Block 2
y = y + x;

// Block 3
y = y + 2;
if (y > 4) {
  y = y - 1;
}

// Block 4
x = x + 1;
y = y + x;

// Block 5
if (y < 5) {
  x = x + 1;
  if (y < 3) {
    x = x - 1;
  }
}
y = y + 2;
```

Potential Outputs
```Java
// Output 1
22 46 

// Output 2
11 34 59
Block 4

// Output 3
02 14 26 38

// Output 4
02 14 36 48
Block 5

// Output 5
00 11 21 32 42
Block 1

// Output 6
11 21 32 42 53

// Output 7
00 11 23 36 410
Block 2

//Output 8
02 14 25 36 47
Block 3
```
