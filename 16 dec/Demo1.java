// program showing the concept of LinkedList

import java.util.*;
class Demo1{
        public static void main(String args[]){
            LinkedList<Integer> list = new LinkedList<>();
            list.offer(100);
            list.offer(200);
            list.offer(300);
            list.offer(400);
            System.out.println("Elements : "+list);

            list.offerFirst(600);
            list.offerLast(900);
            System.out.println("Elements : "+list);
        }
}   