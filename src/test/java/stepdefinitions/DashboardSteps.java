package stepdefinitions;

import org.testng.Assert;

import base.DriverFactory;
import io.cucumber.java.en.Then;
import pages.Dashboard;

public class DashboardSteps{

	    private Dashboard dashboardPage = new Dashboard(DriverFactory.getDriver()) ;
//
//	    @Given("the application is open")
//	    public void the_application_is_open() {
//	        loginPage = new LoginPage(DriverFactory.getDriver());
//	    }
	    @Then("I should see Assign Leave button")
	    public void i_should_see_assign_leave_button() {
	    	Assert.assertTrue(dashboardPage.assignLeaveIsDisplayes());
	    	
	    }
	    @Then("I should see  Leave list button")
	    public void i_should_see_leave_list_button() {
	       Assert.assertTrue(dashboardPage.leaveListIsDisplayes());
	    }
//	    @Then("I should see Timesheet button")
//	    public void i_should_see_timesheet_button() {
//	        // Write code here that turns the phrase above into concrete actions
//	        throw new io.cucumber.java.PendingException();
//	    }
//	    @Then("I should see Apply Leave button")
//	    public void i_should_see_apply_leave_button() {
//	        // Write code here that turns the phrase above into concrete actions
//	        throw new io.cucumber.java.PendingException();
//	    }
//	    @Then("I should see My Leave button")
//	    public void i_should_see_my_leave_button() {
//	        // Write code here that turns the phrase above into concrete actions
//	        throw new io.cucumber.java.PendingException();
//	    }
//	    @Then("I should see My Timesheet button")
//	    public void i_should_see_my_timesheet_button() {
//	        // Write code here that turns the phrase above into concrete actions
//	        throw new io.cucumber.java.PendingException();
//	    }
}