import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;



public class CartWidgetTest { 
	
	@Test
	public void testPageInvalidWithoutProductDetails()
	{
		CartWidget cart = new CartWidget();

		 assertFalse(cart.isPageValid());		//The page should be invalid without addinng product details and initially page should be empty beacuse nothing is set .
	 
	// set the productPartNumber only 
	
	cart.setProductPartNumber("123456");
	assertFalse(cart.isPageValid());   		//The page is still it should be invalid beacuse product quantity doesnot added .
	
	
	//set product quantity 
	
	cart.setProductQuantity(1);
	assertTrue(cart.isPageValid());  //The page should be valid with product number and quantity .
	 
	}

	
	
	@Test 
	public void testCustomerRefernceIsOptional()
	{
		CartWidget cart = new CartWidget(); 
		cart.setProductPartNumber("A1234");
		cart.setProductQuantity(1);
		cart.setCustomerReference("Customer Refernce e001");  // set the customer refernce (optional)
	 assertTrue(cart.isPageValid());  // The page should be valid even if customer refernce is set or not .
	
	
	
	}
	
	
	
	
	
	



	@Test 
	public void testFileUploadIsOptional()
	{
		CartWidget cart = new CartWidget(); 
		cart.setProductPartNumber("B1234");
		cart.setProductQuantity(1);
		cart.setUploadFile(false);       // do not upload a file ,page should be still be valid 
		assertTrue(cart.isPageValid());      //the page should be still valid without file upload.
		 
		cart.setUploadFile(true);        //The Page should be valid even if a file is uplaoded 
		assertTrue(cart.isPageValid());
		
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
