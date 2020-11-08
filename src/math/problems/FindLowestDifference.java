package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */

        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int m = array1.length;                                                       //8. calculate lengths of arrays
        int n = array2.length;

        System.out.println(findLowestDifference(array1, array2, m, n));              //9. print lowest difference


    }

    static int findLowestDifference(int[] array1, int[] array2, int m, int n) {     //1.create return method

        Arrays.sort(array1);                                                        //2. sort both arrays using sort function
        Arrays.sort(array2);

        int a = 0, b = 0;


        int result = Integer.MAX_VALUE;                                             //3. initialize result as max value


        while (a < m && b < n) {                                                    //4. create while loop
            if (Math.abs(array1[a] - array2[b]) < result)
                result = Math.abs(array1[a] - array2[b]);


            if (array1[a] < array2[b])                                              //5. move smaller value
                a++;

            else
                b++;
        }


        return result;                                                              //6. return result
    }


}
