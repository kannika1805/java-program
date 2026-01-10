import java.util.Scanner;
public class Strongnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the digits");
        int a=sc.nextInt();int sum=0;
        while(a>0){
            int d=a%10;int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
             sum=sum+fact;//sum of fact of all digits in number gives same number//
             a/=10;
        }
        if(a==sum){
            System.out.print("strong number");
        }else{
            System.out.print("not astrong number");
        }
        sc.close();
    }
}