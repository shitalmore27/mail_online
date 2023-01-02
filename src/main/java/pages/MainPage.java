package pages;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.*;

public class MainPage {

    static WebDriver driver;
    static WebDriverWait wait;
    private static Actions actions;
    String imageId = "";
    private static Object firstHandle;
    private static Object lastHandle;

    public static ExtentTest test;
    public static ExtentReports report;

public static void launch() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.addArguments("incognito");
    options.addArguments("start-maximized");

    options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));

    driver = new ChromeDriver(options);
    driver.manage().window().maximize();
    driver.get("https://www.dailymail.co.uk/home/index.html");
    wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
            .executeScript("return document.readyState")));
    actions=new Actions(driver);
    Thread.sleep(2000);
    try {
        driver.findElement(By.xpath("//button[@class='button_127GD primary_2xk2l']")).click();

    } catch (NoAlertPresentException ex) {
        //code to do if not exist.
    }

}
public static boolean validateDate() {
    String date1 = getFormattedDate(new Date());
    System.out.println(date1);
    String time = new SimpleDateFormat(("hhaaa")).format(new Date());
    System.out.println(time);
    wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
            .executeScript("return document.readyState")));
    boolean flag=false;
    if (driver.findElement(By.xpath("//strong[contains(text(),'" + date1 + "')]")).isDisplayed() && driver.findElement(By.xpath("//strong[contains(text(),'" + date1 + "')]/../a/span[@class='']")).getText().equalsIgnoreCase(time)) {
       flag=true;
    }
    return flag;

}
    public static String getFormattedDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DATE);
        if (!((day > 10) && (day < 19)))
            switch (day % 10) {
                case 1:
                    return new SimpleDateFormat(("EEEE, MMM dd'st' yyyy")).format(date);

                case 2:
                    return new SimpleDateFormat("EEEE, MMM dd'nd' yyyy").format(date);

                case 3:
                    return new SimpleDateFormat("EEEE, MMM dd'rd' yyyy").format(date);
                default:
                    return new SimpleDateFormat("EEEE, MMM dd'th' yyyy").format(date);
            }
        return new SimpleDateFormat("EEEE, MMM dd'th' yyyy").format(date);
    }
    public static void ClickonSports(){
        WebElement sp = driver.findElement(By.xpath("//a[text()='Sport']"));
        sp.click();
    }
    public static boolean validateColor(){
    boolean flag=false;
        wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState")));
        WebElement sp = driver.findElement(By.xpath("(//a[text()='Sport'])[1]"));
        String s = sp.getCssValue("color");
        String[] rgbs = s.split("\\)")[0].split("\\(")[1].split(",");
        long r = Long.parseLong(rgbs[0].trim());
        long g = Long.parseLong(rgbs[1].trim());
        long b = Long.parseLong(rgbs[2].trim());

        WebElement fb = driver.findElement(By.xpath("//a[text()='Football']"));
        String f = fb.getCssValue("color");
        String cf = Color.fromString(f).asHex();
        String[] rgbs1 = f.split("\\)")[0].split("\\(")[1].split(",");
        //System.out.println("=> The hex for cf is : " + cf);
        long r1 = Long.parseLong(rgbs1[0].trim());
        long g1 = Long.parseLong(rgbs1[1].trim());
        long b1 = Long.parseLong(rgbs1[2].trim());

        if ((r - r1) < 20 & (r - r1) > -20) {
            if ((g - g1) < 20 & (g - g1) > -20) {
                if ((b - b1) < 20 & (b - b1) > -20) {
                    flag=true;
                }
            }
        }
        return flag;
    }
    public static void clickF(){
        WebElement fb = driver.findElement(By.xpath("//a[text()='Football']"));
        fb.click();
    }
    public static void clickFirst(){
        wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState")));
        driver.findElement(By.xpath("(//h2[@class='linkro-darkred'])[1]")).click();
    }
    public static void clickImg() throws InterruptedException {
        wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState")));
        Thread.sleep(3000);
        if (driver.findElements(By.xpath("(//button[contains(@class,'openGalleryButton')])[1]/../img")).size()>0) {
            actions.moveToElement(driver.findElement(By.xpath("(//button[contains(@class,'openGalleryButton')])[1]/../img"))).perform();
            driver.findElement(By.xpath("(//button[contains(@class,'openGalleryButton')])[1]/../img")).click();
        }
    }
    public static boolean preButton(){
    boolean flag=false;
        if (driver.findElements(By.xpath("//button[contains(@class,'previousButton-')]")).size()>0) {
          flag=true;
        }
        return flag;
    }

    public static boolean nxtButton(){
        boolean flag=false;
        if (driver.findElements(By.xpath("//button[contains(@class,'nextButton-')]")).size()>0) {
            flag=true;
        }
        return flag;
    }

    public static boolean nxtFunctionality(){
        boolean flag = true;
        if (driver.findElements(By.xpath("//button[contains(@class,'nextButton-')]")).size()>0) {
            String string = driver.findElement(By.xpath("//div[contains(@class,'counter-1')]")).getText();
            System.out.println(string);
            String[] Count = string.split(" ");
            int totalCount = Integer.parseInt(Count[2]);
            for (int i = 1; i < totalCount; i++) {
                String string1 = driver.findElement(By.xpath("//div[contains(@class,'counter-1')]")).getText();
                String[] Count1 = string1.split(" ");
                int counter = Integer.parseInt(Count1[0]);
                if (counter != i) {
                    flag = false;
                }
                System.out.println("Counter" + counter);
                driver.findElement(By.xpath("//button[contains(@class,'nextButton-')]")).click();
            }
        }
       return flag;
    }

    public static boolean preFunctionality(){
        boolean flag = true;
        if (driver.findElements(By.xpath("//button[contains(@class,'previousButton-')]")).size()>0) {
            driver.findElement(By.xpath("//button[contains(@class,'previousButton-')]")).click();
            String string = driver.findElement(By.xpath("//div[contains(@class,'counter-1')]")).getText();
            System.out.println(string);
            String[] Count = string.split(" ");
            int totalCount = Integer.parseInt(Count[2]);


            for (int i = totalCount - 1; i > 0; i--) {
                String string1 = driver.findElement(By.xpath("//div[contains(@class,'counter-1')]")).getText();
                String[] Count1 = string1.split(" ");
                int counter = Integer.parseInt(Count1[0]);
                if (counter != i) {
                    flag = false;
                }
                System.out.println("Counter" + counter);
                driver.findElement(By.xpath("//button[contains(@class,'previousButton-')]")).click();
            }
        }
        return flag;
    }
    public static void cl(){
        if (driver.findElements(By.xpath("//button[contains(@class,'closeButton')]")).size()>0) {
            driver.findElement(By.xpath("//button[contains(@class,'closeButton')]")).click();
        }
    }

    public  static void FbClick() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)", "");
        actions.moveToElement(driver.findElement(By.xpath("(//button[contains(@class,'openGalleryButton')])[1]/../img"))).perform();
        // actions.moveToElement(driver.findElement(By.xpath("(//h2[@class='linkro-darkred']/..//img)[1]"))).perform();
        driver.findElement(By.xpath("(//li[@data-social-scope='facebook'])[1]")).click();
        Thread.sleep(5000);
        switchToWindowsPopup();
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Facebook"));
        driver.close();
        Thread.sleep(2000);
    }

    public static void switchToWindowsPopup() {
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> itr = handles.iterator();
        firstHandle = itr.next();
        lastHandle = firstHandle;
        while (itr.hasNext()) {
            lastHandle = itr.next();
        }
        driver.switchTo().window(lastHandle.toString());

    }
    public static boolean vFullScreen() throws InterruptedException {
        driver.switchTo().window(firstHandle.toString());
        System.out.println(driver.getTitle());
        Thread.sleep(5000);
        WebElement frame1=driver.findElement(By.xpath("//iframe[contains(@id,'footballco-video-player')]"));
        driver.switchTo().frame(frame1);
        actions.moveToElement(driver.findElement(By.xpath("//video"))).perform();
        if (driver.findElement(By.xpath("//button[@class='vjs-fullscreen-control vjs-control vjs-button']")).getText().equalsIgnoreCase("Fullscreen")) {
            driver.findElement(By.xpath("//button[@class='vjs-fullscreen-control vjs-control vjs-button']")).click();
        }
        actions.moveToElement(driver.findElement(By.xpath("//video"))).perform();
        boolean flag=false;
        if (driver.findElement(By.xpath("//button[@class='vjs-fullscreen-control vjs-control vjs-button']")).getText().equalsIgnoreCase("Exit Fullscreen")){
            flag=true;
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='vjs-fullscreen-control vjs-control vjs-button']")).click();
        Thread.sleep(2000);
        return flag;
    }
    public static String pointExtract(String team) throws InterruptedException {
        String points="";
        wait.until(webDriver -> "complete".equals(((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState")));
        // Write code here that turns the phrase above into concrete actions
        driver.switchTo().window(firstHandle.toString());
        driver.switchTo().defaultContent();
        Thread.sleep(5000);
        List<WebElement> wb=driver.findElements(By.xpath("//td[contains(@class,'team-short' ) and contains(text(),'"+team+"' )]"));
        System.out.println("WB size"+wb.size());
        if (wb.size()>0){
            points= wb.get(0).findElement(By.xpath("/following-sibling::td[contains(@class,'score-pts')]")).getText();
        }
        System.out.println("Team "+team+" has "+points);
    return points;
    }
    public static void close(){
    driver.close();
    driver.quit();
    }
}


