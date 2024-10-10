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

        int numbersRead = 0;
        int sum = 0;
        int check = 1;


        while(true){
            if (check == 0) {
                break;
        }

        System.out.println("Give a number:");
        int integer = Integer.valueOf(scanner.nextLine());
        sum = sum + integer;
        numbersRead = numbersRead + 1;
        check = integer;
        }

        numbersRead = numbersRead - 1;
        System.out.println("Number of numbers:" + numbersRead);
        System.out.println("The sum of the number is:" + sum);
}
}
