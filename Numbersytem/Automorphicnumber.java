import java.util.Scanner;
public class Automorphicnumber{
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;int pow=1;
        for(int i=1;i<=2;i++){
            pow=pow*n;
        }
        int d=pow%10;
        if(d==n){
            System.out.print("Automorphic number");
        }else{
            System.out.print("not automorphic number");
        }
        sc.close();
    }
}
