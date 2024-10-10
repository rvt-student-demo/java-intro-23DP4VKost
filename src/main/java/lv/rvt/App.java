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

        Scanner scanner = new Scanner(System.in);
        int factorial = 1;
        int num = Integer.valueOf(scanner.nextLine());
        for ( int i = 1; i <= num; i++) {
            factorial *= i;
            
        }
    System.out.println(factorial);
}
}
