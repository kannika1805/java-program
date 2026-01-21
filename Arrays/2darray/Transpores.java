import java.util.Scanner;
public class Transpores {
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
            for(int j=i+1;j<r;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
            
        }
        for(int i=0;i<r;i++){
           for(int j=0;j<r;j++){
            System.out.print(a[i][j]);
           }
        }
        sc.close();
    }}
