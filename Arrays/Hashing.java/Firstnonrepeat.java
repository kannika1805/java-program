import java.util.Scanner;
public class Firstnonrepeat {
public static void main(String[] agrs){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int a[]=new int[r];
    for(int i=0;i<r;i++){
        a[i]=sc.nextInt();
    }
    int h[]=new int[256];
    for(int i=0;i<r;i++){
        h[a[i]]++;
    }
    for(int i=0;i<r;i++){
        if(h[a[i]]==1){
            System.out.print(a[i]+"first non repeating element");
            break;
        }
    }
    sc.close();
} 
}
