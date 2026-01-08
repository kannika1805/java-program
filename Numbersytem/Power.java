import java.util.Scanner;
public class Power{
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),b=sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
             pow=pow*n;
        }System.out.println("power"+pow);//n base//
        //b power//
    }
}
