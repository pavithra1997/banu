package numbers;

import java.util.Scanner;
public class sumofdigits {
  public static void main(String[] args){
 System.out.println("enter the input");
  Scanner in=new Scanner(System.in);
    int inp=in.nextInt();
   int c, b=0,d=0,sum=0;
   if(inp>9){
   while(inp>0){
      int a=inp%10;
       b=b*10+a;
       inp=inp/10;
       }System.out.println("reverse is "+b);
   while(b>0){
       c=b%10;
       sum=sum+c;
       d=d+sum;
       b=b/10;
   }
       System.out.println("sum of digits is"+d);
   }
   else{
       System.out.println("input is less than 9");
   }
  }}