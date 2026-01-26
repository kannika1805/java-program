import java.util.Scanner;
public class Rotate90anti {
 public static void main(String[] asrs){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int a[][]=new int[r][r];
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            a[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<r;i++){
        for(int j=i+1;j<r;j++){
            if(i!=j){
                int temp=a[i][j];
                a[i][j]=a[j][i];// s1: take transpores .s2:reverse each clumn//
                a[j][i]=temp;
            }
        }
    } 
    for(int i=0;i<r/2;i++){
        for(int j=0;j<r;i++){
            int temp=a[i][j];
            a[i][j]=a[r-1-i][j];
            a[r-1-i][j]=temp;
        }
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            System.out.print(a[i][j]+" ");        }
    }
    System.out.println();
    sc.close();
 }
}
