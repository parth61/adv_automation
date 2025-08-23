package StepDefinitions;

import cucumber.api.java.en.Given;		
import cucumber.api.java.en.Then;		
import cucumber.api.java.en.When;		

public class Steps {				

     
    @Given("^Open browser and launch the application$")				
    public void open_browser_and_launch_the_application() throws Throwable							
    {		
        System.out.println("This Step open the Firefox and launch the application.");					
    }		

    @When("^Enter the Username and Password$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^Click on login button$")					
    public void Click_on_login_button() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }		

}
