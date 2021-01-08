package com.techelevator.application;
import java.math.BigDecimal;
import com.techelevator.models.Inventory;
import com.techelevator.models.MoneyManager;
import com.techelevator.models.VendingCart;
import com.techelevator.models.file_io.PurchaseLogger;
import com.techelevator.models.products.Products;
import com.techelevator.ui.MainUserMenu;
import com.techelevator.ui.UserOutput;


public class VendingMachine 
{
	private Inventory inventory = new Inventory();
    private VendingCart vendingCart = new VendingCart();

    private PurchaseLogger errorLogger = new PurchaseLogger("errors");
    
	
    public void run()
    {
        while(true)
        {
            String choice = "display";

            if(choice.equals("display"))
            {
            	displayVendingOptions();// display the vending machine slots
            }
            else if(choice.equals("purchase"))
            {
                purchase();// make a purchase
            }
            else if(choice.equals("exit"))
            {
               exit(); // good bye
                break;
            }
        }
    }
    
    public void displayVendingOptions()
    {
    	// show the products
    	UserOutput.displayInventory(inventory);
    	
    	// prompt for input
    	String slotLocation = MainUserMenu.getSelectedProduct();
    	
    	// find the product based on the id
    	Products product = null;
    	for (Products vending : inventory.getProducts())
		{
			if(vending.getSlotLocation().equals(slotLocation))
			{
				product = vending;
				break;
			}
		}
    	
    	// add that product to the cart
        vendingCart.add(product);
        
    }
    
    
    public void purchase()
    {
        // User the UserOutput to display the products in the ShoppingCart
        // then prompt the user for payment


        BigDecimal paymentAmount = new BigDecimal("0"); // get the value from user input
        try
        {
            MoneyManager.pay(vendingCart, paymentAmount);
        }
        catch(Exception ex)
        {
            // Log the error message to file
            // to implement this you need to open the Logger.java file
            // and complete the logMessage function
            errorLogger.logMessage(ex.getMessage());
        }
    }
    
    public void exit()
    {
    	// use the UserOutput to display the products in the ShoppingCart
    }
    
}
