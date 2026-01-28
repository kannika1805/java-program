package Arrays.Arrayminiproject;
import java.util.Scanner;
public class EmailValidator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String email=sc.nextLine();
        boolean special=false;
        boolean isletter=false;
        boolean digit=false;
        int count=0;
        for(int i=0;i<email.length()-1;i++){
            char ch=email.charAt(i);
            if(i==0){
            if(ch>=97 && ch<=122){
                isletter=true;
            }
            else{
                System.out.print("FIRST CHARACTER MUST BE LETTER");
                break;
            }
        }
        if(ch>=97 && ch<=122){
            isletter=true;
        }
        if(ch>=0 && ch<=9){
           digit=true;
        }else{
            digit=false;
        }
        if(count==0){
        if(ch=='@'){
            special=true;
            count++;
        } }
        }
        if(isletter && special && digit){
            System.out.print("VALID EMAIL ID");
        }else{
            System.out.print("INVALID EMAIL ID");
        }
        sc.close();

    }
}
