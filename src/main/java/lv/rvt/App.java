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



   printStars(5);
   printStars(3);
   printStars(9);
    space();
   printSquare(4);
   space();
   printRectangle(17,3);
   space();
   printTriangle(4);
}
///space
public static void space(){
    System.out.println("");
}

///1.
public static void printStars(int star)
{

for(int i = 0;i < star;i++){
    System.out.print("*");
}
    System.out.println("");


}

///2.
public static void printSquare(int size)
{

for(int table = 0; table < size;table++){

for(int i = 0;i < size;i++){
    System.out.print("*");
}
    System.out.println("");

}
}

///3.

public static void printRectangle(int width , int heigth)
{

for(int h = 0;h<heigth;h++){

for(int i = 0;i < width;i++){
    System.out.print("*");
}
    System.out.println("");
}

}

///4.
public static void printTriangle(int size)
 {

for (int x = 0; x <= size; x++)
    {
        for (int i = 0; i < x; i++)
        {
            System.out.print("*");
        }
        System.out.println("");


    }
 }

}



