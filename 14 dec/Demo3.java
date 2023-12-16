// program showing the concept of arraylist

import java.util.*;
class Demo3{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements : ");
        int num = sc.nextInt();
        
        for(int i=0;i<num;i++){
            list.add(sc.nextInt());
        }

        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.print("\t"+itr.next());
        }
    }
}