import java.util.Scanner;
public class Perfectnum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int sum=0;
        for(int i=1;i<n;i++){
          if(n%i==0){  //expect that num ,its divier's sum  is as same as num//
          sum+=i;}
        }
        if(sum==n&&n>=1){
            System.out.print("perfect number");
}
else{
    System.out.print("not a perfect number");
}sc.close();
    }
}