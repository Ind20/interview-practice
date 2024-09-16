package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabs {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.switchTo().newWindow(WindowType.WINDOW);
//        driver.get("https://www.google.com/");
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.open()");
//        js.executeScript("window.open()");
//        js.executeScript("window.open()");
//        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(2));
//        driver.get("https://www.google.com/intl/en-US/gmail/about/");
    }
}
