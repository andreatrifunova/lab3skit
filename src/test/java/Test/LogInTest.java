package Test;

import lab3.LogInPage;
import lab3.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LogInTest {

    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = getDriver();
    }

    @Test
    public void Test1()throws InterruptedException{
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

        final WebElement username = driver.findElement(By.id("username"));
        final WebElement password = driver.findElement(By.id("password"));
        final WebElement signin = driver.findElement(new By.ByXPath("//*[@id=\"organic-div\"]/form/div[3]/button"));

        username.sendKeys("test");
        password.sendKeys("nevalidna");

        signin.click();
    }
    @Test
    public void Test2()throws InterruptedException{
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

        final WebElement username = driver.findElement(By.id("username"));
        final WebElement password = driver.findElement(By.id("password"));
        final WebElement signin = driver.findElement(new By.ByXPath("//*[@id=\"organic-div\"]/form/div[3]/button"));

        username.sendKeys("");
        password.sendKeys("nevalidna");

        signin.click();
    }
    @Test
    public void Test3()throws InterruptedException{
        driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");

        final WebElement username = driver.findElement(By.id("username"));
        final WebElement password = driver.findElement(By.id("password"));
        final WebElement signin = driver.findElement(new By.ByXPath("//*[@id=\"organic-div\"]/form/div[3]/button"));

        username.sendKeys("andrea2000@live.com");
        password.sendKeys("a");
        //raboti testot
        signin.click();
    }

    private WebDriver getDriver() {
        System.setProperty("webdriver.chrome.driver", "/Users/andreatrifunova/Desktop/domashna3/src/main/resources/Drivers/chromedriver");
        return new ChromeDriver();

    }
    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
