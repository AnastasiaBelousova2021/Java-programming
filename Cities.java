package day41_ArrayList;
import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        // declare arraylist
        ArrayList<String> cities = new ArrayList<>();

        // add values which in this case are Cities.
        cities.add("Washington DC"); // index 0
        cities.add("New York City"); // index 1
        cities.add("Vienna");        // index 2
        cities.add("Adana");         // index 3
        cities.add("LA");            // index 4

        // add another city to index 0
        cities.add(0, "Vladivostok" );

        System.out.println(cities);

        // How to print first and last city
        System.out.println("First City - " + cities.get(0));
        System.out.println("Last City - " + cities.get(5));

        //find last index using size method
        System.out.println("Last City - " + cities.get(cities.size()-1));

        // print count of items in arraylist
        System.out.println("Count of Cities - " + cities.size());

        int size = cities.size();
        System.out.println("There are " + size + " cities in the list");

        // for loop and print all values in same line

        for(int i = 0; i < cities.size()/2; i++){
            System.out.print(cities.get(i) + " ");
        }
        System.out.println();
        // for each loop
        for (String city : cities){
            System.out.print(city + " ");
        }
        System.out.println();

        //delete item from Array List
        // 1.
        cities.remove(2);
        // or
        cities.remove("New York City");
        System.out.print("After Remove - " + cities);
        System.out.println();

        // delete/remove all values from list

        cities.clear();
        System.out.println("After clearing list - " + cities);
        // Second Way - isEmpty

        if (cities.isEmpty()){
            System.out.println("Empty");
        }
        // Third Way - checking the size
        if (cities.size() == 0){
            System.out.println("List is Empty");
        }






    }

}
