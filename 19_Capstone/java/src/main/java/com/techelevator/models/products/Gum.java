package com.techelevator.models.products;

import java.math.BigDecimal;

public class Gum extends Products
{
	public Gum(String slotLocation, String productName, BigDecimal price, String type)
	{
		super(slotLocation, productName, price, type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getSound()
	{
		return "Chew Chew, Yum!";
	}

}
