package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */

        ArrayList<String> cities = new ArrayList<>();
        cities.add("NYC");                                    //add data
        cities.add("Las Vegas");
        cities.add("Boston");
        cities.add("Dallas");
        cities.remove(1);                               //remove index:1 Las Vegas


        System.out.println(cities.get(0));                    //retrieve element


        Iterator iterator = cities.iterator();               // Use Iterator and while loop
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        cities.forEach(city -> System.out.println(city));    //use for each method

    }

}
