// program showing the concept of swapping with generic class concept
// generic class
class Demo3<DT> {
    void swap(DT a,DT b){
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
        Demo3<Integer> obj1 = new Demo3<>();
        obj1.swap(a,b);

        double a1=5.2,b1=2.4;
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a1+"\nb : "+b1);
        Demo3<Double> obj2 = new Demo3<>();
        obj2.swap(a1,b1);

        char a2='a',b2='b';
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a2+"\nb : "+b2);
        Demo3<Character> obj3 = new Demo3<>();
        obj3.swap(a2,b2);

    }
}
