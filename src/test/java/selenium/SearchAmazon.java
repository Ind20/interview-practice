package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class SearchAmazon {

    // opnen chrome browser
    // go to amazon
    // search iphone 15 pro
    // go to pagination 2
    // assert pagination 2
    // open result number 1 product details page

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 15 pro");

        Thread.sleep(1000);

        driver.findElement(By.xpath("(//div[@class='s-suggestion s-suggestion-ellipsis-direction'])[1]")).click();


        driver.findElement(By.xpath("//a[@aria-label='Go to next page, page 2']")).click();

        Thread.sleep(2000);


        String pagination = driver.findElement(By.xpath("//span[@class='s-pagination-item s-pagination-selected']")).getText();
        System.out.println("current page :"+pagination);
        Assert.assertEquals(pagination, "2", "Correct page is not selected");


        driver.findElement(By.xpath("(//h2[contains(@class, 'a-size-mini')])[1]/a")).click();

        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));


    }
}
