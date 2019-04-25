package skeleton;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.Registerpages;

public class DemoWebShop {
	WebDriver driver;
	Registerpages page1;
	@Before
	public void init()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		page1=PageFactory.initElements(driver,Registerpages.class);
		
	}
	@Given("url of the demo webshop")
	public void url_of_the_demo_webshop() {
		driver.get("http://demowebshop.tricentis.com/register");
	}

	@When("user enters the data for registration")
	public void user_enters_the_data_for_registration() {
		Registerpages.gender.click();
		Registerpages.firstName.sendKeys("pavana");
		Registerpages.lastName.sendKeys("lakshmi");
		Registerpages.Email.sendKeys("pavana.lakshmi@we.test");
		Registerpages.password.sendKeys("pavana123");
		Registerpages.confirmpassword.sendKeys("pavana123");
		Registerpages.registerbutton.click();
	    
	}

	@Then("user is registered successfully")
	public void user_is_registered_successfully() {
		//Assert.assertTrue(driver.getTitle().contains("Your registration completed"));
		
			}
	/*
	@After
		public void close()
			{
				driver.close();
			}
	*/
	}
