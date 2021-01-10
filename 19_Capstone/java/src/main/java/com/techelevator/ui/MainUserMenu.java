package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainUserMenu
{
	private static Scanner uInput= new Scanner(System.in);
	
	public static String getHomeScreenOption()
	{
		System.out.println("************************************************************");
		System.out.println("Welcome to the Vendomatic 800 by the Umbrella Corporation!");
		System.out.println("   ----   Please select from the options below.   ----   ");
		System.out.println("************************************************************");
		System.out.println();
		
		System.out.println("1) Display Vending Machine Items");
		System.out.println("2) Purchase Item");
		System.out.println("3) Exit");
		
		System.out.println();
		System.out.print("Please select an option: ");
		
		
		String selectedOption = uInput.nextLine();
		String option = selectedOption.trim();
		
		if(option.equals("1"))
		{
			 return "display";
		}
		else if(option.equals("2"))
		{
			return "purchase";
		}
		else if(option.equals("3"))
		{
			return "exit";
		}
		else
		{
			return "";
		}
		
	}
  
	public static String getPurchaseOptions()
	{
		System.out.println();
		System.out.println("What would you like?");
		System.out.println();

		System.out.println("1) Feed Money");
		System.out.println("2) Select Product");
		System.out.println("3) Finish Transaction");
		
		
		System.out.println();
		System.out.print("Please select an option: ");
		
		String selectedOption = uInput.nextLine();
		String option = selectedOption.trim();
		
		if(option.equals("1"))
		{
			 return "feed";
		}
		else if(option.equals("2"))
		{
			return "select";
		}
		else if(option.equals("3"))
		{
			return "finish";
		}
		
		else
		{
			return "";
		}
	}

	public static String getSelectedProduct()
	{
		System.out.print("What are you hungry for? ");
		String slotLocation = uInput.nextLine();
		
		return slotLocation.toLowerCase().trim();
	}
	
	public static BigDecimal getMoney()
	{
		// TODO: prompt the user for money
		System.out.println("Please enter a $1, $2, $5, or $10 bill");
		// place logic in for denominations
		
		// dummy placeholder until we prompt the user
		return BigDecimal.TEN;
	}
	
}
