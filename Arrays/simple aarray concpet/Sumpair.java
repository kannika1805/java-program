import java.util.Scanner;
public class Sumpair {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();int a[]=new int[r];
        System.out.print("enter the sum");int n=sc.nextInt();
        for(int i=0;i<r;i++){
                a[i]=sc.nextInt();
            }
        for(int i=0;i<r;i++){
           int pair=a[i];
           for(int j=0;j<r;j++){
            if(i!=j){
                if((pair+a[j])==n){
                    System.out.print("the pair number is"+pair+","+a[j]);
                }
            }

           }
        }
        sc.close();
    }
}
