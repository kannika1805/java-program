import java.util.Scanner;
public class Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        char a[]=new char[r];
        for(int i=0;i<r;i++){
            a[i]=sc.next().charAt(i);
        }
        int h[]=new int[256];
        for(int i=0;i<256;i++){
            h[a[i]]++;
        }
        for(int i=0;i<256;i++){
            if(h[a[i]]==1){
            System.out.print(a[i]+" ");}
        }
    sc.close();
    }
}
