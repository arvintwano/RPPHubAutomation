package hub.test.RegressionSuite;


import hub.library.TestInitReference;
import hub.utilities.RegressionSuiteUtil.UserRegressionSuiteUtil;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import atu.testng.reports.ATUReports;
import atu.testng.reports.listeners.ATUReportsListener;
import atu.testng.reports.listeners.ConfigurationListener;
import atu.testng.reports.listeners.MethodListener;
import atu.testng.reports.utils.Utils;

@Listeners({ ATUReportsListener.class, ConfigurationListener.class, MethodListener.class })
public class UserOrderConfirmation extends TestInitReference {
	{
		System.setProperty("atu.reporter.config", "/tooltwist/eclipse/RPPHub/conf/atu.properties");
	}
	    
    @BeforeClass
    public void init() {
           ATUReports.setWebDriver(driver);
           setIndexPageDescription();
           driver.navigate().to("https://stage-cbalender.rppropertyhub.com/Login");
    }
    
    private void setIndexPageDescription() {
        ATUReports.indexPageDescription = "Hub";
        ATUReports.setAuthorInfo("Automation Tester", Utils.getCurrentTime(),"1.0");
    }

	@Test(description="User - Order Confirmation", priority=0)
	public void RT_02707_Order_Confirmation_HTTPS() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.proceedToOrderConfirmation();
			util.urlHttps();
	}
	@Test(description="User - Order Confirmation", priority=1)
	public void RT_05429_Order_Confirmation_User_Administration() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.userAdministration();
	}
	@Test(description="User - Order Confirmation", priority=2)
	public void RT_09301_Order_Confirmation_You_Ordered_Tile() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.youOrderedTile();
	}
	@Test(description="User - Order Confirmation", priority=3)
	public void RT_2982_Order_Confirmation_InstructionDetails() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.verifyInstructionDetails();
	}
	@Test(description="User - Order Confirmation", priority=4)
	public void RT_02302_Order_Confirmation_Start_New_Order() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.startNewOrder();
	}
	@Test(description="User - Order Confirmation", priority=5)
	public void RT_03016_Order_Confirmation_Summary_Wordings() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.orderConfirmationWordings();
	}
	@Test(description="User - Order Confirmation", priority=6)
	public void RT_03019_Order_Confirmation_Product_Enquiry() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.productAndEnquiry();
	}
	@Test(description="User - Order Confirmation", priority=7)
	public void RT_02138_Order_Confirmation_Report_Popup() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.reportPopup();
	}
	@Test(description="User - Order Confirmation", priority=8)
	public void RT_03005_Order_Confirmation_Download_PDF() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.downloadPDF();
	}
	@Test(description="User - Order Confirmation", priority=9)
	public void RT_03317_Mortgage_Valuation_Popup() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.mortgageValuationPopup();
	}
	@Test(description="User - Order Confirmation", priority=10)
	public void RT_03007_Order_Confirmation_Details() throws Exception {		
		UserRegressionSuiteUtil util = new UserRegressionSuiteUtil();
			util.ocPropertyDetailsTile();
	}
}