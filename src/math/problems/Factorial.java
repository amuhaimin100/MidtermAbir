package math.problems;

public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //a: using Recursion
        //b: using Iteration

        int factorial = fct(5);                                     //a7. create container for the return value
        System.out.println("a. Factorial of 5 is: " + factorial);      //a8. print factorial using Recursion

        int number = 5;                                                  //b1. create variable number declare value of 5
        int fact = 1;                                                    //b2. create variable fact and value 1
        for (int i = 1; i <= number; i++) {                              //b3. create for loop
            fact = fact * i;                                             //b4. everytime fact is called it will multiply the next number with 1 until it reaches 5
        }
        System.out.println("b. Factorial of 5 is: " + fact);             //b5. print factorial using iteration

    }

    public static int fct(int f) {                                      //a1. create a static return method with a int parameter
        int output;                                                     //a2. declare in variable output
        if (f == 1) {                                                   //a3.add condition

            return 1;                                                   //a4. return value
        }
        output = fct(f - 1) * f;                                     //a5.Recursion: calling itself
        return output;                                                  //a6. return variable
    }

}

