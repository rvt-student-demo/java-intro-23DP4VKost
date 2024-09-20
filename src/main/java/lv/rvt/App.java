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
        
        System.out.println("Give the first number:");

        int integerFirst = Integer.valueOf(scanner.nextLine()); 
        

        System.out.println("Give the second number:");

        int integerSecond = Integer.valueOf(scanner.nextLine());

        String valueFirst = String.valueOf(integerFirst);
        String valueSecond = String.valueOf(integerSecond);

        int sum = integerFirst + integerSecond;
        int min = integerFirst - integerSecond;
        int mult = integerFirst * integerSecond;
        double div = integerFirst / integerSecond;

        System.out.println(valueFirst+" + "+valueSecond+" = "+" "+ sum);
        System.out.println(valueFirst+" - "+valueSecond+" = "+" "+ min);
        System.out.println(valueFirst+" * "+valueSecond+" = "+" "+ mult);
        System.out.println(valueFirst+" / "+valueSecond+" =" +" "+ div);



    }
}
