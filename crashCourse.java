// Java basics fun
/*
Java comment
*/
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.Optional;

public class crashCourse {
//    every public type has to be in its own file
//    1. public(accessible anywhere)
//    2. package-private(accessible anywhere in the package
//    3. protected(package private plus accessible from any subclass, even in a different package)
//    4. private(accessible only from this class)
//    Constants!: By convention only uses macro case(all uppercase)
    static final int NUM_FRIENDS = 4;
    public static void  main(String[] args){
//        static means classic level(don't need an object to invoke)
//        static means no "this" reference
//        String[] is the data type for the parameter args
//        args is the parameter to store command line arguments

        System.out.println(args.length);

//        VARIABLES
//        8 primitives in java
//        1. char
        char myChar = 'n';
        System.out.println(myChar);
//        2. int
//        3. double
        double myDouble = Math.PI;
//        the Math class is in the java.lang package which you get imported for free
        System.out.println("myDouble: " + myDouble);
//        print("%2f", myDouble)
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(myDouble));
//        4. boolean
        boolean myBool = true; //false
        System.out.println("myBool: " + myBool);
//        5. short
//        6. long
//        7. float
//        8. byte

//        STRINGS
        String myString = "Hello";
        System.out.println("Mystring: " + myString);
//        because String is a class, we have acess to several members of the String class
        System.out.println(myString.length());
//        equals()/compareTo() = helpful for comparing to strings for equality or order
//        trim() = removes any trailing or extra whitespace
//        split() = splits strings into substrings by a token
//        toCharArray() = converts a string to an array of chars
//        charAt() = to get a specific character in a string instead of parsing through like you would
//                   have to in C/C++

//        ARRAYS
//        declare and initialize an array at the same time:
        int[] myInts = {7,4,8,3};
        System.out.println(myInts); //what prints here is info about the object ex. the type, identity of objects, etc
//        use the Arrays class and its static toString() to print out contents of array
        System.out.println(Arrays.toString(myInts));

//        declare our array and initialize "later"
        String[] myFriends = new String[NUM_FRIENDS];
        myFriends[0] = "Phoebe";
        myFriends[1] = "Ross";
        myFriends[2] = "Monica";
        myFriends[3] = "Joey";

        System.out.println(Arrays.toString(myFriends));
        System.out.println(myFriends.length);
        System.out.println(myFriends[myFriends.length-1]);

//        CONTROL FLOW
        int x = 5;
        if(x<5){
            System.out.println("X is less than 5");
        }
        else if(x>5){
            System.out.println("x is greater than 5");
        }
        else{
//            case where x is 5
            System.out.println("x is 5");
        }

//        loops... for, while, and do while
//        print out the first 20 even numbers
//        2,4,6 ... 40
        for(int i = 2; i <=40; i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 1;
        while(i <= 20){
            System.out.print(i*2 + " ");
            i++;
        }
        System.out.println();

        i = 2;
        do{
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }while(i <= 40);
        System.out.println();

//        for each loop(range based for loop)
        for ( String friend : myFriends){
            System.out.print(friend + " ");
        }

//      METHODS(java term for functions)
//        static methods for class level methods (no access to an invoking object)... no reference
//        non static methods for instance level methods(access to a this reference)
//        method that returns true if two strings have the same last character, false otherwise
        System.out.println(hasSameLastChar("hello", null));
        System.out.println(hasSameLastChar("hello", "o"));
        System.out.println(hasSameLastChar("hello", ""));


//        RANDOM NUMBERS
        Random randObject = new Random();
        int randInt = randObject.nextInt(6);
        System.out.println(randInt);

//        USER INPUT
//        Use the Scanner class to "scan" from keyboard(System.in is standard input)
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        int favNum = kb.nextInt(); // leaves the newline in the buffer!
        System.out.println("Favnum: " + favNum);
        kb.nextLine(); // flushes out the newline character from nextInt

        System.out.println("Enter your favorite place: ");
        String favPlace = kb.nextLine();
        System.out.println("Fav place: " + favPlace);

//        take a look at hasNext();



    }

    public static boolean hasSameLastChar(String first, String second){
//        null refers to an invalid reference
        if(first != null && second != null){
//            make sure each string has at least one character
            if(first.length() > 0 && second.length() > 0){
                return first.charAt(first.length()-1) == second.charAt(second.length()-1);
            }
        }

        return false;
    }

}
