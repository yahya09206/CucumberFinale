package com.yahya.step_definitions;

import com.yahya.pages.WLogin;
import com.yahya.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WebOrderLoginStepDef {

    private static final Logger log = LoggerFactory.getLogger(WebOrderLoginStepDef.class);
    WLogin login;

    @Given("we are at the web order login page")
    public void we_are_at_the_web_order_login_page() {


        login = new WLogin();
        login.goTo();
//        login.login("Test", "test");
    }
    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {

        login.login("Tester", "test");
    }
    @Then("we should see the all orders page")
    public void we_should_see_the_all_orders_page() {

        assertEquals("Web Orders", Driver.getDriver().getTitle());
    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {

        login.login("Testers", "test");
    }


    @Then("we should still be at the login page")
    public void weShouldStillBeAtTheLoginPage() {

        assertEquals("Web Orders Login", Driver.getDriver().getTitle());
    }

    @And("login error message should be present")
    public void loginErrorMessageShouldBePresent() {

        assertTrue(login.loginErrorMsg());
    }

    @When("user provides username {string} and password {string}")
    public void userProvidesUsernameAndPassword(String username, String password) {

        // username and password = whatever was given to scenario
        login.login(username, password);
    }

    @When("we provide below credentials")
    public void weProvideBelowCredentials(Map<String, String> credentialMap) {
//        String usernameFromTable = credentialMap.get("username");
//        String passwordFromTable = credentialMap.get("password");
        System.out.println(credentialMap);
        login.login(credentialMap.get("username"), credentialMap.get("password"));
    }
}
