package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HandleTabs {
    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();

        page.navigate("https://pdbhutia.github.io/pagesforautomation");
        Thread.sleep(3000);
        Page newTab = page.waitForPopup(() -> {
            page.locator("//a[text()='Login Page']").click();
        });
        newTab.waitForLoadState();
        Thread.sleep(3000);
        System.out.println("New Tab URL: " + newTab.url());
        System.out.println("New Tab Title: " + newTab.title());


        page.close();
        browser.close();
        playwright.close();
    }
}
