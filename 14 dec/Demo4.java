// program showing the concept of arraylist
import java.util.*;
class Student{
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
}
class Demo4{
    public static void main(String args[]){
        Student s1 = new Student(101,56.67,"Andrew Anderson");
        Student s2 = new Student(99,98.32,"Simon Sim");
        Student s3 = new Student(102,59.67,"Jackson Jack");

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);
    }
}