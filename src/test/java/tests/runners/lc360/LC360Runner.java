package tests.runners.lc360;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/feature_files/lc360",
        glue="tests/steps/lc360",
        plugin = { "pretty", "html:test-output",
                    "json:target/cucumber-report/cucumber.json",
                    "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        })
public class LC360Runner extends AbstractTestNGCucumberTests {

}