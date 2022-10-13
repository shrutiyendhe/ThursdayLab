/*
	" Q2) Multilevel Inheritance :
			WAP to create a class Reverse No, second class Sum of Digits , 
			Third class use both the class property and display the output "
*/

package multi_level_inheri;
import java.util.*;
public class Rev  //main parent class 
{
	public static void reverse()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter a number to Reverse it : ");
		int n1 = s.nextInt();
		int rev=0, temp=n1, rem;
    // reverse number logic
		while(temp>0)
		{
			rem = temp % 10;
			rev = rev *10 + rem;
			temp = temp / 10;
		}
		System.out.println("reverse number:"+rev);  //print reverse fo entered number
	}
}
-------------------------------------------------------------------------------------

package multi_level_inheri;
import java.util.*;
public class SOD extends Rev  //child class 
{
	public static void sum_of_digit()
	{
		Scanner s = new Scanner(System.in);
		int num, digit, sum=0;
		System.out.println(" Enter number for SOD : "); 
		num = s.nextInt();
		
		// logic for sum of digits
		while(num>0)
		{
			digit = num % 10;
			sum = sum + digit;
			num = num/ 10;
		}
		System.out.println("Sum of Digits of number is :" +sum);  // print sum
	}
}
-----------------------------------------------------------------------------------------

package multi_level_inheri;
import java.util.*;
public class Output extends SOD   // final  child class
{
	public static void main(String[] args) 
	{
		System.out.println("\n\t.. Reverse a number ..");
		reverse();  // calls Rev class method reverse() 
		
		System.out.println("\n\t .. Sum of Digits ..");
		sum_of_digit();   // calls SOD class method sum_of_digit()
	}
}
