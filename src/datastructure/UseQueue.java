package datastructure;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++)
            q.add(i);                                           //add elements to queue


        System.out.println("Elements of queue "                 //display elements of queue
                + q);


        int removedele = q.remove();                            // To remove the head of queue.
        System.out.println("removed element-"
                + removedele);

        System.out.println(q);


        int head = q.peek();                                    // To view the head of queue: use peek
        System.out.println("head of queue-"
                + head);


        int size = q.size();
        System.out.println("Size of queue-"
                + size);


        Iterator<Integer> itr = q.iterator();                   //use iterator and while loop
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }


}