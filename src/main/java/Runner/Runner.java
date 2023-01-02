package Runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.testng.annotations.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import pages.MainPage;


@CucumberOptions(features="Features",glue={"Steps"} ,plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
        "junit:target/cucumber-reports/Cucumber.xml",
        "html:target/cucumber-reports"},monochrome = true)
public class Runner extends AbstractTestNGCucumberTests
{

@BeforeClass
public static void bSuite(){
    }
     @BeforeTest
     public static void before(){
          MainPage.report = new ExtentReports(System.getProperty("user.dir")+"/ExtentReports/ExtentReportResults.html");

       }
     @AfterTest
     public static void after(){

          MainPage.report.flush();
     }
}