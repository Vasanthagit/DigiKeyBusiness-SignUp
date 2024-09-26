
public class ManufacturerPage { 
	
	public boolean goToManufacturerSection() //method to navigate to the manufacturer section from homepage 
	{
		return true; 						//Assume navigation is sucessfull.
	}
	
	public boolean clickOnManufacturer(String manufacturerName) 	//method to click on a specific manufacturer like (Rohm Semiconductors )
	{
		return manufacturerName.equals("Rohm Semiconductors");   //return true if the correct manufacturer is clicked 
	}
	
	public boolean clickOnProductCategory(String categoryName)   //method to click on a specific product category like resistors 
	{
		return  categoryName.equals("Resistors");       //return true if the correct category is clicked 
	}
	
	public boolean clickOnKitType(String kitTypeName)   //method to click on a specific kit type (like resistor kits)
	{
		return kitTypeName.equals("ResistorKits");     //return true if the correct kittype is clicked 
	}
	
	public boolean verifyResistorKitsPage()   //method to verify the presence of tables on the resistorkits page 
	{
		return true;                          //assume verification of tables is sucessfull.
	}
		
	
	
	
	

}
