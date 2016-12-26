package pages;


import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BasePage extends AccountData{

    public String baseURL = "http://pstaging.datastormcloud.net";
    public String baseTitle = "FF Cloud :: ";


    public void getSystemProperty() {
        System.setProperty("webdriver.chrome.driver", "C:\\Progs\\chromedriver_win32\\chromedriver.exe");

        //Doesn't matter chrome or Chrome as this is case insensitive.
        System.setProperty("selenide.browser", "Chrome");
        System.setProperty("selenide.timeouts", "6000");
    }

    public void pageRefresh(){
        getWebDriver().navigate().refresh();
    }
}

