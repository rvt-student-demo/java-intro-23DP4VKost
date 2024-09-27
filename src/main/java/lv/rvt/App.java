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

    System.out.println("Give speed:");
    Scanner scanner = new Scanner((System.in));
    int speed = Integer.valueOf(scanner.nextLine());
    if (speed > 120) {
        System.out.println("Speeding ticket!");
    }
}
}
