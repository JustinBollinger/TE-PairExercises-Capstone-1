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

    private PurchaseLogger errorLogger = new PurchaseLogger("errors");
    
	
    public void run()
    {
        while(true)
        {
            String choice = MainUserMenu.getHomeScreenOption();

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
    	
    	
    	
    }
    
    
    public void purchase()
    {
        // User the UserOutput to display the products in the ShoppingCart
        // then prompt the user for payment
        while(true)
        {

            String option = MainUserMenu.getPurchaseOptions();

            if(option.equals("feed"))
            {
                // prompt the user for money
                // add the money to the MoneyManager
                // MoneyManager.add(moneyProvided);
            }
            else if(option.equals("select"))
            {
                // display all products

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
                
                // there is no need for a cart in this application
                // add that product to the cart
//                vendingCart.add(product);
        

                // calculate if they have enough money
                BigDecimal paymentAmount = new BigDecimal("0"); // get the value from user input
                try
                {
                    MoneyManager.pay(paymentAmount);
                }
                catch(Exception ex)
                {
                    // Log the error message to file
                    // to implement this you need to open the Logger.java file
                    // and complete the logMessage function
                    errorLogger.logMessage(ex.getMessage());
                }
            }
            else if(option.equals("finish"))
            {
                break;
            }
        }
    }
    
    public void exit()
    {
    	// use the UserOutput to display the products in the ShoppingCart
    }
    
}
