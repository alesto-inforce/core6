package tests.steps.underwriting.utilities;

import excel.ExcelUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import pages.*;
import pages.components.CommonComponentsAndActions;
import selenium_core.DriverType;
import tests.Base;
import tests.listeners.AllureTestNGListener;

import java.io.IOException;
import java.util.Map;

/**
 *  Contains steps necessary for creating quotes
 */
@Listeners(AllureTestNGListener.class)
public class QuoteCreation extends Base {

    /**
     * ENV field will capture TestNG ENV parameter value
     */
    static final String ENV = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("ENV");
    static final String BROWSER = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("BROWSER");

    /**
     * Test data for Quote creation
     */
    static final String QuoteCreationData = "src/test/test_data/QuoteCreation.xlsx";

    //Declaring pages used in tests
    LoginPage loginpage;
    HomePage homePage;
    QuotesPage quotesPage;
    QuoteBasicInformationPage quoteBasicInformationPage;
    HomeownersPolicyCoverPage homeownersPolicyCoverPage;
    LocationCoveragePage locationCoveragePage;
    OptionalCoveragesPage optionalCoveragesPage;
    PreviousClaimLossesPage previousClaimLossesPage;
    PremiumSummaryPage premiumSummaryPage;
    UnderwritingReferralsPage underwritingReferralsPage;
    SummaryPage summaryPage;
    RequiredFormsPage requiredFormsPage;
    EditAttachmentPage editAttachmentPage;

    /**
     * Initializes Chrome driver
     */
    @Before
    public void setup(){
        init(BROWSER);
    }

    /**
     * Closes the Chrome driver
     */
    @After
    public void tearDown(){
        quit();
    }

    /**
     * Takes use of the ENV field from TestNG.xml file to determine the environment
     * and logs in the user passed to it as a parameter
     * @param subrole User to log in to the system
     */
    @Given("I am logged in to Pure as {string}")
    public void iAmLoggedInToPureAs(String subrole) throws InterruptedException {
        loginpage = new LoginPage(driver);
        loginpage.openApplication(ENV);
        loginpage.login(ENV,subrole);
    }

    /**
     * Navigates from Home page o Quotes page
     */
    @When("I navigate to Quotes")
    public void iNavigateToQuotes() {
        homePage = new HomePage(driver);
        homePage.clickElement(CommonComponentsAndActions.quotes);
    }

    /**
     * Initiates a quote for a new customer with given state and location details
     * @param state state
     * @param primaryAddress address
     * @param city city
     * @param zip zip code
     * @throws InterruptedException /
     * @throws IOException /
     */
    @And("I initiate a new quote for a new customer with location in {string} {string} {string} {string}")
    public void iInitiateANewQuoteForANewCustomerWithLocationIn(String state, String primaryAddress, String city, String zip) throws InterruptedException, IOException {
        quotesPage = new QuotesPage(driver);
        quoteBasicInformationPage = new QuoteBasicInformationPage(driver);

        Map<String,String> initiateQuoteData = ExcelUtilities.getData(QuoteCreationData,"InitiateQuote");

        quotesPage.newQuote();
        quotesPage.searchAndSelectAgencyAdvanced(ENV);

        initiateQuoteData.put("ENV",ENV);
        initiateQuoteData.replace("EffectiveDate",getNextWeekDate());
        initiateQuoteData.replace("RiskState",state);
        initiateQuoteData.replace("State",state);
        initiateQuoteData.replace("PrimaryAddressLine",primaryAddress);
        initiateQuoteData.replace("City",city);
        initiateQuoteData.replace("ZIPCode",zip);

        quoteBasicInformationPage.initiateQuote(initiateQuoteData);

        quoteBasicInformationPage.clickElement(CommonComponentsAndActions.next);
        quoteBasicInformationPage.clickElement(CommonComponentsAndActions.createNewCustomer);
    }

    /**
     * Creates and rates a quote given QuoteCreation.xlsx data
     *
     * @throws IOException /
     * @throws InterruptedException /
     */
    @And("I create a quote")
    public void iCreateAQuote() throws IOException, InterruptedException {
        homeownersPolicyCoverPage = new HomeownersPolicyCoverPage(driver);
        locationCoveragePage = new LocationCoveragePage(driver);
        optionalCoveragesPage = new OptionalCoveragesPage(driver);
        previousClaimLossesPage = new PreviousClaimLossesPage(driver);

        Map<String,String> policyCoverPageData = ExcelUtilities.getData(QuoteCreationData,"HOPolicyCoverPage");
        Map<String,String> basicLocationCoverageData = ExcelUtilities.getData(QuoteCreationData,"BasicLocationCoverage");

        homeownersPolicyCoverPage.fillOutHomeownersPolicyCoverPage(policyCoverPageData);
        homeownersPolicyCoverPage.clickElement(CommonComponentsAndActions.actionButtonNext);
        locationCoveragePage.fillBasicLocationCoverageDetails(basicLocationCoverageData);
        locationCoveragePage.clickElement(CommonComponentsAndActions.actionButtonNext);
        Thread.sleep(10000);
        optionalCoveragesPage.clickElement(CommonComponentsAndActions.actionButtonNext);
        previousClaimLossesPage.noPriorLossesInPastFiveYears();

        previousClaimLossesPage.clickElement(CommonComponentsAndActions.rate);
    }

    @And("I accept underwriting referrals")
    public void iAcceptUnderwritingReferrals() throws InterruptedException {
        premiumSummaryPage = new PremiumSummaryPage(driver);
        underwritingReferralsPage = new UnderwritingReferralsPage(driver);

        Thread.sleep(30000);
        premiumSummaryPage.clickElement(CommonComponentsAndActions.underwritingReferrals);
        underwritingReferralsPage.acceptReferrals("Accepted");
        underwritingReferralsPage.clickElement(CommonComponentsAndActions.accept);
        underwritingReferralsPage.acceptReferralsPopUp();
        Thread.sleep(10000);
    }

    @And("I create required forms")
    public void createRequiredForms() throws IOException, InterruptedException {
        summaryPage = new SummaryPage(driver);
        premiumSummaryPage = new PremiumSummaryPage(driver);
        requiredFormsPage = new RequiredFormsPage(driver);
        editAttachmentPage = new EditAttachmentPage(driver);

        summaryPage.clickElement(CommonComponentsAndActions.premiumSummary);
        premiumSummaryPage.clickElement(CommonComponentsAndActions.createRequiredForms);

        Thread.sleep(10000);
        requiredFormsPage.fillSignaturePreferenceAndUpload("member@email.com", "broker@email.com");

        Map<String,String> attachmentDetails = ExcelUtilities.getData(QuoteCreationData,"HOEditAttachmentPage");

        editAttachmentPage.addAttachment(attachmentDetails);
        editAttachmentPage.clickElement(CommonComponentsAndActions.saveChanges);

        requiredFormsPage.generateDocuments();

        requiredFormsPage.clickElement(CommonComponentsAndActions.sendEmailSignature); //todo refactor call from pre-bind forms page (create page and components)

        //TODO application error
        System.out.println("End");
    }
}