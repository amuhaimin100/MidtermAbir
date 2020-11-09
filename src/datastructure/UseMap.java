package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class UseMap {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Map that includes storing and retrieving elements.
         * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         */

        HashMap<Integer, String> areaAndCity = new HashMap<>();
        areaAndCity.put(718,"New York City");
        areaAndCity.put(405,"Oklahoma City");
        areaAndCity.put(410,"Miami");                                       //store information
        System.out.println(areaAndCity.get(410));                           //retrieve information

        ArrayList<String>lists= new ArrayList<>();
        lists.add("New York");
        lists.add("Oklahoma");
        lists.add("Florida");

        HashMap<String,ArrayList<String>>list= new HashMap<String,ArrayList<String>>();
        list.put("State",lists);                                               //add a list into a map


        Iterator iterator= lists.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());                               //while loop to retrieve data
        }

        lists.forEach(state-> System.out.println(state));                      //for each loop to retrieve data
    }

}
