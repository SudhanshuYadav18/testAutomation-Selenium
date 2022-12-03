package selfStudy_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWebBrowser
{
    public static void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromeDriver\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Google India");
        driver.findElement(By.name("btnK")).click();
        driver.findElement(By.xpath("//*[text()=\"Google\"]")).click();
        String pageTitle = driver.getTitle();
        System.out.println("Title of the web page you visited is : " + pageTitle);
        driver.quit();
    }
}