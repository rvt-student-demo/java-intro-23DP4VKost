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
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scanner.nextLine());
   
        
        if (value < 5000) {
            System.out.println("No tax!");
        } 

        else if (value >= 5000 && value < 25000){
            double fitst_tax = (100 + (value - 5000)*0.8);
            System.out.println("Tax:" + fitst_tax);
        } 
    
            
            else if (value >= 25000 && value < 55000){
            double second_tax = (1700 + (value - 25000)*0.10);
            System.out.println("Tax:" + second_tax);
         }
         
         else if (value >= 55000 && value < 200000){
            double third_tax = (4700 + (value - 55000)*0.12);
            System.out.println("Tax:" + third_tax);
        } 
            
            else if (value >= 200000 && value < 1000000){
            double fourth_tax = (22100 + (value - 200000)*0.15);   
            System.out.println("Tax:" + fourth_tax);
        } 
        
        else if (value >= 1000000){
            double fifth_tax = (142100 + (value - 1000000)*0.17);
            System.out.println("Tax:" + fifth_tax);
        }
        
}
}
