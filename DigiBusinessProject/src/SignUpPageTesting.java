import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SignUpPageTesting { 
	
	
	private SignUpPage signup ;
	@Before 
	public void setUp( )
	{
		signup = new SignUpPage();
	}
	
	//TestCase1: valid signup across all pages 
	@Test
	public void testValidSignUp()
	{
		signup.setFirstName("Vasantha");
		signup.setLastName("Bhukya");
		signup.setCompanyName("bbca");

		signup.setCompanyType("Consulting");
		signup.setJobTitle("Engineer");
		signup.setPhoneNumber("1234567890");
		signup.setemail("vasanthabhukya101@gmail.com");
		signup.setPassword("Vasa1234");
		signup.setConfirmPassword("Vasa1234");
			signup.setCountry("India");	
			signup.setcurrency("INR");
			signup.setMailStop("vasanthabhukya101@gmail.com");
			signup.setAddressLine1("Warangal");
			signup.setAddressLine2("Warangal");
			
			signup.setCity("Warangal");
			signup.setState("Telangana");
			signup.setPostalCode("506009");
			signup.setVerificationCode("123456");
			 boolean result = signup.submit();
			 assertTrue(result);
		
	}
	
	//missing first name on page 1
	public void testMissingFirstNam() 
	{
		
		signup.setFirstName("");
		signup.setLastName("Bhukya");
		signup.setCompanyName("bbca");

		signup.setCompanyType("Consulting");
		signup.setJobTitle("Engineer");
		signup.setPhoneNumber("1234567890");
		signup.setemail("vasanthabhukya101@gmail.com");
		signup.setPassword("Vasa1234");
		signup.setConfirmPassword("Vasa1234");
			signup.setCountry("India");	
			signup.setcurrency("INR");
			signup.setMailStop("vasanthabhukya101@gmail.com");
			signup.setAddressLine1("Warangal");
			signup.setAddressLine2("Warangal");
			
			signup.setCity("Warangal");
			signup.setState("Telangana");
			signup.setPostalCode("506009");
			signup.setVerificationCode("123456");
			 boolean result = signup.submit();
			 assertTrue(result);
		
		
		
	}
	
	//testcase 3: Invalid phone number 
	
	public void testInvalidPhoneNumber()
	{
		signup.setFirstName("Vasantha");
		signup.setLastName("Bhukya");
		signup.setCompanyName("bbca");

		signup.setCompanyType("Consulting");
		signup.setJobTitle("Engineer");
		signup.setPhoneNumber("123");
		signup.setemail("vasanthabhukya101@gmail.com");
		signup.setPassword("Vasa1234");
		signup.setConfirmPassword("Vasa1234");
			signup.setCountry("India");	
			signup.setcurrency("INR");
			signup.setMailStop("vasanthabhukya101@gmail.com");
			signup.setAddressLine1("Warangal");
			signup.setAddressLine2("Warangal");
			
			signup.setCity("Warangal");
			signup.setState("Telangana");
			signup.setPostalCode("506009");
			signup.setVerificationCode("123456");
			 boolean result = signup.submit();
			 assertTrue(result);
	}
	
	//testcase4: Invalid email 
	
	
	public void testInvalidEmail()
	{
		signup.setFirstName("Vasantha");
		signup.setLastName("Bhukya");
		signup.setCompanyName("bbca");

		signup.setCompanyType("Consulting");
		signup.setJobTitle("Engineer");
		signup.setPhoneNumber("1234567890");
		signup.setemail("vasanthabhukyacom");
		signup.setPassword("Vasa1234");
		signup.setConfirmPassword("Vasa1234");
			signup.setCountry("India");	
			signup.setcurrency("INR");
			signup.setMailStop("vasanthabhukya101@gmail.com");
			signup.setAddressLine1("Warangal");
			signup.setAddressLine2("Warangal");
			
			signup.setCity("Warangal");
			signup.setState("Telangana");
			signup.setPostalCode("506009");
			signup.setVerificationCode("123456");
			 boolean result = signup.submit();
			 assertTrue(result);
	}
	
//testcase 5: address missing on page 2 
	
	
	public void testMissAddress()
	{
		
		signup.setFirstName("Vasantha");
		signup.setLastName("Bhukya");
		signup.setCompanyName("bbca");

		signup.setCompanyType("Consulting");
		signup.setJobTitle("Engineer");
		signup.setPhoneNumber("1234567890");
		signup.setemail("vasanthabhukya101@gmail.com");
		signup.setPassword("Vasa1234");
		signup.setConfirmPassword("Vasa1234");
			signup.setCountry("India");	
			signup.setcurrency("INR");
			signup.setMailStop("vasanthabhukya101@gmail.com");
			signup.setAddressLine1("");
			signup.setAddressLine2("");
			
			signup.setCity("Warangal");
			signup.setState("Telangana");
			signup.setPostalCode("506009");
			signup.setVerificationCode("123456");
			 boolean result = signup.submit();
			 assertTrue(result);
		
		
		
		
	}   
	
	
	//testcase 6: Invalid verification code
	
	
	public void testInvalidCode( )
	{
		
		signup.setFirstName("Vasantha");
		signup.setLastName("Bhukya");
		signup.setCompanyName("bbca");

		signup.setCompanyType("Consulting");
		signup.setJobTitle("Engineer");
		signup.setPhoneNumber("1234567890");
		signup.setemail("vasanthabhukya101@gmail.com");
		signup.setPassword("Vasa1234");
		signup.setConfirmPassword("Vasa1234");
			signup.setCountry("India");	
			signup.setcurrency("INR");
			signup.setMailStop("vasanthabhukya101@gmail.com");
			signup.setAddressLine1("Warangal");
			signup.setAddressLine2("Warangal");
			
			signup.setCity("Warangal");
			signup.setState("Telangana");
			signup.setPostalCode("506009");
			signup.setVerificationCode("12");
			 boolean result = signup.submit();
			 assertTrue(result);
		
	}
	
	
	//testcase 7:missing all details 
	
	public void testMissAllDetails()
	{
		
		
		signup.setFirstName("");
		signup.setLastName("");
		signup.setCompanyName("");

		signup.setCompanyType("");
		signup.setJobTitle("");
		signup.setPhoneNumber("1");
		signup.setemail("");
		signup.setPassword("");
		signup.setConfirmPassword("");
			signup.setCountry("");	
			signup.setcurrency("");
			signup.setMailStop("");
			signup.setAddressLine1("");
			signup.setAddressLine2("");
			
			signup.setCity("");
			signup.setState("");
			signup.setPostalCode("");
			signup.setVerificationCode("");
			 boolean result = signup.submit();
			 assertTrue(result);
	}
	
	
	//testcase 8: password and confirm password not matching 
	 public void testNotMatchingPw()
	 {
		 
		 signup.setFirstName("Vasantha");
			signup.setLastName("Bhukya");
			signup.setCompanyName("bbca");

			signup.setCompanyType("Consulting");
			signup.setJobTitle("Engineer");
			signup.setPhoneNumber("1234567890");
			signup.setemail("vasanthabhukya101@gmail.com");
			signup.setPassword("Vasa1234");
			signup.setConfirmPassword("Vasa");
				signup.setCountry("India");	
				signup.setcurrency("INR");
				signup.setMailStop("vasanthabhukya101@gmail.com");
				signup.setAddressLine1("Warangal");
				signup.setAddressLine2("Warangal");
				
				signup.setCity("Warangal");
				signup.setState("Telangana");
				signup.setPostalCode("506009");
				signup.setVerificationCode("123456");
				 boolean result = signup.submit();
				 assertTrue(result);
	 }
	
	
	
	
	
	
	
}
