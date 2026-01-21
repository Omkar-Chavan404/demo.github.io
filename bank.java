import java.util.Scanner;
public class bank{
    void show(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name :");
        String nm=sc.next();
        System.out.println("Enter Your Account no. :");
        Long acc_no=sc.nextLong();
        System.out.println("Enter Your Deposite :");
        double Deposite=sc.nextDouble();
        System.out.println("Account Details :"+nm+"\t"+acc_no+"\t"+Deposite);
        System.out.println("Enter Your withdraw Amount :");
        double w=sc.nextDouble();
        double r=Deposite-w;
        System.out.println("Remaining Balance :"+r);
    }
    public static void main(String[]args)
    {
        
        bank a =new bank(); 
        a.show();
    }
} 
    

