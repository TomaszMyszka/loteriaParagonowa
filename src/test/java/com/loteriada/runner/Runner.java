package com.loteriada.runner;

/**
 * Created by Tomek on 27.01.2016.
 */

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        format = { "pretty", "html:target/cucumber" },
        glue = "com.loteriada.stepDefs",
        features = "classpath:features/loteriada.feature")

public class Runner {
}
