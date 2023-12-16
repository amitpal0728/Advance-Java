// program showing the concept of arraylist

import java.util.*;
class Demo2{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("size : "+list.size());
        System.out.println("isEmpty : "+list.isEmpty());
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        System.out.println(list);
        list.set(2,1000);
        System.out.println(list);
       // list.remove(2);
        list.remove(new Integer(400)); 
       System.out.println(list);
     System.out.println("size : "+list.size());
        System.out.println("isEmpty : "+list.isEmpty());
       
    }
}