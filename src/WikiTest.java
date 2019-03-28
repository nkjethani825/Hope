import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class WikiTest
{

    public static void main(String args[]) throws InterruptedException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
      /*   WebDriver driver=null;
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
*/

        Class classname=Class.forName("AlertTest");
        Object obj=classname.newInstance();
        Method m=classname.getMethod("abc");
        ((Method) m).invoke(obj);

      /*  File f=new File("C:\\Users\\MP\\Downloads");
        String[] s=f.list();
        for(String filename:s)
            System.out.println(filename);*/

     /*   HashMap map=new HashMap<String,String>();
        map.put("1","abc");
        Set<String> set=map.keySet();
        ArrayList<String> list=new ArrayList<String>(set);
        for(String str:list)
            System.out.println(str);

        Collection<String> c=map.values();
        list=new ArrayList<String>(c);

        for(String str:list)
            System.out.println(str);

        Set<Map.Entry<String,String>> entrySet=map.entrySet();
        ArrayList<Map.Entry<String,String>> entries=new ArrayList<Map.Entry<String, String>>(entrySet);
        for(Map.Entry<String,String> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());*/

     /*String s="Hello Nikita Jethani";
     String s1=s.replaceAll("\\s+","");
     System.out.println(s1);*/

        File[] drives = File.listRoots();

        if(drives.length > 0 && drives != null)
        {
            for (File drive : drives)
            {
                System.out.println("Drive Name : "+drive);
            }
        }
        }




}
