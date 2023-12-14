// program showing the concept of ArrayList

import java.util.*;
class ArrayListDemo1{
    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        ArrayList list = new ArrayList();
        list.add(100);
        list.add("Hello");
        list.add(100.45);
        list.add('r');
        list.add(true);
        list.add(-123);
        
        System.out.println(list);
    }
}