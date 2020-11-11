package datastructure;

import java.io.*;
import java.util.Properties;

public class DataReader {

    public static void main(String[] args) {
        /*
         * User API to read the below textFile and print to console.
         * Use BufferedReader class.
         * Use try....catch block to handle Exception.
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
         * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
         * order from LinkedList and retrieve as FILO order from Stack.
         *
         * Demonstrate how to use Stack that includes push,peek,search,pop elements.
         * Use For Each loop/while loop/Iterator to retrieve data.
         */

        String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car.txt";

        String data = null;
        try {
            data = getDataFromTextFile("src/data/self-driving-car");
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(data);

    }

    public static String getPropertyFromFile(String filePath, String key) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream(filePath);
        properties.load(inputStream);
        String data = properties.getProperty(key);
        return data;
    }

    public static String getDataFromTextFile(String filePath) throws IOException {
        String tmpContainer;
        String finalText = "";

        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpContainer = bufferedReader.readLine()) != null) {
            finalText = finalText + "\n" + tmpContainer;
        }
        return finalText;
    }



}
