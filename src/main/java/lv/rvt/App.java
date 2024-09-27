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


       System.out.println("Give points[0-100]:");

       Scanner scanner = new Scanner(System.in);
       int grade = Integer.valueOf(scanner.nextLine());

       
       if (grade < 0 ) {
        System.out.println("Impossible");
       } 
       
       else if (grade >= 0 && grade <= 49){
        System.out.println("failed");
       }

       else if (grade >= 50 && grade <= 59){
        System.out.println("1");
       }

       else if (grade >= 60 && grade <= 69){
        System.out.println("2");
       }

       else if (grade >= 70 && grade <= 79){
        System.out.println("3");
       }

       else if (grade >= 80 && grade <= 89){
        System.out.println("4");
       }

       else if (grade <= 100){
        System.out.println('5');
       }

       else {
        System.out.println("incredible!");
       }
    
       
}
}
