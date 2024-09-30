
public class ProductDetailsPage { 
	private String productName;
	private String digiKeypartNumber;        //field to store product information 
	private String manufacturer;
	private String manufacturerPartNumber;
	private String description;
	private String customerReference;
	private int stockQuantity;
	private String rohsStatus;
	private String eccn;
	private String htsus;
	
	  //fields for the retail package details 
	private double unitPrice;
	
	//constructor to initaialize all the fields 
	public  ProductDetailsPage( String productName,String manufacturer, String digiKeyPartNumber,String manufacturerPartNumber ,String description,int stockQuantity,double unitPrice,String customerReference,String rohsStatus,String eccn,String htsus)
	{
		this.productName = productName;
        this.manufacturer = manufacturer;
        this.digiKeypartNumber = digiKeyPartNumber;
        this.manufacturerPartNumber = manufacturerPartNumber;
        this.description = description;
        this.stockQuantity = stockQuantity;
        this.unitPrice = unitPrice;
        this.customerReference = customerReference;
        this.rohsStatus = rohsStatus;
        this.eccn = eccn;
        this.htsus = htsus;
    }

    // Getter methods to access the fields
    public String getProductName() {
        return productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDigiKeyPartNumber() {
        return digiKeypartNumber;
    }

    public String getManufacturerPartNumber() {
        return manufacturerPartNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getCustomerReference() {
        return customerReference;
    }

    public String getRohsStatus() {
        return rohsStatus;
    }

    public String getEccn() {
        return eccn;
    }

   public String getHtsus()
   {
	   return htsus;
   }


}
	
	
	
	
	
	
	


