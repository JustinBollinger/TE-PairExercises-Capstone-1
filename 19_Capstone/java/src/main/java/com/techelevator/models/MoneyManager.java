package com.techelevator.models;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.techelevator.models.exeptions.InsufficientFundsException;
import com.techelevator.models.products.Products;

public class MoneyManager
{
	private static BigDecimal credit = BigDecimal.ZERO;

	// update to just take the productAmount
	public static BigDecimal pay(VendingCart cart, BigDecimal paymentAmount) 
	{
		// get the amount owed
		BigDecimal cartTotal = cart.getCartTotal();
		//calculate change from payment
		BigDecimal change = paymentAmount.subtract(cartTotal);

		// throw an exception if the payment is not enough
		if(change.compareTo(BigDecimal.ZERO) < 0 )
		{
			new InsufficientFundsException("The provided payment is not sufficient, please add more money.", cartTotal, paymentAmount);
		}

		return change;
	}

	// method to add money to the credit

	// method to calculate the change
	
}
