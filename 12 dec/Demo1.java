// Program showing the concept of wrapper class

class Demo1{
    public static void main(String args[]){
        int num=100;
        //Integer obj = new Integer(num);
        Integer obj = Integer.valueOf(num);
        System.out.println("primitive value : "+num);
        System.out.println("object : "+obj);

        int value1 = obj.intValue();
        System.out.println("integer value : "+value1);
        
        String str = obj.toString();
        System.out.println("string value : "+str);

        String num1 = "100";
        int num2 = Integer.parseInt(num1);
        System.out.println("num2 : "+num2);
    }
}