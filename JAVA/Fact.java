import java.util.Scanner;

class Fact{ 
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);         
     long i,fact=1;  
     System.out.println("Enter a number: ");

     long number= sc.nextLong();//It is the number to calculate factorial 

     for(i=1;i<=number;++i){    
         fact=fact*i;    
     }    
     System.out.print("Factorial of "+number+" is:"+fact);    
    }  
   }  