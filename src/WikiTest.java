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
        driver.get("https://www.phptravels.net/m-flights");
        Thread.sleep(10000);
        Select elment= new Select(driver.findElement(By.name("cabinclass")));
        driver.findElement(By.name("cabinclass")).click();
        Thread.sleep(2000);
        elment.selectByValue("first");
//        elment=driver.findElement(By.linkText("Featured content"));
//        elment.click();

    }
}
