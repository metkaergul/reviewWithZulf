package week1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTask {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        driver.navigate().to("https://www.ebay.com");


        //go back  to google page
        driver.navigate().back();

        //go to e bay on e more time
        driver.navigate().forward();

        driver.navigate().refresh();

        //get the title of the current page
        System.out.println(driver.getTitle());


    }
}
