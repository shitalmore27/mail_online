package Steps;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.MainPage;

import java.awt.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;
import java.util.List;

import static com.relevantcodes.extentreports.LogStatus.FAIL;
import static com.relevantcodes.extentreports.LogStatus.PASS;


public class MyStepdefs {

    MainPage mp=new MainPage();
    @Given("^Launch application$")
    public static void launch_application() throws Throwable {
        MainPage.launch();
        MainPage.test = MainPage.report.startTest("UI Test");
        MainPage.test.log(PASS, "Able to launch application");
    }

    @Then("^Validate todays date$")
    public void validate_todays_date() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //MainPage mp = new MainPage();
        //DateFormat dateFormat = new SimpleDateFormat("EEEE, dd MMM yyyy");
        boolean flag=MainPage.validateDate();
        if ( flag) {
            MainPage.test.log(PASS, "Date and time is displayed in expected formate");
        }else{
            MainPage.test.log(FAIL, "Date and time is not displayed in expected formate");
        }
    }

    @When("^Navigate to Sports$")
    public void navigate_to_Sports() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MainPage.ClickonSports();
        MainPage.test.log(PASS, "Clicked on Sports");
    }

    @Then("^validate background color for primary and secondary navigation$")
    public void validate_background_color_for_primary_and_secondory_navigation() throws Throwable {

        boolean flag=MainPage.validateColor();
        if ( flag) {
            MainPage.test.log(PASS, "Primary and Secodory navigation colors are as expected");
        }else{
            MainPage.test.log(FAIL, "Primary and Secodory navigation colors are not as expected");
        }
    }


    @When("^Navigate to Football$")
    public void navigate_to_Football() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MainPage.clickF();
        MainPage.test.log(PASS, "Clicked on Football");
    }

    @When("^Navigate to first article$")
    public void navigate_to_first_article() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MainPage.clickFirst();
        MainPage.test.log(PASS, "Clicked on First Article");
    }

    @When("^Click on first image from article$")
    public void click_on_first_image_from_article() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      MainPage.clickImg();
        MainPage.test.log(PASS, "Clicked on First image of the article");
    }

    @Then("^validate Previous button on image is displayed$")
    public void validate_Previous_button_on_image_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean flag=false;
        flag=MainPage.preButton();
        if ( flag) {
            MainPage.test.log(PASS, "Previous button is displayed on image");
        }else{
            MainPage.test.log(FAIL, "Previous button is not displayed on image");
        }
    }

    @Then("^validate Next button on image is displayed$")
    public void validate_Next_button_on_image_is_displayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean flag=false;
        flag=MainPage.nxtButton();
        if ( flag) {
            MainPage.test.log(PASS, "Next button is displayed on image");
        }else{
            MainPage.test.log(FAIL, "Next button is not displayed on image");
        }
    }

    @Then("^Validate Next button functionality$")
    public void validate_Next_button_functionality() throws Throwable {
        boolean flag=false;
        flag=MainPage.nxtFunctionality();
        if ( flag) {
            MainPage.test.log(PASS, "Next button functionality is working as expected");
        }else{
            MainPage.test.log(FAIL, "Next button functionality is not working as expected");
        }
    }


    @Then("^Validate Previous button functionality$")
    public void validate_Previous_button_functionality() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        boolean flag=false;
        flag=MainPage.preFunctionality();
        if ( flag) {
            MainPage.test.log(PASS, "Previous button functionality is working as expected");
        }else{
            MainPage.test.log(FAIL, "Previous button functionality is not working as expected");
        }
    }

    @When("^Click on close button$")
    public void click_on_close_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
       MainPage.cl();
        MainPage.test.log(PASS, "Clicked on Close");
    }

    @Then("^Click on Facebook icon and verify opened window$")
    public void click_on_Facebook_icon() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MainPage.FbClick();
        MainPage.test.log(PASS, "Clicked on Facebook link");
    }



    @Then("^Click on Video full screen$")
    public void click_on_Video_full_screen() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //driver.switchTo().frame("performyield602695963489_MOAT_IFRAME");
        boolean flag=false;
        flag=MainPage.vFullScreen();
        if ( flag) {
            MainPage.test.log(PASS, "video displayed in fullscreen");
        }else{
            MainPage.test.log(FAIL, "video can not be displayed in fullscreen");
        }
    }

    @Then("^exhibit points for \"([^\"]*)\" team$")
    public void exhibit_points_for_team(String arg1) throws Throwable {
        String points = MainPage.pointExtract(arg1);
        MainPage.test.log(PASS, "Team "+arg1+" has "+points);
    }

    @Then("^Close the test run$")
    public void close() throws Throwable {
        MainPage.report.endTest(MainPage.test);
        MainPage.close();

    }
}



