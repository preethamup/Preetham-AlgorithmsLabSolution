	package com.greatlearning.main;

import java.util.Scanner;

public class Transaction {
	private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// Take in number of transactions (size)
		System.out.println("Enter the number of transations");
		int l_count = sc.nextInt();
		
		// Create an array of that size
		int[] l_transactions = new int[l_count];
		System.out.println("Enter the transations");
		
		// Use a loop to get each transaction value (populate the array)
		for(int i = 0 ; i<l_count ; i++)
		{
			l_transactions[i] = sc.nextInt();
		}
		
		// Take in the number of targets
		System.out.println("Enter the number of targets");
		int l_targetCount = sc.nextInt();
		int[] l_target = new int[l_targetCount];
		
		// Take in target one-by-one (loop) and immediately find if target is reached or not
		for(int i = 0; i < l_targetCount ; i++)
		{
			System.out.println("Enter the target");
			l_target[i] = sc.nextInt();
			int sum = 0;
			for(int j=0; j<l_count; j++)
			{
				sum = sum + l_transactions[j];
				if(l_target[i] <= sum)
				{
					System.out.println("Target reached after "+(j+1)+" transactions");
					break;
				}
				if(j == l_count-1)
				{
					System.out.println("Target not reached");
				}
			}
		}
	}
}
