package com.techelevator.models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.techelevator.models.file_io.FileProductLoader;

import com.techelevator.models.products.Products;

public class Inventory
{

private Map<Products, Integer> products = new HashMap<Products, Integer>();
	
	public Map<Products, Integer> getProdcuts()
	{
		return products;
	}

	public Inventory()
	{
		loadInventory();
	}
	

    private void loadInventory()
    {
        // Inventory should NOT know how to read from a file
        // we will use the FileProductLoader to get the products
    	FileProductLoader loader = new FileProductLoader();
    	products = loader.getProducts();
    }
    
    
	
}
