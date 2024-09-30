import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ProductDetailsPageTest {  
	
	// Test case 1: Verify product name
    @Test
    public void testProductName() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("Monitor", product.getProductName());
    }

    // Test case 2: Verify manufacturer name
    @Test
    public void testManufacturer() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("Manufacturer1", product.getManufacturer());
    }

    // Test case 3: Verify Digi-Key part number
    @Test
    public void testDigiKeyPartNumber() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("DK12345", product.getDigiKeyPartNumber());
    }

    // Test case 4: Verify manufacturer part number
    @Test
    public void testManufacturerPartNumber() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("MPN12345", product.getManufacturerPartNumber());
    }

    // Test case 5: Verify product description
    @Test
    public void testDescription() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("LCD Monitor", product.getDescription());
    }

    // Test case 6: Verify stock quantity
    @Test
    public void testStockQuantity() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals(100, product.getStockQuantity());
    }

    // Test case 7: Verify unit price
    @Test
    public void testUnitPrice() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals(150.00, product.getUnitPrice(), 0.01);
    }

    // Test case 8: Verify customer reference
    @Test
    public void testCustomerReference() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("Ref123", product.getCustomerReference());
    }

    // Test case 9: Verify RoHS status
    @Test
    public void testRohsStatus() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("RoHS Compliant", product.getRohsStatus());
    }

    // Test case 10: Verify ECCN code
    @Test
    public void testEccn() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("5A992", product.getEccn());
    }

    // Test case 11: Verify HTSUS code
    @Test
    public void testHtsus() {
        ProductDetailsPage product = new ProductDetailsPage("Monitor", "Manufacturer1", "DK12345", "MPN12345", 
                        "LCD Monitor", 100, 150.00, "Ref123", "RoHS Compliant", "5A992", "8471.60.0000");
        assertEquals("8471.60.0000", product.getHtsus());
    }


}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


