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

   divisibleByThreeInRange(2,12);
}
public static void divisibleByThreeInRange(int min , int max){
    while(min <= max){
        if (min % 3 == 0){
            System.out.println(min);
        } else{
            min++;
            continue;
        }
        min += 3;
    }
}


}

