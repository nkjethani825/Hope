import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WikiTest
{

    public static void main(String args[]) throws InterruptedException {
         WebDriver driver=null;
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("http://demo.guru99.com/test/newtours/register.php");
        Thread.sleep(10000);
        Select elment= new Select(driver.findElement(By.name("country")));
       // driver.findElement(By.name("cabinclass")).click();
        Thread.sleep(2000);
        elment.selectByVisibleText("ANTARCTICA");
//        elment=driver.findElement(By.linkText("Featured content"));
//        elment.click();

    }
}
