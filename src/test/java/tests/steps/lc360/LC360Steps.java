package tests.steps.lc360;

import excel.ExcelUtilities;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import pages.lc360.LC360;
import tests.Base;

import java.io.IOException;
import java.util.Map;

public class LC360Steps extends Base {
    LC360 lc360;
    @Before
    //@Given("I open OKTA and select LC360 tile")
    public void iOpenOKTAAndSelectLC360Tile() throws InterruptedException {
        init("CHROME");
        lc360 = new LC360(driver);
        lc360.openOKTA();
        lc360.selectLC360();
    }

    @And("I navigate to inspections")
    public void iNavigateToInspections() {
        lc360 = new LC360(driver);
        lc360.navigateToInspections();
    }

    @And("I search for a policy {string}")
    public void iSearchForAPolicy(String policyNum) {
        lc360 = new LC360(driver);
        lc360.searchPolicy(policyNum);
    }

    @And("I select the policy {string}")
    public void iSelectThePolicy(String policyNum) {
        lc360 = new LC360(driver);
        lc360.selectPolicy(policyNum);
    }

    @And("I assign myself as Risk Manager {string}")
    public void iAssignMyselfAsRiskManager(String riskManager) throws InterruptedException {
        lc360 = new LC360(driver);
        lc360.assignAsRiskManager(riskManager);
    }

    @Then("I fill in underwriter form {string}")
    public void iFillInUnderwriterForm(String row) throws Throwable {
        lc360 = new LC360(driver);
        Map<String,String> data = ExcelUtilities.getRowData("src/test/test_data/LC360.xlsx","UnderwriterForm",row);
        lc360.navigateToUnderwriterForm();
        lc360.fillForm(data);
        lc360.save();
    }

}