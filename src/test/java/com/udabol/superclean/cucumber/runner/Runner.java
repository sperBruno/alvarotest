package com.udabol.superclean.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Henrry Salinas.
 *
 * This class store settings for the test execution
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = {"pretty",
                "html:target/test-report",
                "json:target/test-report.json",
                "junit:target/test-report.xml"},
        features = {"src/test/resources/"},
        glue = {"com.udabol.superclean.cucumber"},
        snippets = SnippetType.CAMELCASE
)
public class Runner {

}



