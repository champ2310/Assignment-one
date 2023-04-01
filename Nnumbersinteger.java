package package1;
 import java.util.Scanner;

public class Nnumbersinteger
{  
public static void main(String[] args)   
{  
    Scanner sc=new Scanner (System.in);
int i, num = sc.nextInt(), sum = 0;  

//executes until the condition returns true  
for(i =1; i <= num; ++i)  
{  
//adding the value of i into sum variable  
sum = sum + i;  
}  
//prints the sum   
System.out.println("Sum of N is = " + sum);  
}  
}