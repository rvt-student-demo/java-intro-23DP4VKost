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


int sum = 0;
int count = 0;
int even = 0;
int odd = 0;

Scanner scanner = new Scanner(System.in);
System.out.println("Give numbers:");

while (true) {
    int number = Integer.valueOf(scanner.nextLine());
    if (number == -1) {
        break;
     } 
    
    else {
        sum += number;
        count++;
            if (number % 2 == 0) {
                even++;
            } 

         else {
            odd++;
        }
    }
}
double average = (double)sum / (double) count;
System.out.println("Thx! Bye!");
System.out.println("Sum: " + sum);
System.out.println("Numbers: " + count);
System.out.println("Average: " + average);
System.out.println("Even: " + even);
System.out.println("Odd: " + odd);
}
}
