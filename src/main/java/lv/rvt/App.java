package lv.rvt;

import java.util.ArrayList;
import java.util.Comparator;


public class App {

  public static void main(String[] args) {

    ArrayList<Integer> num = new ArrayList<Integer>();
    num.add(3);
    num.add(1);
    num.add(4);
    num.add(12);
    num.add(53);
    
    System.out.println(num);

    num.sort(Comparator.naturalOrder());
    System.out.println(num);

    num.sort(Comparator.reverseOrder());
    System.out.println(num);

  System.out.println("===================");
  System.out.println("| index  | value   |");
  System.out.println(" ===================");
  for(int  i = 0;i < num.size();i++){
  System.out.printf("| %-5d |   %-5d  | \n",i,num.get(i));
  }
  System.out.println(" ==================");

  
  System.out.println(ConsoleColors.RED_BACKGROUND);
  System.out.println("                     ");

  System.out.println(ConsoleColors.WHITE_BACKGROUND);
  System.out.println("                     ");

  System.out.println(ConsoleColors.RED_BACKGROUND);
  System.out.println("                     ");

  System.out.println(ConsoleColors.RESET);
}

}






