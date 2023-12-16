// program showing the concept of LinkedList

import java.util.*;
class Demo3{
        public static void main(String args[]){
            Stack<Integer> stack = new Stack<>();
            
            System.out.println(stack);
            stack.push(100);
            
            System.out.println(stack);
            stack.push(200);
            
            System.out.println(stack);
            stack.push(300);
            
            System.out.println(stack);
            stack.push(400);
            
            System.out.println(stack);
            System.out.println("Element(peek) : "+stack.peek());
            System.out.println("Element(pop) : "+stack.pop());
            
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);
            stack.pop();
            System.out.println(stack);            
        }
}   