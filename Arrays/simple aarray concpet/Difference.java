import java.util.Scanner;
public class Difference {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();System.out.print("enter the difference:");int n=sc.nextInt();
        int a[]=new int[r];
        for(int i=0;i<r;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<r;i++){
            int pair =a[i];
            for(int j=i+1;j<r;j++){
                if((pair-a[j]==n|| a[j]-pair==n) && i!=j){
                    System.out.print("pair elements are:"+pair+","+a[j]);
                }
            }
        }
        sc.close();

    }
}
