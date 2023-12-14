// program showing the concept of ArrayList

import java.util.*;
class ArrayListDemo4{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        
        list.add(new Integer(200));
        
        list.add(Integer.valueOf(300));
        
        Integer obj = new Integer(400);
        list.add(obj);

        Integer obj1 = 500;
        list.add(obj1);

//        list.add(null);
        
        //System.out.println(list);
        
        // for(Integer i : list)
        // {
        //     System.out.print("\t"+i);
        // }

        // for(int i : list)
        // {
        //     System.out.print("\t"+i);
        // }

        // Iterator itr = list.iterator();
        // while(itr.hasNext()){
        //     System.out.print("\t"+itr.next());
        // }

        for(Iterator itr = list.iterator();itr.hasNext();){
            System.out.print("\t"+itr.next());
        }


        // ListIterator itr = list.listIterator();
        // System.out.println("Forward direction");
        // while(itr.hasNext()){
        //     System.out.print("\t"+itr.next());
        // }
        // System.out.println("\nBackward direction");
        // while(itr.hasPrevious()){
        //     System.out.print("\t"+itr.previous());
        // }

    }
}