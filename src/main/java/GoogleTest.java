import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleTest {

    static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        System.out.println("My First Page is:" +driver.getTitle());
        Thread.sleep(5000);
        driver.navigate().to("https://www.saucedemo.com/");
        System.out.println("My Second Page is:"+driver.getTitle());
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        Dimension size=driver.manage().window().getSize();
        System.out.println("Width of the window is:"+size.getWidth());
        System.out.println("Height of the window is:"+size.getHeight());
        Thread.sleep(5000);
        driver.manage().window().setSize(new Dimension(1200,1000));
        Thread.sleep(5000);

        //Switch to new window
        driver.switchTo().newWindow(WindowType.TAB);
        Thread.sleep(5000);
        driver.get("https://www.saucedemo.com");
        Thread.sleep(5000);
        //Maximise, minimize and FullScreen
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.manage().window().minimize();
        Thread.sleep(5000);
        driver.manage().window().fullscreen();
        Thread.sleep(5000);
        driver.close(); //close current browser window
        driver.quit();// close all the browser window

    }
}