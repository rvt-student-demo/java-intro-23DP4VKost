package lv.rvt;

import java.util.*;

public class App 
{
    
     
    public static void main( String[] args ){
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> names = new ArrayList<>();
            ArrayList<Integer> births = new ArrayList<>();

            while (true) {
                String nameBirthInput = scanner.nextLine();
                if (nameBirthInput.isEmpty()) {
                    break; 
                }
                String[] parts = nameBirthInput.split(",");
                String name = parts[0];
                int birthYear = Integer.parseInt(parts[1]);

                names.add(name);
                births.add(birthYear);
                
            }


            String longestName = "";
            for (String name : names) {
                if (name.length() > longestName.length()) {
                    longestName = name;
                }
            }

            int sum = 0;
            for (int year : births) {
                sum += year;
            }

            double averageBirthYear = sum / (double) births.size();
            System.out.println("Longest name: " + longestName);
            System.out.println("Average of the birth years: " + averageBirthYear);
          
}
}

