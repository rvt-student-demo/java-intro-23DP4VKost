package lv.rvt;

import java.util.*;

public class App 
{
    public static void main( String[] args )
    {
        //Scanner scanner = new Scanner(System.in);
        //String text = scanner.nextLine();  string no user
        //int integer = Integer.valueOf(scanner.nextLine());  int  no user
        //double floatingPoint = Double.valueOf(scanner.nextLine()); decimal no user
        //boolean trueOrFalse = Boolean.valueOf(scanner.nextLine()); t/f  

//My main method
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many times?");
        int integer = Integer.valueOf(scanner.nextLine());
        int check = 0;
        while(check < integer){
            printText();
            check = check + 1;
    }
    }
    
    
public static void printText() {
    System.out.println("In a hole in the ground there lived a method.");
}

}

