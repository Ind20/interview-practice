package playwright;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Basics {

    public static void main(String[] args) throws InterruptedException {
        Playwright playwright = Playwright.create();

        //use chromium browser and set head mode
        Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

        //use firefox browser and set head mode
        //Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));

        //use webkit browser and set head mode
        //Browser browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));

        //Launch the browser
        Page page = browser.newPage();

        //navigate to a page
        page.navigate("https://pdbhutia.github.io/pagesforautomation/");

        //click on element
        page.locator("//a[@class='loginLink']").click();
        Thread.sleep(5000);

        //Assert the page title
        String pageTitle = page.title();
        System.out.println("Page Title :" +pageTitle);
        assertThat(page).hasTitle(pageTitle);

        //close everything
        page.close();
        browser.close();
        playwright.close();
    }

}
