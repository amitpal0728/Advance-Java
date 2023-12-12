// program showing the concept of swapping without generic concept
public class Demo2 {
    static void swap(int a,int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping : ");
        System.out.println("a : "+a+"\nb : "+b);
    }
    static void swap(double a,double b){
        double temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping : ");
        System.out.println("a : "+a+"\nb : "+b);
    }
    static void swap(char a,char b){
        char temp = a;
        a=b;
        b=temp;
        System.out.println("After Swapping : ");
        System.out.println("a : "+a+"\nb : "+b);
    }
 
   public static void main(String args[]){
        int a=5,b=2;
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a+"\nb : "+b);
        swap(a,b);

        double a1=5.2,b1=2.4;
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a1+"\nb : "+b1);
        swap(a1,b1);

        char a2='a',b2='b';
        System.out.println("\nBefore Swapping : ");
        System.out.println("a : "+a2+"\nb : "+b2);
        swap(a2,b2);

    }
}
