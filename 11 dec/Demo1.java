// program showing the concept of customize exception

import java.util.Scanner;
class InsuffientBalanceException extends Exception{
    InsuffientBalanceException(String message){
        super(message);
    }
}
class WithDraw{
    int bal;
    WithDraw(int bal){
        this.bal=bal;
    }
    void getWithDrawal() throws InsuffientBalanceException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter withdrawal amount : ");
        int wamt = sc.nextInt();
        
        if(wamt>=bal)
        {
            throw new InsuffientBalanceException("Low Balance");
        }else{
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            System.out.println("Remaining balance : "+(bal-wamt));
        }
    }
}
class Demo1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int bal = sc.nextInt();

        WithDraw obj = new WithDraw(bal);
        try{
            obj.getWithDrawal();       
        }catch(InsuffientBalanceException e){
            System.out.println("Exception : "+e);
        }finally{
            System.out.println("Finally block executes");
        }
    }
}