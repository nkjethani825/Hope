import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WikiTest
{

    public static void main(String args[])
    {
         WebDriver driver=null;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        WebElement elment= driver.findElement(By.xpath("//a[@title=\"English — Wikipedia — The Free Encyclopedia\"]"));
        elment.click();
        elment=driver.findElement(By.linkText("Featured content"));
        elment.click();

    }
}
