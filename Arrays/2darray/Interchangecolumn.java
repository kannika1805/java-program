import java.util.Scanner;
public class Interchangecolumn {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int r=sc.nextInt();
       int a[][]=new int[r][r];
       for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            a[i][j]=sc.nextInt();
        }
       }
       for(int i=0;i<r;i++){
                int temp=a[i][0];
                a[i][0]=a[i][r-1];
                a[i][r-1]=temp;  }
       for(int i=0;i<r;i++){
        for(int j=0;j<r;j++){
            System.out.print(a[i][j]);
        }
       }
       sc.close();//interchange first and lastcolumn//

    }
}
