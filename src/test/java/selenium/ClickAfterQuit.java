package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAfterQuit{
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[text()='About']")).click();
        Thread.sleep(3000);
        driver.close();
        driver.findElement(By.xpath("//*[text()='About']"));
    }
}
