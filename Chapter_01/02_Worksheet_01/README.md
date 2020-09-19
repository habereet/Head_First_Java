Page 6 in Book
Page 40 in PDF
Note what each line is doing

```java
int size = 27; // Create an integer named 'size' to value 27
String name = “Fido”; // Create a String named 'name' to value 'Fido'
Dog myDog = new Dog(name, size); // Create a Dog named myDog with name "Fido" and size 27
x = size - 5; // set x equal to size-5 (22)
if (x < 15) myDog.bark(8); // if x is less than 15 (no) then make myDog bark 8 times
while (x > 3) {
	/* while x > 3, make myDog play.
	I believe this is too simplistic since x never decreases here but the point is made */
	myDog.play(); 
}
int[] numList = {2,4,6,8}; // create a list of integers with values 2, 4, 6, & 8
System.out.print(“Hello”); // print "Hello" (string)
System.out.print(“Dog: “ + name); // print "Dog: Fido" <- Combination of 'Dog: ' and the value of the string 'name'
String num = “8”; // Create a String named num and give a (character/string, not numerical) value of "8"
int z = Integer.parseInt(num); //set z equal to the integer value of num (8)
try { // start to try something
	readTheFile(“myFile.txt”); // try to read 'myFile.txt'
} 
catch(FileNotFoundException ex) { // if 'myFile.txt' didn't exist
	System.out.print(“File not found.”); //print out an error
}
```
