package com.greatlearning.main;
import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// accept number of denominations (eg. 3) - size
		System.out.println("Enter the size of currency denominations :");
		int l_count = sc.nextInt();
		
		// allocate a notes array of that size
		int[] l_denominations = new int[l_count];
		
		// accept the denominations (loop)
		System.out.println("Enter the currency denominations value :");
		for(int i=0; i<l_count; i++)
		{
			l_denominations[i] = sc.nextInt();
		}
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort( l_denominations, 0, l_denominations.length - 1 );
		
		System.out.println("Denominations entered are :");
		for(int i=0; i<l_count; i++)
		{
			System.out.println(l_denominations[i]);
		}
		
		// accept the amount
		System.out.println("Enter the amount you want to pay :");
		int l_amount = sc.nextInt();
		int l_temp = l_amount;
		int l_reminder = 0;
		int l_noteCount = 0;
		int[] l_allCounts = new int[l_count];
		
		// Your logic to print the number of notes of each variety
		for(int i=0; i<l_count; i++)
		{
			l_reminder = l_temp/l_denominations[i];
			if(l_reminder > 0)
			{
				l_allCounts[i] = l_reminder;
			}
			else
			{
				l_allCounts[i] = 0;
			}
			l_temp = l_temp%l_denominations[i];
		}
		
		if(l_temp != 0)
		{
			System.out.println("Amount cannot be dispensed using the given denominations");
		}
		else
		{
			System.out.println("Your payment approach in order to give min no of notes will be :");
			for(int i=0;i<l_count;i++)
			{
				if(l_allCounts[i] > 0)
				{
					System.out.println(l_denominations[i]+":"+l_allCounts[i]);
				}
			}
		}
	}
}
