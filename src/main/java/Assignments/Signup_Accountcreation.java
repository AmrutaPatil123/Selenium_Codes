package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup_Accountcreation {

         static void main(String[] args) throws InterruptedException {

            // Launch Firefox browser
            WebDriver driver = new FirefoxDriver();

            // Open the website
            driver.get("https://automationexercise.com/");

            // Maximize the browser window
            driver.manage().window().maximize();

            // Click on Signup / Login link
            driver.findElement(By.xpath("//a[@href='/login']")).click();

            // Generate unique username and email using timestamp to avoid duplicate error
            String timestamp = String.valueOf(System.currentTimeMillis());
            String username = "John" + timestamp;
            String email    = "john" + timestamp + "@gmail.com";

            // Enter username in signup name field
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys(username);

            // Enter email in signup email field
            driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys(email);

            // Click Signup button
            driver.findElement(By.xpath("//button[text()='Signup']")).click();

            // Select gender title as Mrs
            driver.findElement(By.xpath("//input[@value='Mrs']")).click();

            // Scroll down the page by 500 pixels
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, 500)");

            // Enter password
            driver.findElement(By.id("password")).sendKeys("Test@1234");

            // Select Day from dropdown - index 3 means day 4
            WebElement Dropdown = driver.findElement(By.xpath("//select[@id='days']"));
            Select sc = new Select(Dropdown);
            sc.selectByIndex(3);

            // Select Month from dropdown by visible text
            WebElement Dropdown1 = driver.findElement(By.xpath("//select[@id='months']"));
            Select sc1 = new Select(Dropdown1);
            sc1.selectByVisibleText("March");

            // Select Year from dropdown by value
            WebElement Dropdown2 = driver.findElement(By.xpath("//select[@id='years']"));
            Select sc2 = new Select(Dropdown2);
            sc2.selectByValue("1997");

            // Check newsletter checkbox
            driver.findElement(By.xpath("//input[@type='checkbox']")).click();

            // Check offers checkbox
            driver.findElement(By.xpath("//input[@value='1']")).click();

            // Enter first name
            driver.findElement(By.id("first_name")).sendKeys("John");

            // Enter last name
            driver.findElement(By.id("last_name")).sendKeys("Doe");

            // Enter company name
            driver.findElement(By.name("company")).sendKeys("Capgemini");

            // Enter address line 1
            driver.findElement(By.id("address1")).sendKeys("MG Road");

            // Enter address line 2
            driver.findElement(By.id("address2")).sendKeys("Kothrud");

            // Select country from dropdown
            WebElement Dropdown3 = driver.findElement(By.xpath("//select[@id='country']"));
            Select sc3 = new Select(Dropdown3);
            sc3.selectByVisibleText("India");

            // Enter state
            driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Maharashtra");

            // Enter city
            driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Mumbai");

            // Enter zipcode
            driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("400001");

            // Enter mobile number
            driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("9876543210");

            // Click Create Account button
            driver.findElement(By.xpath("//button[text()='Create Account']")).click();

            // Capture and print Account Created message
            String text1 = driver.findElement(By.xpath("//b[text()='Account Created!']")).getText();
            System.out.println("Account Status : " + text1);

            // Click Continue button
            driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

            // Capture and print logged in username
            String text2 = driver.findElement(By.xpath("//b[text()='" + username + "']")).getText();
            System.out.println("Logged in as   : " + text2);
        }
    }