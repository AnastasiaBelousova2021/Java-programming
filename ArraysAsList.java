package day41_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(23, 1, 34, 54, 654));
        nums.add(10);
        System.out.println("Nums = " + nums);

        /**
         List String drinksWithCaffeine -> coffee, tea, monster, red bull, coke, pepsi, mdew, kambucha,
         celsius
         */

        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", " red bull",
                "coke", "pepsi", "mdew", "kambucha", "celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drinks : drinksWithCaffeine) {
            if (drinks.equals("monster") || drinks.equals("red bull") || drinks.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drinks + " = " + caffeineAmount);
            } else if (drinks.equals("coffee") || drinks.equals("Kambucha")) {
                caffeineAmount = 112;
                System.out.println(drinks + " = " + caffeineAmount);
            } else if (drinks.equals("tea") || drinks.equals("coke") || drinks.equals("pepsi")) {
                caffeineAmount = 100;
                System.out.println(drinks + " = " + caffeineAmount);


            }

        }
        for (String drink : drinksWithCaffeine){
            switch (drink){
                case "monster": case "red bull" : case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " = " + caffeineAmount);
                    break;
                case "coffee" : case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " = " + caffeineAmount);
                case "tea" : case "coke" : case "pepsi":
                    caffeineAmount = 100;
                    System.out.println(drink + " = " + caffeineAmount);
            }
        }
    }
}
