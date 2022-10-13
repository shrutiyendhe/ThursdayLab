/*
	" Q1)	Single Inheritance:
			WAP to create a class which contain the method Palindrome .
			the second class will use the property of first class and display the output."
*/

package single_inheri;
import java.util.*;
public class palin_main   //parent class
{
	public static void palin()
	{
		Scanner s = new Scanner(System.in);
		int num;
		System.out.println("Enter Number:");	// take number from user
		num = s.nextInt();
		int rev=0, temp=num, rem;
		 
		while(temp>0)	// actual palindrome logic
		{
			rem = temp % 10;
			rev = rev *10 + rem;
			temp = temp / 10;
		}
		// now check reverse num and the entered num are same or not then it is said to be palindrome 
		if(rev == num)
		{
			System.out.println("\t entered number IS PALINDROME");
		}
		else
		{
			System.out.println("\t entered number IS NOT PALINDROME");
		}
	}
}
-----------------------------------------------------------------------------------------------------
package single_inheri;
import java.util.*;
public class palin_output extends palin_main    //child class 
{
	public static void main(String[] args) 
	{
		System.out.println("... check if number is palindrome or not ...");
		palin();
	}
}
