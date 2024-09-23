package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class TestCGI {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");

        List<WebElement> elements = driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[3]"));

        List<String> countries = new ArrayList<>();

        for(WebElement ele:elements){
            countries.add(ele.getText());
        }

        System.out.println(countries);

        Assert.assertTrue(isSorted(countries), "countries are not sorted");

        driver.quit();
    }

    static boolean isSorted(List<String> list){

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return false;
            }
        }
        return true;
    }

}
