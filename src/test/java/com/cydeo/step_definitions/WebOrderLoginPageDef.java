package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WebOrderLoginPageDef {
    WLoginPage loginPage;
    @Given("we are at web order login page")
    public void we_are_at_web_order_login_page() {
       //navigate to login page
        loginPage = new WLoginPage();
        loginPage.goTo();
    }
    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {

        loginPage.login("Tester","test");
    }
    @Then("we should see all order page")
    public void we_should_see_all_order_page() {
        //assertEquals(4,4);
      //  assertTrue(4>3);
        assertEquals("WebOrder", Driver.getDriver().getTitle());

    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {
    }

    @Then("we should still be at login page")
    public void weShouldStillBeAtLoginPage() {
    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {
    }
}
