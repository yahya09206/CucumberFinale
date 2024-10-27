package com.yahya.step_definitions;

import com.yahya.pages.LibLoginPage;
import com.yahya.utility.BrowserUtil;
import com.yahya.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibraryLoginStepDefs {

    LibLoginPage loginPage = new LibLoginPage();

    @Given("user is at library login page")
    public void userIsAtLibraryLoginPage() {
        loginPage.goTo();
    }

    @When("user uses username {string} and passcode {string}")
    public void userUsesUsernameAndPasscode(String email, String password) {

        loginPage.login(email, password);
    }

    @Then("user should be at dashboard page")
    public void userShouldBeAtDashboardPage() {

        BrowserUtil.waitFor(1);
        assertEquals("Library", Driver.getDriver().getTitle());
    }
}