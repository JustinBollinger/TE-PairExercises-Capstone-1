package com.techelevator.ui;

import java.util.Map;

import com.techelevator.models.Inventory;
import com.techelevator.models.products.Products;

public class UserOutput 
{
	public static void displayInventory(Inventory inventory)
		{
			System.out.println();
			System.out.println("*******************");
			System.out.println("   ZOMBIE SNACKS");
			System.out.println("*******************");
			System.out.println();
			
			
			
		for(Map.Entry<String, Products> product: inventory.getProducts().entrySet())
			{
				System.out.println(product.toString());
			}
			System.out.println();
		
		}
	
	
    
}
