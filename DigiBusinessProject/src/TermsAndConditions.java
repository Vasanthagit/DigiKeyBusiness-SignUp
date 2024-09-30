
public class TermsAndConditions { 
	
	
	    private boolean accepted;

	    public TermsAndConditions() {
	        accepted = false;
	    }

	    public String display() {
	        return "Terms and Conditions: [Your terms here]";
	    }

	    public boolean accept() {
	        accepted = true;
	        return accepted;
	    }

	    public boolean reject() {
	        accepted = false;
	        return accepted;
	    }

	    public boolean isAccepted() {
	        return accepted;
	    }
	}

	
	
	
	
	


