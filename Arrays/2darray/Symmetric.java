import java.util.Scanner;
public class Symmetric {
    public static void main(String[] agrs){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        }boolean symmetric=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                if(a[i][j]!=a[j][i]){
                    symmetric=false;
                    break;
                }
            }
        }
        if(symmetric){
            System.out.print("symmetric matrix");
        }
        else{
            System.out.print("not symmetric matrix");
        }
        sc.close();
    }
}
