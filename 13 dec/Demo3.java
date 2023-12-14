// program showing the concept of ArrayList

import java.util.*;
class ArrayListDemo3{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        
        list.add(new Integer(200));
        
        list.add(Integer.valueOf(300));
        
        Integer obj = new Integer(400);
        list.add(obj);

        Integer obj1 = 500;
        list.add(obj1);

        list.add(null);
        
        System.out.println(list);
    }
}