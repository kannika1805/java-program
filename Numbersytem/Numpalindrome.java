import java.util.Scanner;
public class Numpalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("entermultidigit");
        int n=sc.nextInt();
        int rev=0;
        int temp=n;
        while(n>0){
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("palindrome"); 
        }else{
            System.out.println("not palindrome");
        
        sc.close();
        } }
}