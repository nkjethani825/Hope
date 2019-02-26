import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioTest {

    public static void main(String args[]) throws InterruptedException {
        //set Property for chrome driver
        System.setProperty("webdriver.chrome.driver","C:\\Users\\MP\\Downloads\\chromedriver_win32\\chromedriver.exe");

        //Initialize Driver
        WebDriver driver=new ChromeDriver();

        //Load browser with site
      //  driver.get("http://demo.guru99.com/test/facebook.html"); //Use this site for last example
        driver.get("http://demo.guru99.com/test/radio.html");
        Thread.sleep(3000);
        driver.findElement(By.id("vfb-7-3")).click();
        driver.findElement(By.id("vfb-7-3")).click();
        if(driver.findElement(By.id("vfb-7-3")).isSelected())
            System.out.println("Radio button is selected");
        else
            driver.findElement(By.id("vfb-7-3")).click();
     //   driver.findElement(By.id("vfb-7-2")).click();

       // driver.findElement(By.id("vfb-6-0")).click();
       // driver.findElement(By.id("vfb-6-1")).click();

        //Example of tag with attribute
    //    driver.findElement(By.cssSelector("input[id=vfb-6-1]")).click();

        //Example of tag with id
      //  driver.findElement(By.cssSelector("input#vfb-6-1")).click();

        //Example of tag with class
     //   driver.findElement(By.cssSelector("b.caret")).click();

        //Example of tag, class Name and attribute
     //   driver.findElement(By.cssSelector("input.inputtext[tabindex='2']")).sendKeys("Heyyy");

    }
}
