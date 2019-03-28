import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertTest {

    public static void main(String args[]) throws InterruptedException {
        //set Property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Initialize Driver
        WebDriver driver=new ChromeDriver();

        //Load browser with site
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("53920");
        driver.findElement(By.name("submit")).submit();

        // Switching to Alert
        Alert alert = driver.switchTo().alert();

        // Capturing alert message.
        String alertMessage= driver.switchTo().alert().getText();

        // Displaying alert message
        System.out.println(alertMessage);
        Thread.sleep(5000);

        // Accepting alert
        alert.dismiss();
    }

    public void abc()
    {
        System.out.println("I am from AlertTest");
    }
}
