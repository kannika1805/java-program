import java.util.Scanner;
public class Sortthenmerge{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int a[]=new int[n1];
        for(int i=0;i<n1;i++)
            a[i]=sc.nextInt();
        for(int i=0;i<n1;i++){
         for(int j=0;j<n1;j++)
         {

            if(a[i]>a[j]){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
        int n2=sc.nextInt();
        int b[]=new int[n2];
        for(int j=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++)s
  }
}
