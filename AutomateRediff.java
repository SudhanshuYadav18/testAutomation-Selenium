package selfStudy_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class AutomateRediff
{
    WebDriver driver;
    String bseIndex;
    @BeforeClass
    public  void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("Rediff");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
    @Test
    public void Validation() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='LC20lb MBeuO DKV0Md']")).click();
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        bseIndex = driver.findElement(By.id("bseindex")).getText();
        Thread.sleep(5000);
    }
    @AfterClass
    public  void tearDown()
    {
        System.out.println("BSE Index for the Day is : "+bseIndex);
        driver.quit();
    }
}