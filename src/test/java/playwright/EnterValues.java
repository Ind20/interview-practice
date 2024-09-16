package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class EnterValues {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        // find input filds and send text
        page.navigate("https://pdbhutia.github.io/pagesforautomation/loginpage.html");
        page.locator("//input[@class='Username']").type("indresh");
        page.fill("//input[@class='email']", "indresh.maurya@gmail.com");
        page.locator("//input[@class='pw']").type("ind20");
        Thread.sleep(2000);
        page.locator("//button[@class='btn']").click();



        Thread.sleep(5000);
        page.close();
        browser.close();
        playwright.close();

    }
}
