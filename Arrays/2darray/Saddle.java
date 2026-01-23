import java.util.Scanner;
public class Saddle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int a[][]=new int[r][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<r;j++){
                a[i][j]=sc.nextInt();
            }
        } boolean saddle=false;
        for(int i=0;i<r;i++){
            int min=a[i][0];
           
            for(int j=0;j<r;j++){
                if(min<a[i][j]){
                   min=a[i][j]; int max=a[0][j];
                   if(min>a[j][i]){
                       max=a[j][i];
                       System.out.print("sadddle point"+max);
                       break;
                   }
                }
            }
         }
        sc.close();        
                    
    }
 }
        
    
