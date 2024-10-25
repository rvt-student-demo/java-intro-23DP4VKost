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

        printSpaces(1);
        System.out.println("");

        printTriangleReverse(4);
        System.out.println("");

        christmasTree(4);
        System.out.println("");

        christmasTree(10);
    }

public static void printSpaces(int number) {
        for(int i = 0; i < number ; i++){
            System.out.print(" ");
        }
}

public static void printStars(int number) {
                for(int i = 0; i < number; i++){
                    System.out.print("*");
                } System.out.println("");
            }


public static void printTriangleReverse(int size) {
    int i = 0;
    int j = size-1;
     while(i < size && j >= 0){
        printSpaces(j);
        printStars(i);
        i++;
        j--;
            }
}


public static void christmasTree(int height) {
    int x = 1;
    int y = height-1;
        while(y >= 0){
            printSpaces(y);
            printStars(x);
            x=x+2;
            y--;
        
            if (y==-1){
              printSpaces(height-2);
              System.out.println("***");
              printSpaces(height-2);
              System.out.println("***");
                    }
                }
            }
        }
