import java.util.Scanner;
public class Movezero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();int a[]=new int[r];      
         for(int i=0;i<r;i++){
                a[i]=sc.nextInt();
            }
        for(int i=0;i<r;i++){
            for(int j=i+1;j<r;j++){
                if(a[i]==0 && a[j]!=0){
                   int temp=a[j];
                   a[j]=a[i];
                   a[i]=temp;
                }           
            }
        }
        for(int i=0;i<r;i++){
            System.out.print(a[i]);
        }
        sc.close();
    }
}
