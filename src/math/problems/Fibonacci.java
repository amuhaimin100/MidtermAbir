package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */

        int fib1= 40;                               //1. create variable with value of how many numbers we need to get
        int fib2= 0;                                //2. number 1 of the sequence
        int fib3= 1;                                //3. second number of the sequence

        System.out.println("First "+fib1+ " numbers: ");

        for(int i=1; i<=fib1; i++){                 //4. create for loop start at the first number of the sequence until it reaches 40
            System.out.println(fib2);               //5. start by printing number 1 of the sequence 0
            int sum= fib2+fib3;                     //6. loop should start at 0 and add 1
            fib2=fib3;                              //7. on the next sequence the number should be the same as the previous number
            fib3=sum;                               //8. then keep adding the previous 2 numbers
        }
    }
}
