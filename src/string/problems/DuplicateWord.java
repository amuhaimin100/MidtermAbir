package string.problems;

import java.util.HashMap;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        String[] splitData = st.split(" ");

        double totalChars = 0;
        for (String s : splitData) {
            totalChars += s.length();
        }

        double words = splitData.length;
        double avgLength = (double) (totalChars / words);
        System.out.println("Average length of words is " + avgLength);

        HashMap<String, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < splitData.length; i++) {
            Integer previousCount = occurrences.get(splitData[i]);
            if (previousCount == null) {
                previousCount = 0;
            }
            occurrences.put(splitData[i], previousCount + 1);
        }

        System.out.println(occurrences);

    }

}
