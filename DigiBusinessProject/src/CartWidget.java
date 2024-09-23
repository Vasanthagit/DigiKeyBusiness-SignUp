

public class CartWidget {  
	
String productPartNumber;
int productQuantity;
String customerReference;
boolean fileUploaded;



public CartWidget ()//creating a constructor to store the default values initially 
{
	 productPartNumber = "";        //initially empty
	 productQuantity = 0;          //initially 0 
	 customerReference = "";     //initially empty
	 fileUploaded = false;        //initially file is not uploaded 
	
	
	
}
	
	
	public void setProductPartNumber(String partNumber) 					//set the product number(required)
	{
		
		productPartNumber = partNumber;
	}
	 public void  setProductQuantity(int quantity) 								//set the product quantity(required)
		{
	 
		 productQuantity = quantity;
	 }
	
	 public void  setCustomerReference(String refernce)            					//set the product Customer refernce(optional)
		
	 {
		 customerReference = refernce;
		 
	 }
	
	 public void  setUploadFile(boolean isUploaded) 						//uploading a file (optional)
	 {
		 fileUploaded = isUploaded;
	 }
	
	public boolean isPageValid()       					//check if the page is valid (both product part number and quantity must be set )
	{
		return !productPartNumber.isEmpty()&&productQuantity>0;   	//only partnumber and quantity is mandatory and customer refernce file uplaoding is optional 
	}
	
	


}
