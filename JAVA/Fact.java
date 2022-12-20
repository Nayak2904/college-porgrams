import java.util.Scanner;

class Fact{ 
    public static void main(String args[]){ 
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a number to find its factorial:");
     int i, fact=1;  
     int number=sc.nextInt();//It is the number to calculate factorial    
     for(i=1;i<=number;i++){    
         fact=fact*i;    
     }    
     System.out.print("Factorial of "+number+" is:"+fact);    
    }  
   }  