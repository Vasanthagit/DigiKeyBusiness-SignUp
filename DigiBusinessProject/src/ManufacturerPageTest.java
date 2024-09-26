import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ManufacturerPageTest {  
	
	
	ManufacturerPage manufacturerpage = new ManufacturerPage();
	
	
	@Test      // positive testcase :verify navigating to the manufacturer section .
	public void testGoToManufacturerSection ()
	{
		 boolean isNavigated = manufacturerpage.goToManufacturerSection();  //navigate to the manufacturer section 
 
	assertTrue("Sucessfully navigated to the manufacturer section", isNavigated);     //check navigation sucess
	
	}
	
	
	@Test                          // positive test case 2: Verify clicking on Rohm Semiconductors 
	public void testClickOnRohmSemiconductors()        
	{ 
		 boolean isClicked =  manufacturerpage.clickOnManufacturer("Rohm Semiconductors");     //click on ROhm Semiconductors 
		 assertTrue("Sucessfully clicked on Rohm Semiconductors", isClicked);    //check navigation sucess
	 
	}
	
	@Test        //positive testcase: verify clicking on the resitor category 
	public void clickOnResistorCategory() 
	{
		 boolean isClicked = manufacturerpage.clickOnProductCategory("Resistors"); //click on Resistors 
		 assertTrue("Sucessfully clicked on Resistors ", isClicked);    //check navigation sucess
	}
	
	
	@Test        //positive testcase3: verify clicking on resistor kits 
	public void testClickOnResistorKits()
	{
		 boolean isClicked = manufacturerpage.clickOnKitType("ResistorKits");       //click on Resistor Kits 
assertTrue("Sucessfully clicked on Resistor Kits", isClicked);    //check navigation sucess
	}
	
	@Test     //positive testcase 4:  verify that the resitor kit page has the required tables 
	public void testVerifyResistorKitsPage()
	{
		 boolean isVerified = manufacturerpage.verifyResistorKitsPage();//verify resistor kits page 
		  
		 assertTrue("Sucessfully verified  the resistor kitspage " , isVerified);  //check verification sucess 
	}
	
	
	//negative testcase 1 : verify clicking on manufacturer that doesn't exist 
	
	@Test        //negative testcase 3: verify clicking on aproduct category that doesnot exist 
	public void testClickOnNonExistentManufacturer()    
	{
	 boolean isClicked = 	manufacturerpage.clickOnManufacturer("Insulators");    //click on non- existent manufacturer in my case i taken insulator 
	 assertFalse("Failed to clicking on a Insulataors", isClicked);   //check failure 
	}

	@Test
	public void testClickOnNonExsitenceCategory()
	{
		  boolean isClicked = manufacturerpage.clickOnProductCategory("Capacitors");   //click on a non-existent manufacturer product category in my case i taken capacitor 
	  
	assertFalse("Failed to click on Capacitor Category", isClicked); //check failure 
	}
	
	 @Test   //negative testcase 3: verify clicking on a kit type that doesn't exist 
	 public void testClickOnNonExistentKitType() {
		   
		 boolean isClicked =  manufacturerpage.clickOnKitType("Capacitor KitType");  //click on a non-existentmanufacturer kit type i have taken capacitor kit type which is not there 
		 assertFalse("Failed to click onCapacitor KitType", isClicked);
		 
		 
	 }
	
	

	
	
	
	
	
}
