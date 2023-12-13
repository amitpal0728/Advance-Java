// Program showing the concept of wrapper class

class Demo2{
    static void myFun1(Integer obj){
        System.out.println("object : "+obj);
        System.out.println("primitive value : "+obj.byteValue());
    }
    static void myFun2(int num){
        System.out.println("primitive  : "+num);
    }
    static void myFun3(Integer obj){
        System.out.println("instance containing null value : "+obj);
    }

    public static void main(String args[]){
        int num=100;
        Integer obj = num; // autoboxing
        System.out.println("primitive value : "+num);
        System.out.println("object : "+obj);

        int value1 = obj; // unboxing
         System.out.println("integer value : "+value1);
        
            myFun1(130);
            myFun2(new Integer(100));
            myFun3(null);
        }
}