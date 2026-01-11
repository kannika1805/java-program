import java.util.Scanner;
public class Numpalindrome{
    public static void main(String[] ARGS){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int temp=a;int rev=0;
    while(a>0){
        int d=a%10;
        rev=rev*10+d;
        a/=10;
    }
    if(rev==temp){
        System.out.print("palindrome");
    }else{
        System.out.print("not palindrome");
    }
    sc.close();
    }
}
