import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebTables {


        public static void main(String[] args) {

            // Driver object created for Chrome browser
            WebDriver driver = new ChromeDriver();

            // Launch App
            driver.get("https://the-internet.herokuapp.com/tables");

            // Maximize the browser
            driver.manage().window().maximize();

            //  Table ROW count
            List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
            int row_count = rows.size();
            System.out.println("Table row count is " + row_count);

            //  Table COLUMN count
            List<WebElement> columns = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
            int col_count = columns.size();
            System.out.println("Table column count is " + col_count);

            // Close the browser
            driver.quit();
        }
    }

