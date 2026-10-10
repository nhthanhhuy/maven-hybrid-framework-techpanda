package testcases.liveTechPanda;

import core.BaseTest;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HomePage_000_CheckEnvironment extends BaseTest {

    @Epic("Employee management")

    public class Employee_01_NewEmployee extends BaseTest {

        private WebDriver driver;
        private String homePageTitle;


        @Parameters({"browser", "url"})
        @BeforeClass
        public void beforeClass(String browserName, String appURL) {

            driver = getBrowserDriver(browserName, appURL);

        }

        @Test
        @Story("Launching Home Page")
        @Description("Access homepage")
        public void LoginToDashBoard_01() {

            homePageTitle = driver.getTitle();
            verifyEquals(homePageTitle, "Home page");
            verifyTrue(false);

        }


        @AfterClass
        public void afterClass() {
            driver.quit();
        }
    }
}
