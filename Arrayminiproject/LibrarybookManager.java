package Arrayminiproject;

import java.util.Scanner;

public class LibrarybookManager {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    String books[]=new String[r];
    for(int i=0;i<r;i++){
        //add books//
        books[i]=sc.nextLine();
    }
    for(int i=0;i<r;i++){
        //search books//
        if(books[i]=="ANACONDA"){
           System.out.print("THE BOOK AT PLACE NO.:"+(i+1));
        }
        //remove books//
        if(books[i]=="THE RACER"){
              books[i]=books[i+1];
              
        }

    }

}
}
