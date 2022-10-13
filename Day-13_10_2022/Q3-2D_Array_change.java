/*
	" Q3) Write a Java program to print an array after changing the rows and columns of 
	a given two-dimensional array.
  example :-
	Original Array:
		10 20 30
		40 50 60
	After changing the rows and columns of the said array:
		10 40
		20 50
		30 60	" 
*/

import java.util.*;
public class change_array 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows and columns : ");  // size of 2D array
	    int rows = sc.nextInt();
	    int cols = sc.nextInt();

	    int[][] arr = new int[rows][cols];
	    System.out.println("Enter elements in the 2-D array");  // accept array elements
	    for (int i = 0; i < rows; i++)	//row
	    {
	        for (int j = 0; j < cols; j++) //column
	        {
	            arr[i][j] = sc.nextInt();
	        }
	    }
		
		System.out.print("Array before changing row and columns :\n");
		disp(arr);	
		System.out.print("Array after changing rows and columns : \n");
		change(arr);	
		}	
	
	public static void change(int[][] arr)  //method to interchange column to row
	{
		int[][] ch = new int[arr[0].length][arr.length];	// take new array of same length as arr
		for (int i = 0; i < arr.length; i++)	// loop for row
		{
			for (int j = 0; j < arr[0].length; j++)	// loop for column
			{
				ch[j][i] = arr[i][j];	// interchange row to column
			}
		}
		disp(ch);	// print interchanged array
	}
  
	public static void disp(int[][] arr) //printing array
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[0].length; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
