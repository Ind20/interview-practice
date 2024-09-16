package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

public class TestUrl {
    static WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--headless"));
    public static void main(String[] args) throws IOException {
        driver.get("https://www.google.com/");
        try {
            List<WebElement> elements = driver.findElements(By.xpath("//a"));
            System.out.println(elements.size());

            for(WebElement e:elements) {
                String link = e.getAttribute("href");
                System.out.println((((HttpURLConnection) new URL(link)
                        .openConnection()).getResponseCode() == 200 ? link + ": OK" : link + ": Broken"));
            }
        }catch(NoSuchElementException e){
            e.printStackTrace();
        }
        driver.close();
    }
}
