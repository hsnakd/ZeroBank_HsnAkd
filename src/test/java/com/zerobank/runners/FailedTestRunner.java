package com.zerobank.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
        },
        features = "@target/rerun.txt",
        glue = "com/zerobank/stepdefinitions"

)
public class FailedTestRunner {
}
