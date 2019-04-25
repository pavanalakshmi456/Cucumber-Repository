package skeleton;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	WebDriver driver;
	@Before
	public void before() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	 

	@Given("The URL of Mercurytours")
	public void the_URL_of_Mercurytours() 
	{
		
		//driver=DriverUtility.getdriver("chrome");
		driver.get("http://localhost:8080/TestMeApp/login.htm");
		
	}

	@When("user enters {word} as Username")
	public void user_enters_as_Username(String Username) 
	{
		driver.findElement(By.id("userName")).sendKeys(Username);
		
	}

	@When("user enters {word} as Password")
	public void user_enters_as_Password(String Password) {
	    driver.findElement(By.id("password")).sendKeys(Password);
	    
	}
	
	@When("user enters invalid data")
	public void user_enters_invalid_data(io.cucumber.datatable.DataTable dataTable) {
			
			List<List<String>> list=dataTable.asLists();
			
			//System.out.println(list.get(0).get(0);
			//System.out.println(list.get(0).get(1));
			for(List<String> list2:list )
			{
				for (String s : list2)
				{
					System.out.print(s+"\t");
				}
				System.out.println();
			}
	    
	    
	}

	@Then("user is in loginpage")
	public void user_is_in_loginpage(List<String> s) {
	    for (String string : s)
	    {
	    	System.out.println(string);
	    }
	}
	@Then("user is in the (Home|Admin Home)")
	public void user_is_in_the_page() {
		driver.findElement(By.name("Login")).click();
		Assert.assertTrue(driver.getTitle().contains("Home"));
	}
	
	   
	@After
	  
	public void after() {
		driver.close();
   }
		
	}
	



