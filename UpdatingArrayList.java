package day41_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        // Car List

        List<String> myCars = new ArrayList<>();
        myCars.add("Lada");
        myCars.add("Toyota");
        myCars.add("Ford");
        myCars.add("Dodge");
        myCars.add("Tesla");
        myCars.add(0, "Jeep");

        System.out.println(myCars.toString());
        String allCarsIn1Str = myCars.toString();

        // Change index 0 to Lamborghini

        myCars.set(0, "Lamborghini");
        System.out.println("After Set = " + myCars.toString());

        // Change 4 to Honda
        myCars.set(4, "Honda");

        System.out.println("After set Honda to 4 = " + myCars.toString());

        // replace ford with Trabant

        myCars.set(myCars.indexOf("Ford"), "Trabant");

        System.out.println("Replacing Ford with Trabant = " + myCars);

        if(myCars.contains("Lada")){
            myCars.set(myCars.indexOf("Lada"),"Bugatti");
        }else{
            System.out.println("Lada is not founds");
        }
        System.out.println("After set = " + myCars);

        for (int i=0; i <= myCars.size(); i++){
            if (myCars.get(i).equals("Lamborghini")){
                myCars.set(i, "Prius");
            }else if( myCars.get(i).equals("Lada")){
                myCars.set(i, "Lexus");
            }else if (myCars.get(i).equals("Trabant")){
                myCars.set(i, "Audi");
            }
            System.out.println("After loop = " + myCars);
        }

    }
}
