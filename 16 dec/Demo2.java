// program showing the concept of LinkedList

import java.util.*;
class Demo2{
        public static void main(String args[]){
           Vector<Character> vec = new Vector<>();
           vec.addElement('a');
           vec.add('b');
           vec.addElement('c');
           vec.add(null);
           vec.addElement('d');
           
           Enumeration e = vec.elements(); 
           while(e.hasMoreElements()){
                System.out.println("\t"+e.nextElement());
           }
        }
}   