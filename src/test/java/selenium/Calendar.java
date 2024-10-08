package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

    public static void main(String[] args) throws InterruptedException {

       // System.setProperty("webdriver.chrome.driver", "/Users/Asus/javaprojects/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();


        System.out.println("Test Completed Successfully");
    }

}