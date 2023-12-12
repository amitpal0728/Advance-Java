// program showing the concept of swapping with generic class and generic function concept
class MyClass{}
class Demo4<DT> {
    // generic method
    <DT>void swap(DT a,DT b){
        DT temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping : ");
        System.out.println("a : "+a+"\nb : "+b);
    }
   public static void main(String args[]){
        int a=5,b=2;
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a+"\nb : "+b);
        Demo4<MyClass> obj = new Demo4<>();
        obj.swap(a,b);

        double a1=5.2,b1=2.4;
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a1+"\nb : "+b1);
        obj.swap(a1,b1);

        char a2='a',b2='b';
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a2+"\nb : "+b2);
        obj.swap(a2,b2);
    }
}
