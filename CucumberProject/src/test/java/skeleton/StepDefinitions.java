package skeleton;





import org.junit.Assert;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class StepDefinitions 
{
	Person sean=new Person();
	
	@Given("Sean is {int}metres away from Lucia")
	public void sean_is_metres_away_from_Lucia(Integer int1) {
	    	    sean.setDistance(int1);
	  
	}

	@When("Sean shouts {string}")
	public void sean_shouts(String string) {
	    
	   
	    sean.setMessage(string);
	}

	@Then("Lucia {string} to the message")
	public void lucia_listens_to_the_message(String flag) {
		if(flag.contentEquals("listens"))
		{
			String message=sean.getMessage();
			//assert.assertEquals("Free Coffee",message);
			Assert.assertEquals("Free Coffee", message);
		}
	    
		else if(flag.contentEquals("Cannot listen"))
		{
			 String message=sean.getMessage();
			 Assert.assertEquals("CANNOT HEAR", message);
		}
	  	
	}

}
