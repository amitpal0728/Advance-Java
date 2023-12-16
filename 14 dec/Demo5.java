// program showing the concept of arraylist

import java.util.*;
class Demo5{
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(2300);
        list1.add(30);
        list1.add(4200);
        list1.add(50);
        System.out.println("Minimum element : "+Collections.min(list1));
        System.out.println("Maximum element : "+Collections.max(list1));
        Collections.shuffle(list1);
        System.out.println("Shuffle elements : "+list1);
        Collections.sort(list1);
        System.out.println("Elements in sorted manner : "+list1);
        Collections.reverse(list1);
        System.out.println("Reverse elements : "+list1);

    }
}