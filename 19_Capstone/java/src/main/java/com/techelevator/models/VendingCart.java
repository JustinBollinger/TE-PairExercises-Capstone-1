package com.techelevator.models;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.techelevator.models.products.Products;

public class VendingCart
{
	
		Map<Products, Integer> cart = new HashMap<Products, Integer>();
		
		public void add(Products product)
		{
			// add product or update quantity
			cart.put(product, 1);
		}
		
		public BigDecimal getCartTotal()
		{
			return BigDecimal.ONE;
		}
		
	
}
