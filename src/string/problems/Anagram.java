package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String a= "deductions";
        String b= "discounted";

        getAnangram(a,b);
    }

    public static void getAnangram(String a, String b){
        char[]firstArray= a.toCharArray();
        char[]secondArray=b.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);

        boolean anangram = Arrays.equals(firstArray,secondArray);

        if(anangram) {
            System.out.println("values are anangram");
        }else{
            System.out.println("values aren't annagram");
        }
    }
}
