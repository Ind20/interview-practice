package selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        Cookie cookie = new Cookie("key", "value");
        driver.manage().addCookie(cookie);
        driver.get("https://www.google.co.in/imghp?hl=en&ogbl");

    }
}

