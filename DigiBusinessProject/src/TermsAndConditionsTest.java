import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;





public class TermsAndConditionsTest {
    private TermsAndConditions terms; 
    
@Before 
public void setUp() {
    terms = new TermsAndConditions();
}

   @Test
   public void testDisplayTerms() {
       String expectedTerms = "Terms and Conditions: [Your terms here]";
       assertEquals(expectedTerms, terms.display());
   }
       
   @Test
   public void testAcceptTerms() {
       assertFalse("Terms should not be accepted initially.", terms.isAccepted());
       terms.accept();
       
       assertTrue("Terms should be accepted after calling accept().", terms.isAccepted());
   }

   

   @Test
   public void testInitialAcceptanceState() { 
         // Check that the initial state is false
       assertFalse(  "Initial state should be not accepted.", terms.isAccepted());
   }

   
   @Test
   public void testAfterRejectingTerms() {
       terms.accept(); // Accept first
       assertTrue(  "Terms should be accepted after calling accept().", terms.isAccepted());
       
       // Reject the terms
       terms.reject();
       assertFalse( "Terms should not be accepted after rejecting.",terms.isAccepted());
   }

  
   @Test
   public void testDisplayCorrectMessage() {
       String message = terms.display();
       assertNotNull(message, "Display message should not be null.");
       assertTrue( "Display message should contain 'Terms and Conditions.",message.contains("Terms and Conditions"));
   }

   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
