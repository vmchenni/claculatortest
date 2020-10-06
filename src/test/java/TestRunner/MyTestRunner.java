package TestRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyTestRunner {
    public static void main(String[] args){
        System.out.println("Hello World!");
//        System.setProperty("webdriver.chrome.driver","ChromeDriver/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
        if(driver.findElement(By.xpath("//h1[contains(text(),'Demo Calculator')]")).isDisplayed()){
            System.out.println("Home page is displayed");
        }

    }
}
