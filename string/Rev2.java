import java.util.Scanner;
public class Rev2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String word="";String result="";
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch!=' '){
                word=ch+word;
            }else{
                result =result+word;
                word="";
            }
        }
        result=result+word;
        System.out.print(result);
        sc.close();
    }
}