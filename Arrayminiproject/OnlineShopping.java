package Arrayminiproject;

import java.util.Scanner;
public class OnlineShopping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF PRODUCTS");
        int r=sc.nextInt();
        System.out.print("ENTER THE QUANTITY OF PRODUCTS AND PRICE:");
        int price[]=new int[r];
        int quantity[]=new int[r];
        int total=0;
        for(int i=0;i<r;i++){
            price[i]=sc.nextInt();
            quantity[i]=sc.nextInt();
            total+=(price[i]*quantity[i]);
        }
        double maxprice=price[0];
        for(int i=0;i<r;i++){
            if(maxprice<price[i]){
                maxprice=price[i];
            }
        }
        int discount=0;
        if(total>1000){
         discount=(total/10);
        }
        int totalamount=total-discount;
        System.out.println("TOTAL AMOUNT OF ALL YOUR PRODUCTS:"+total);
        System.out.println("HIGH COST PRODUCT:"+maxprice);
        System.out.println("DISCOUNT AMOUNT:"+discount);
        System.out.println("AMOUNT TO PAY:"+totalamount);
        sc.close();
    }
}
