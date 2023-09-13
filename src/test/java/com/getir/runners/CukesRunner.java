package com.getir.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty","json:target/cucumber/reports/Cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml",
                //"html:target/cucumber-reports"
        },
        features = "src/test/resources/features",
        glue = "com/getir/step_definitions",
        dryRun = true,
        tags = "@wip"

)
public class CukesRunner {

}
