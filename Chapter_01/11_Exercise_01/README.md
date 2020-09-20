Page 21 in the book
Page 55 in the PDF


Identify if each of the following snippets will compile. If they won't, fix them.


```java
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
```

```java
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
```

```java
// Code Snippet 2
// Won't compile - Needs a class declaration
public static void main(String [] args) {
  int x = 5;
  while (x > 1) {
    x = x - 1;
    if (x < 3) {
      System.out.println(“small x”);
    }
  }
}
```

```java
// Updated Code Snippet 2 to have class declaration
class Exercise1b {
  public static void main(String [] args) {
    int x = 5;
    while (x > 1) {
      x = x - 1;
      if (x < 3) {
        System.out.println("small x");
      }
    }
  }
}
```

```java
// Code Snippet 3
// Won't compile - Needs a main method
class Exercise1b {
  int x = 5;
  while (x > 1) {
    x = x - 1;
    if (x < 3) {
      System.out.println("small x");
    }
  }
}
```


```java
// Updated Code Snippet 3 to have a main method
class Exercise1c {
  public static void main(String[] args) {
    int x = 5;
    while(x > 1) {
      x = x - 1;
      if (x < 3) {
        System.out.println("small x");
      }
    }
  }
}
