import java.util.Scanner;
public class Firstrepeat{
public static void main(String[] args)
{
      Scanner sc=new Scanner(System.in);
      int r=sc.nextInt();
      int a[]=new int[r];
      for(int i=0;i<r;i++){// h[2] element2 oda frequency//h[a[2]] frequency at that index2//
        a[i]=sc.nextInt();
      }
      int h[]=new int[256];
      for(int i=0;i<r;i++){
        h[a[i]]++;
      }
      for(int i=0;i<r;i++){
        if(h[a[i]]>1){
            System.out.print(a[i]+"first repeating elemnent");
            break;
        }
      }
      sc.close();
    }
}
