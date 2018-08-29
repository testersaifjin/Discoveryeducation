package com.projectone;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class StepDef {

    static WebDriver driver;

    @Before
    public void invokeBrowser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sjain1\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sjain1\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
        driver = new ChromeDriver();
        driver=new FirefoxDriver();
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);

    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

    @Given("^User is in Home Page$")
    public void user_is_in_Home_Page() {
//        driver.get("http://demo.nopcommerce.com/");

    }

    @When("^User select the Login link$")
    public void user_select_the_Login_link() {
        driver.findElement(By.xpath("//a[@class='ico-login']")).click();

    }

    @When("^User enter email and password$")
    public void user_enter_email_and_password() {
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("aaa@aa.aa");
        waitForSomeTime();
        driver.findElement(By.xpath("//input[@class='password']")).sendKeys("123456");
        waitForSomeTime();

    }

    @When("^User click Login button$")
    public void user_click_Login_button() {

        driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
        waitForSomeTime();
    }

    @Then("^User enter welcome screen$")
    public void user_enter_welcome_screen() {
        Assert.assertTrue(driver.findElement(By.xpath("//a[@class='ico-logout']")).isDisplayed());


    }
    public void waitForSomeTime()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}