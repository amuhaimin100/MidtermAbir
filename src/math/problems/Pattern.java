package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
         * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
         *
         *
         */

        for(int i = 100; i >= 0; i--) {                     //start from 100 stop at 0
            System.out.println(i);
            if(i == 90) {                                   //complete loop until reach 90
                break;
            }
        }
        for(int i = 88; i >= 0; i=i-2) {                    //from 88, the pattern changes to -2 increments
            System.out.println(i);
            if(i == 70) {                                   //complete loop until reach 70
                break;
            }
        }
        for(int i = 67; i >= 0; i=i-3) {                    //from 67 until 40 the increment is -3
            System.out.println(i);
            if(i == 40) {
                break;
            }
        }
        for(int i = 36; i >= 0; i=i-4) {                    //from 40-0, increment of 4. Can also be broken down to larger increments
            System.out.println(i);
        }

    }
}
