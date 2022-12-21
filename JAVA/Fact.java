import java.util.Scanner;

class Fact{ 
    public static void main(String args[]){ 
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);         
     long i,fact=1;  
     System.out.println("Enter a number: ");

     long number= sc.nextLong();//It is the number to calculate factorial 

     for(i=1;i<=number;++i){    
=======
        Scanner sc=new Scanner(System.in); 
        System.out.print("Enter a number to find its factorial:");
     int i, fact=1;  
     int number=sc.nextInt();//It is the number to calculate factorial    
     for(i=1;i<=number;i++){    
>>>>>>> 12516335a3677d226c89d76d487f412a04cb1996
         fact=fact*i;    
     }    
     System.out.print("Factorial of "+number+" is:"+fact);    
    }  
   }  