import java.util.Scanner;
 public class Sortarray {
    public static void main(String[] ars){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[]=new int[r];
        for(int i=0;i<r;i++){
                a[i]=sc.nextInt();// hashing stores elemnt as index//
        }
        int h[]=new int[256];
        for(int i=0;i<r;i++){
            if(a[i]>=0 && a[i]<256){
                h[a[i]]++;            }
        }
        for(int i=0;i<r;i++){
            System.out.print(i+'-'+h[i]+"times");
        }
        sc.close();
    }
}
