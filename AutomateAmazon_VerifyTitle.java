package selfStudy_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class AutomateAmazon_VerifyTitle
{
    WebDriver driver;
    @BeforeTest
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Amazon India");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }
    @Test
    public void TestCase02_VerifyPageTitle()
    {
        driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
        String actTitle = driver.getTitle();
        String expTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        Assert.assertEquals(actTitle,expTitle);
    }
    @AfterTest
    public void tearDown()
    {
        driver.quit();
    }
}
