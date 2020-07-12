import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class part3 {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod(){
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://app.hubspot.com/login");

        WebElement Username = driver.findElement(By.id("username"));
        Username.sendKeys("technostudyy@gmail.com");

        WebElement passWordInput = driver.findElement(By.id("password"));
        passWordInput.sendKeys("TechnoStudy123");

        driver.findElement(By.id("loginBtn")).click();
    }

    @Test
    public void contact(){

        driver.findElement(By.id("nav-primary-contacts-branch")).click();

        driver.findElement(By.id("nav-secondary-contacts")).click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("contacts"));
    }

    @Test
    public void companies(){

        driver.findElement(By.id("nav-primary-contacts-branch")).click();

        driver.findElement(By.id("nav-secondary-companies")).click();

        String url = driver.getCurrentUrl();

        Assert.assertTrue(url.contains("companies"));

    }

    @AfterMethod
    public void afterMethod(){
        driver.quit();
    }
}
