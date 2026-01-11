import java.util.Scanner;
public class Harsadnumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;int temp=n;
        while(temp>0){
            int d=temp%10;// 21 ,2+1=3 ,21/3 remainder=0 is harsad number//
            sum=sum+d;
            temp/=10;
        }
        n=n%sum;
        if(n==0){
            System.out.print("Harsad number");
        }else{
            System.out.print("not a harsad number");
        }
        sc.close();
    } 
}
 