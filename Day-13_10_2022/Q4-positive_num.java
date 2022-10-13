/*
  	" Question 4)
		Write a program to accept the positive numbers
		from user and display the sum of that numbers using loop. " 
*/

import java.util.*;
public class positive 
{
	public static void main(String[] args) // main method
	{
		Scanner sc = new Scanner(System.in);
		
		int n,ps = 0,num,i;
		System.out.println("total numbers : ");	
		n = sc.nextInt();
		System.out.println("enter " +n+ " numbers : ");
		for(i=0;i<n;i++)
		{
			num = sc.nextInt();
			if( num > 0)	//if number is positive then sum all positive numbers
			{
				ps = ps + num;
			}
		}
		
		System.out.println(" Sum of Positive Numbers is "+ps);	//print sum
	}
}
