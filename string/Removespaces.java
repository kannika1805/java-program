import java.util.Scanner;
public class Removespaces {
    public static void main(String[] ags){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();String word="";
        for(int i=0;i<s.length();i++){         
             char ch=s.charAt(i);
             if(s!=" "){
              word=word+ch;
             }

        }
        System.out.print(word);
        sc.close();
    }

    
}
