package com.techelevator.models.file_io;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.techelevator.models.products.Products;

// Dependencies:
// 			Inventory

public class FileProductLoader
{
   private Map<Products, Integer> products = new HashMap<Products, Integer>();
	
   public Map<Products, Integer> getProducts()
	{
		File productsPath = new File("vendingmachine.csv");		
		try(Scanner fileScanner = new Scanner(productsPath))
		{
			// read one line to skip the header
			fileScanner.nextLine();
			
			//loop and add each product to the list
			while(fileScanner.hasNextLine())
			{
				String line = fileScanner.nextLine();
				// create the product
				String[] parts = line.split("\\|");
				
				String slotLocation = parts[0];
				String productName = parts[1];
				BigDecimal price = new BigDecimal(parts[2]);
				String type = parts[3];
				
				Products product = new Products(slotLocation, productName, price, type);
								
				// add it to the list
				products.add(product);
			}
		}
		catch(Exception ex)
		{
			
		}
		
		return products;
	}
	
}
