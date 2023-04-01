package package1;
import java.util.Scanner;

public class positivenegative
{  
public static void main(String[] args)   
{  
 int num;  
 
 Scanner sc = new Scanner(System.in);  
 System.out.print("Enter a number: ");  

 num = sc.nextInt();  
 
 if(num>10)  
 {  
 System.out.println("The number is positive.");  
 }  

 else if(num<10)  
 {  
 System.out.println("The number is negative.");  
 }  
 
}  
}  
