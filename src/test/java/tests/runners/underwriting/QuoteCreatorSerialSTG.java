package tests.runners.underwriting;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test
@CucumberOptions(
        features = "src/test/java/feature_files/underwriting/utilities/QuoteCreation.feature",
        glue="tests/steps",
        plugin = { "pretty", "html:test-output",
                    "json:target/cucumber-report/cucumber.json",
                    "io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"
        })
public class QuoteCreatorSerialSTG extends AbstractTestNGCucumberTests {
//        @Override
//        @DataProvider(parallel = true)
//        public Object[][] scenarios(){
//                return super.scenarios();
//        }
}