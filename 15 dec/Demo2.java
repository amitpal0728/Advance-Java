// program showing the concept of arraylist
import java.util.*;
class Student1{
    int rno;
    double per;
    String name;

    @Override
    public String toString(){
        return rno+"\t"+name+"\t"+per+"\n";
    }

    // parameterized constructor
    Student1(int rno,double per,String name){
        this.rno=rno;
        this.per=per;
        this.name=name;
    }
}

class SortByRollNumber implements Comparator<Student1>{
    @Override
    public int compare(Student1 s1,Student1 s2){
        return s1.rno-s2.rno;
    }
}
class SortByName implements Comparator<Student1>{
    @Override
    public int compare(Student1 s1,Student1 s2){
        return s1.name.compareTo(s2.name);
    }
}
class SortByPercentage implements Comparator<Student1>{
    @Override
    public int compare(Student1 s1,Student1 s2){
        if(s1.per>s2.per)
            return 1;
        else if(s1.per<s2.per)
            return -1;
        else
            return 0;
    }
}
class Demo2{
    public static void main(String args[]){
        Student1 s1 = new Student1(101,56.67,"Kndrew Anderson");
        Student1 s2 = new Student1(45,98.32,"Simon Sim");
        Student1 s3 = new Student1(102,59.67,"Jackson Jack");

        ArrayList<Student1> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);

        System.out.println(list);

        System.out.println("Sorting based on roll number");
        Collections.sort(list,new SortByRollNumber());
        System.out.println(list);

        System.out.println("Sorting based on name");
        Collections.sort(list,new SortByName());
        System.out.println(list);

        System.out.println("Sorting based on percentage");
        Collections.sort(list,new SortByPercentage());
        System.out.println(list);

    }
}