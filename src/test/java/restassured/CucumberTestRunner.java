package restassured;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

@CucumberOptions(tags = "@Test1", features = {"src/test/java/restassuredbdd/Test.feature"}, glue = {""},
        plugin = { "pretty", "html:target/reports/cucumber-report.html" },
        monochrome = true)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {

        static ExtentReports extent;
        static ExtentHtmlReporter htmlReporter;

        @BeforeClass
        public static void setup() {
            htmlReporter = new ExtentHtmlReporter("extent-report.html");
            htmlReporter.config().setDocumentTitle("Cucumber Extent Report");
            htmlReporter.config().setReportName("Cucumber Test Report");
            htmlReporter.config().setTheme(Theme.STANDARD);
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);
            extent.setSystemInfo("OS", System.getProperty("os.name"));
            extent.setSystemInfo("Java Version", System.getProperty("java.version"));
        }

        @AfterClass
        public static void teardown() {
            extent.flush();
        }

}

