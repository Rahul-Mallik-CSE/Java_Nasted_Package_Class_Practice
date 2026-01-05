// import java.util.Scanner; import only one class

import java.util.*; // import all classes from java.util package
import package1.package2.package2_2.Class1;

// import package1.package2.Class1; cannot import this because of name conflict

public class Main {

    public static void main(String[] args){
        
        // //Creating object using full name
        // package1.package2.package2_2.Class1 obj = new package1.package2.package2_2.Class1();

        // java.util.Scanner sc = new java.util.Scanner(System.in);
        
        //Creating object after importing the class
        Scanner sc = new Scanner(System.in);

        Class1 obj = new Class1();
        
        package1.package2.Class1 obj2 = new package1.package2.Class1();
        
    }
}