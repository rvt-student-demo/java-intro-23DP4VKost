package lv.rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Statistic statistic = new Statistic();
        Statistic even = new Statistic();
        Statistic odd = new Statistic();

        System.out.println("Enter number:");

        while (true) {
            int num = scanner.nextInt();

            if (num == -1) {
                break;
            }
            statistic.addNumber(num);

            if (num % 2 == 0) {
                even.addNumber(num);
            } 
            else {
                odd.addNumber(num);
            }

        }
        System.out.println("Count:" + statistic.count());
        System.out.println("Average:"+ statistic.average());
        System.out.println("Sum: " + statistic.sum());
        System.out.println("Sum of even numbers: " + even.sum());
        System.out.println("Sum of odd numbers: " + odd.sum());

    }

}
