package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Select {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://pdbhutia.github.io/pagesforautomation");
        Thread.sleep(5000);
        page.selectOption("//select[@name='From']","Mumbai");
        Thread.sleep(5000);
        page.selectOption("//select[@name='To']","Kolkatta");
        Thread.sleep(5000);
        page.selectOption("//select[@name='passengers']","2");
        Thread.sleep(5000);
        page.fill("//input[@class='date']","2023-12-25");
        Thread.sleep(5000);



        page.close();
        browser.close();
        playwright.close();
    }
}
