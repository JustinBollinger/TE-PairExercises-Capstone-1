package com.techelevator.models.products;

import java.math.BigDecimal;

public class Products
{

	    String slotLocation;
	    String productName;
	    BigDecimal price;
		String type;
	    
		public Products(String slotLocation, String productName, BigDecimal price, String type)
		{
			this.slotLocation = slotLocation;
			this.productName = productName;
			this.price = price;
			this.type = type;
		}


		public String getSlotLocation()
		{
			return slotLocation;
		}

		public String getProductName()
		{
			return productName;
		}

		public BigDecimal getPrice()
		{
			return price;
		}
		
		public String getType()
		{
			return type;
		}
		   
		
		@Override
		public String toString()
		{
			return slotLocation + ") " + productName + " - $" + price + type;
		}
}
