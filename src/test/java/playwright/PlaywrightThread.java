package playwright;

import com.microsoft.playwright.*;
import static java.util.Arrays.asList;

public class PlaywrightThread extends Thread {
    private final String browserName;

    private PlaywrightThread(String browserName) {
        this.browserName = browserName;
    }

    public static void main(String[] args) throws InterruptedException {
        for (String browserName: asList("chromium", "webkit", "firefox")) {
            Thread thread = new PlaywrightThread(browserName);
            thread.start();

        }
    }

    @Override
    public void run() {
        try (Playwright playwright = Playwright.create()) {
            BrowserType browserType = getBrowserType(playwright, browserName);
            Browser browser = browserType.launch();
            Page page = browser.newPage();
            page.navigate("https://playwright.dev/");
            System.out.println(page.title());
        }
    }

    private static BrowserType getBrowserType(Playwright playwright, String browserName) {
        switch (browserName) {
            case "chromium":
                return playwright.chromium();
            case "webkit":
                return playwright.webkit();
            case "firefox":
                return playwright.firefox();
            default:
                throw new IllegalArgumentException();
        }
    }
}