package com.techelevator.models;

import java.util.ArrayList;
import java.util.List;

import com.techelevator.models.file_io.FileProductLoader;

import com.techelevator.models.products.Products;

public class Inventory
{

private List<Products> products = new ArrayList<Products>();
	
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
    
    public List<Products> getProducts()
    {
    	return products;
    }
	
}
