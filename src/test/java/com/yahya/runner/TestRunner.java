package com.yahya.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

/**
 * Sole purpose of this class is to instruct which feature file(s) to run
 * where the step defs are etc.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
                glue = "com/yahya/step_definitions")
public class TestRunner {
}