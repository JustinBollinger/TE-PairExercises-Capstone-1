package com.techelevator.models;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.models.exeptions.InsufficientFundsException;
import com.techelevator.models.products.Products;

public class MoneyManager
{
	private static BigDecimal credit = BigDecimal.ZERO;
	private static BigDecimal change = BigDecimal.ZERO;
	// update to just take the productAmount
	public static BigDecimal pay( int productAmount) 
	{
		// get the amount owed
		BigDecimal amountOwed = Products.getPrice();
		//calculate change from payment
		BigDecimal change = productAmount.subtract(amountOwed);

		// throw an exception if the payment is not enough
		if(change.compareTo(BigDecimal.ZERO) < 0 )
		{
			new InsufficientFundsException("The provided payment is not sufficient, please add more money.", amountOwed, productAmount);
		}

		return change;
	}

	public static BigDecimal credit(BigDecimal creditAmount)
	{ 
		BigDecimal creditAmount = amount;
		
		if(change.compareTo(BigDecimal.ZERO > 0)
				{
			
				}
	}
	
	public static BigDecimal feedMoney(BigDecimal Price)
	{
	    Scanner keyboard = new Scanner(System.in);
	    BigDecimal money = 0.00;
	    System.out.println("Your item costs: " + Price + " Please enter the amount of money:");
	    money = keyboard.nextBigDecimal();
	    while (money < Price){
	        System.out.println("Please insert sufficient funds");
	        money = money + keyboard.nextBigDecimal();
	    }
	    return money - Price ;
	}
	// method to add money to the credit

	public static BigDecimal change (BigDecimal changeAmount)
	{
		calculate(amount.multiply(new BigDecimal(10.00)))
	}
	// method to calculate the change
	
}
