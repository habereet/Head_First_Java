Page 20 in the book
Page 54 in the PDF


Re-order the following code snippets to get the following target output:
a-b c-d

Add Curly Braces whered needd

```java
// Code Snippet 1
if (x == 1) {
  System.out.print(“d”);
  x = x - 1;
}
```

```java
// Code Snippet 2
if (x == 2) {
  System.out.print(“b c”);
}
```

```java
// Code Snippet 3
class Shuffel {
  public static void main(String[] args) {
```

```java
// Code Snippet 4
if (x > 2) {
  System.out.println("a");
}
```

```java
// Code Snippet 5
int x = 3;
```

```java
// Code Snippet 6
x = x - 1;
System.out.println("-");
```

```java
// Code Snippet 7
while (x > 0) {
```

Desired order:
* 3
* 5
* 7
* In any order
  * 1
  * 2
  * 4
  * It makes readability sense, though, to put put them in this order:
    * x >2 (4)
    * x ==2 (2)
    * x==1 (1)
* 6

```java
// Code Snippet 3
class Shuffel {
	public static void main(String[] args) {
		// Code Snippet 5
		int x = 3;
		// Code Snippet 7
		while (x > 0) {
			// Code Snippet 4
			if (x > 2) {
				System.out.print("a");
			}
			// Code Snippet 2
			if (x == 2) {
				System.out.print("b c");
			}
			// Code Snippet 1
			if (x == 1) {
				System.out.print("d");
				x = x - 1;
			}
			// Code Snippet 6
			x = x - 1;
			System.out.print("-");
		}
	}
}
```
