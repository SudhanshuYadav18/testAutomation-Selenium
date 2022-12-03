package selfStudy_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AutomateMIC_VerifyLogin
{
    WebDriver driver;
    @BeforeMethod
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://meetinchat.com/");
        driver.findElement(By.xpath("//*[text()='Start Chatting']")).click();
    }
    @Test
    public  void  TestCase01() throws InterruptedException
    {
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='mailAddress']")).sendKeys("shobit2898@gmail.com");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Shob@1234");
        Thread.sleep(6000);
        driver.findElement(By.xpath("//*[text()='Login']")).click();
        Thread.sleep(6000);
        String actUserName = driver.findElement(By.xpath("//*[@class='user-name']")).getText();
        Thread.sleep(6000);
        String expUserName = "Shobit";
        Assert.assertEquals(actUserName,expUserName);
    }
    @AfterMethod
    public void tearDown()
    {
        driver.quit();
    }
}