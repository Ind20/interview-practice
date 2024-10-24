package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        WebElement ele = driver.findElement(By.xpath("(//input[@aria-label=\"I'm Feeling Lucky\"])[2]"));
        ele.click();
        driver.navigate().back();
        driver.navigate().refresh();
        try{
            //driver.close(); // will result in NoSuchSessionException
            //WebElement ele1 = driver.findElement(By.xpath("(//input[@aria-label=\"I'm Feeling Lucky\"])[2]"));
            ele.click();
            System.out.println("element clicked");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Exception caught");
        }

    }
}
