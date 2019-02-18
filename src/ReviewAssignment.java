import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ReviewAssignment {

    static By LoginLink=By.linkText("Login");
    static WebDriver driver=null;
    static By username=By.name("em");
    static By password=By.name("pw1");
    static By loginBtn=By.xpath("(//div[@class='btns']/button)[1]");
    static By fourthRatingStar=By.linkText("4");
    static By dropDown=By.xpath("//div[@class='dropdown-title']");
    static By healthItem=By.linkText("Health");
    static By reviewTextField=By.name("review");
    static By submitButton=By.xpath("//div[@class='submit']");
    static By ratingElements=By.xpath("//span[@class='wh-rating rating_4_5']");
    static By fourthRatingStarOnReview=By.xpath("(//div[@class='rating-overall']/span/a)[4]");
    static By getFreeCreditScorePopup=By.xpath("//i[@class='af-icon-cross']");

    public static void main(String args[]) throws InterruptedException {

        //set Property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Initialize Driver
        WebDriver driver=new ChromeDriver();

        //Load browser with site
        driver.get("https://wallethub.com/join/light");

        //wait till Login link gets visible on screen (Max : 15 seec)
        WebDriverWait wait=new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement( By.linkText("Login"))));

        clickOnElement(LoginLink);

        //Enter Credentials
        enterTextOnTextField(username,"nkjethani825");
        enterTextOnTextField(password,"Guide-07");
        clickOnElement(loginBtn);

        //Navigate to URL "http://wallethub.com/profile/test_insurance_company"
        driver.navigate().to("http://wallethub.com/profile/test_insurance_company");

        Actions actions=new Actions(driver);
        //Mouse rating stars
        actions.moveToElement(driver.findElement(ratingElements)).click().build().perform();
        clickOnElement(fourthRatingStar);

        //select health item from dropdown
        clickOnElement(dropDown);
        clickOnElement(healthItem);

        //Select rating star
        actions.moveToElement(driver.findElement(fourthRatingStarOnReview)).click().build().perform();

        clearTextField(reviewTextField);

        String randomText="Random Text : Abcdefghijklmonpqrstuvwxyz12345678910Abcdefghijklmonpqrstuvwxyz12345678910Abcdefghijklmonpqrstuvwxyz12345678910Abcdefghijklmonpqrstuvwxyz12345678910Abcdefghijklmonpqrstuvwxyz12345678910";
        enterTextOnTextField(reviewTextField,randomText);

        if(driver.findElement(getFreeCreditScorePopup).isDisplayed())
            driver.findElement(getFreeCreditScorePopup).click();

        //scroll down window
        JavascriptExecutor jse= ((JavascriptExecutor) driver);
        jse.executeScript("scroll(0,400)");


        clickOnElement(submitButton);

        driver.navigate().to("https://wallethub.com/profile/nkjethani825/reviews/");

        //Get page source and verify review posted or not
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        if (pageSource.contains(randomText))
            System.out.println("Review posted on profile");
        else
            Assert.fail("Review has not been posted on profile");

    }

    public static void enterTextOnTextField(By element, String text)
    {
        driver.findElement(element).sendKeys(text);
    }

    public  static void clearTextField(By element)
    {
        driver.findElement(element).clear();
    }

    public static void clickOnElement(By element)
    {
        driver.findElement(element).click();
    }
}
