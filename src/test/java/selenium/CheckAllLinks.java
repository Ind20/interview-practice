package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class CheckAllLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        List<WebElement> elements = driver.findElements(By.xpath("//a"));
        for(WebElement e:elements){
            String url = e.getAttribute("href");
            System.out.println(((HttpURLConnection) new URL(url).openConnection()).getResponseCode() == 200 ? url+" : OK": url+" : Broken");
        }
        driver.quit();
    }
}
