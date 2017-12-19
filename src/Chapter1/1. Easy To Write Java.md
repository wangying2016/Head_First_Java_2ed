
// declare an integer variable named 'size' and give it the value 27
int size = 27;
// declare a string of characters variable named 'name' and give it
// the value "Fido"
String name = "Fido";
// declare a new Dog variable 'myDog' and make the new Dog using
// 'name' and 'size'
Dog myDog = new Dog(name, size);
// subtract 5 from 27 (value of 'size') and assign it to a variable
// named 'x'
x = size - 5;
// if x (value of 22) is less than 15, tell the dog to bark 8 times
if (x < 15) myDog.bark(8);


// keep looping as long as x is greater than 3...
while (x > 3) {
    myDog.play();
}


// declare a list of integers variable 'numList', and put 2, 4, 6, 8
// into the list
int[] numList = {2, 3, 4, 6, 8};
// print out "hello"... probably at the command-line
System.out.print("hello");
// printout "hello Fido" (the value of 'name' is "Fido") at the
// command-line
System.out.print("Dog: " + name);
// declare a character string variable 'num' and give it the value of
// "8"
String num = "8"
// convert the string of characters "8" into an actual numeric value 8
int z = Integer.parseInt(num);

// try to do something... maybe the thing we're trying isn't guaranteed
// to work...
try {
    readTheFile("myFile.txt");
}
// this must be where you find out if the thing you tried didn't work...
catch(FileNotFoundException ex) {
    System.out.print("File not found.");
}