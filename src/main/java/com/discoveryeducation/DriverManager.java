package com.discoveryeducation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class DriverManager {
    public static WebDriver driver;
    public static String browser;
    public static String url;

    public static void properties() throws IOException {
        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\config.properties");
        properties.load(fis);

        browser = properties.getProperty("browser");
        url = properties.getProperty("url");


    }

    public void invokeBrowser()
    {

        if (browser.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\sjain1\\Downloads\\geckodriver-v0.21.0-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
    }

    public void closeBrowser()
    {
        driver.close();
    }

    public static String random()
    {
        Random random = new Random();
        return random.nextInt()+"saif";
    }

    public static String randomOne()
    {
        Random randomOne = new Random();
        return randomOne.nextInt()+ "folder";
    }
}
