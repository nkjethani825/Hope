import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.Properties;

public class FacebookAssignment {

    static WebDriver driver=null;
    static By email=By.name("email");
    static By password=By.name("pass");
    static By loginBtn=By.id("loginbutton");
    static By statusTextArea=By.xpath("//textarea[contains(title,'Write something here')]");
    static By shareBtn=By.xpath("//div[@class='_6c0o']/span/button");

    public static void main(String args[]) throws IOException {

        //Read data from properties file
        Properties prop=new Properties();
        prop.load(new FileInputStream("environment.properties"));

        ////set Property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();

        driver.get("https://www.facebook.com/");

        ////Enter Credentials
        enterTextOnTextField(email,prop.getProperty("Username"));
        enterTextOnTextField(password,prop.getProperty("Password"));
        clickOnElement(loginBtn);

        //Enter Hi message on status
        enterTextOnTextField(statusTextArea,"Hi");

        //Click on share button to post it
        clickOnElement(shareBtn);

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
