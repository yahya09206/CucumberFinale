package com.yahya.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorStepDef {

    int actualResult;

    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("This is @Given code calculator_app_is_open");
    }
    @When("I add {int} with {int}")
    public void i_add_with(Integer num1, Integer num2) {
        System.out.println("When I add " + num1 + " " + num2);
        actualResult = num1 + num2;
    }
    @Then("I should get result {int} displayed")
    public void i_should_get_result_displayed(int expectedResult) {
        System.out.println("@Then result should be " + expectedResult);

        assertEquals(expectedResult, actualResult);

    }
}
