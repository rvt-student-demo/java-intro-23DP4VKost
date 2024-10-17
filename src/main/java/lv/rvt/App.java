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
    int min = Integer.valueOf(scanner.nextLine());
    int max = Integer.valueOf(scanner.nextLine());
    divisibleByThreeInRange(min , max);
    }
   
    
public static void divisibleByThreeInRange(int min , int max)
    {
        while(min<=max){
            System.out.println(min);
            min = min + 3;
        }

    }

}

