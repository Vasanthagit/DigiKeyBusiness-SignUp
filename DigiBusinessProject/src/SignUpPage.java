 

public class SignUpPage {  
	 
	private  String  firstName;
	private  String lastName;
	
	private  String companyName;
	
	private  String companyType;
	
	private  String jobTitle;
	
	private  String email;
	
	private  String phoneNumber;
	
	
	private  String password;
	private  String  confirmPassword;
	private  String  country;
	private  String currency;
	
	
	private  String mailStop;
	
	private  String addressLine1;

	private  String addressLine2;
	
	private  String city;
	private String state;
	private  String postalCode;
	private String verificationCode;
	
	//setters for page1 
	public void setFirstName( String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName( String lastName)
	{
		
	this.lastName = lastName;
	}
	
	public void setCompanyName(String companyName)  
	{
		this.companyName = companyName;
		
	}
	public void setCompanyType( String companyType)
	{
		this.companyType = companyType;
	}
	public void setJobTitle( String jobTitle)
	{
		this.jobTitle = jobTitle;
	}
 
	public void setPhoneNumber( String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}
	public void setemail( String email)
	{
		this.email = email;
		
	}
	
	public void setPassword( String password)
	{
		this.password = password;
		
	}
	
	public void setConfirmPassword( String confirmPassword)
	{
		this.confirmPassword = confirmPassword;
	} 
	
	public void setCountry( String coountry)
	{
		this.country = country;
		
	}
	
	public void setcurrency( String currency)
	{
		this.currency = currency;
	}
	
	public void setMailStop( String mailStop)
	{
		this.mailStop = mailStop;
	}
	
	public void setAddressLine1( String addressLine1)
	{
		this.addressLine1 = addressLine1;
	}
	
	public void setAddressLine2( String addressLine2)
	{
		this.addressLine2 = addressLine2;
	}
	
	public void setCity( String city)
	{
		this.city = city;
	}
	
	public void setState( String state)
	{
		this.state = state;
	}
	
	
	public void setPostalCode( String postalCode)
	{
		this.postalCode = postalCode;
	}
	
	
	public void setVerificationCode( String verificationCode)
	{
		 this.verificationCode = verificationCode;
	}
	
	
	
  


//page 1 validation 

public boolean isPage1Valid()
{
	return !firstName.isEmpty()&&!lastName.isEmpty()&&!companyName.isEmpty()&&!companyType.isEmpty()&&!jobTitle.isEmpty()&&password != null && password.equals(confirmPassword)&&phoneNumber.length()==10;
}

//page2 validation 
 public boolean isPage2Valid()
 {
	 return !country.isEmpty()&&!currency.isEmpty()&&!addressLine1.isEmpty()&&!addressLine2.isEmpty()&&!city.isEmpty()&&!state.isEmpty()&&postalCode.length()>0;
 } 
 //page3 validation 
 
 public boolean isPage3Valid()
 {
	 return verificationCode != null &&verificationCode.length()==6;
 }
 
 //submit function assuming all pages are valid 
 public boolean submit( )
 {
	 return isPage1Valid()&&isPage2Valid()&&isPage3Valid();
 }
 
 
 
 
 
 
}   





































