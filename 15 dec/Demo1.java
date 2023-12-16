// program showing the concept of arraylist
import java.util.*;
class Student implements Comparable<Student>{
    int rno;
    double per;
    String name;

    @Override
    public String toString(){
        return rno+"\t"+name+"\t"+per+"\n";
    }

    // parameterized constructor
    Student(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
    }
//     @Override
//     public int compareTo(Student s){
// //        System.out.println(rno+"\t"+s.rno+" = "+(rno-s.rno));
//         return rno-s.rno;
//     }

    // @Override
    // public int compareTo(Student s){
    //     return name.compareTo(s.name);
    // }

    // @Override
    // public int compareTo(Student s){
    //     return name.compareTo(s.name);
    // }

    @Override
    public int compareTo(Student s){
        if(per>s.per)
            return 1;
        else if(per<s.per)
            return -1;
        else
            return 0;
    }

}
class Demo1{
    public static void main(String args[]){
        Student s1 = new Student(101,56.67,"Kndrew Anderson");
        Student s2 = new Student(45,98.32,"Simon Sim");
        Student s3 = new Student(102,59.67,"Jackson Jack");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        // System.out.println("Sorting based on roll number");
        // Collections.sort(list);
        // System.out.println(list);

        // System.out.println("Sorting based on name");
        // Collections.sort(list);
        // System.out.println(list);

        System.out.println("Sorting based on percentage");
        Collections.sort(list);
        System.out.println(list);

    }
}