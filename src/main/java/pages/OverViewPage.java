package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class OverViewPage extends BasePage{

//    OverViewPage locators and labels:

    public String overViewPageURL = baseURL + "/overview";
    public String overViewPageTitle = baseTitle + "overview";





//    Checks of elements:

    public void checkOverViewPageTitle(){
        assertEquals(title(),overViewPageTitle);
    }
    public void checkOverViewPageUrl(){
        assertEquals(url(), overViewPageURL);
    }

}
