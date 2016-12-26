package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertEquals;

public class LoginPage extends BasePage{

//    LoginPage locators and labels:

    public String loginPageURL = baseURL + "/login";
    public String loginPageTitle = baseTitle + "login";
    public WebElement loginPageMainLabel = $(By.xpath(".//*[@id='login-form']/h2"));
    public String loginPageMainLabelText = "Please sign in";

//    LoginField:
    public WebElement loginPageEmailAddressLabel = $(By.xpath(".//*[@id='login-form']/div[1]/label"));
    public String loginPageEmailAddressLabelText = "Email address";
    public WebElement loginPageLoginField = $(By.xpath(".//*[@name='email']"));
    public String loginPageLoginFieldPlaceholder = "Email address";

//    WrongLoginPasswordLabel:
//    public WebElement loginPageWrongLoginPasswordLabel = $(By.xpath(".//*[@id='content']/div/div[2]/form/div[1]/span"));
//    public String loginPageWrongLoginPasswordLabelText = "Неверный e-mail или пароль";

//    PasswordField:
    public WebElement loginPagePasswordFieldLabel = $(By.xpath(".//*[@id='login-form']/div[2]/label"));
    public String loginPagePasswordFieldLabelText = "Password";
    public WebElement loginPagePasswordField = $(By.xpath(".//*[@name='password']"));
    public String loginPagePasswordFieldPlaceholder = "Password";

//    SignInButton:
    public WebElement loginPageSignInButton = $(By.xpath(".//*[@id='login-form']/button"));
    public String loginPageSignInButtonText = "Sign in";

//    RegistrationLink:
    public WebElement loginPageRegistrationLink = $(By.xpath(".//*[@href='/registration/']"));
    public String loginPageRegistrationLinkText = "Registration";

//    ForgotYourPasswordLink:
    public WebElement loginPageForgotYourPasswordLink = $(By.xpath(".//*[@href='/remind-password/']"));
    public String loginPageForgotYourPasswordLinkText = "Forgot   your password?";

//    LoginPage methods:

    public void goToLoginPage(){
        getSystemProperty();
        open(loginPageURL);
    }
//    public AdminPage loginAsAdmin(){
//        $(loginPageLoginField).setValue(adminLogin);
//        $(loginPagePasswordField).setValue(adminPassword);
//        $(loginPageEnterButton).click();
//        return new AdminPage();
//    }
//    public MainManagerPage loginAsMainManager(){
//        $(loginPageLoginField).clear();
//        $(loginPageLoginField).setValue(mainManagerLogin);
//        $(loginPagePasswordField).clear();
//        $(loginPagePasswordField).setValue(mainManagerPassword);
//        $(loginPageEnterButton).click();
//        return new MainManagerPage();
//    }
//    public ManagerPage loginAsManager(){
//        $(loginPageLoginField).setValue(managerLogin);
//        $(loginPagePasswordField).setValue(managerPassword);
//        $(loginPageEnterButton).click();
//        return new ManagerPage();
//    }

    public RegistrationPage clickOnRegistrationLink() {
        loginPageRegistrationLink.click();
        return new RegistrationPage();
    }

    public RemindPasswordPage clickOnForgotYourPasswordLink() {
        loginPageForgotYourPasswordLink.click();
        return new RemindPasswordPage();
    }

    public void clickOnSignInButton() {
        loginPageSignInButton.click();
    }

//    Checks of elements:

    public void checkLoginPageTitle(){
        assertEquals(title(),loginPageTitle);
    }
    public void checkLoginPageUrl(){
        assertEquals(url(), loginPageURL);
    }

    public void checkLoginPageMainLabel(){
        $(loginPageMainLabel).shouldBe(visible).shouldHave(text(loginPageMainLabelText));
    }

    public void checkLoginPageEmailAddressLabel(){
        $(loginPageEmailAddressLabel).shouldBe(visible).shouldHave(text(loginPageEmailAddressLabelText));
    }

    public void checkLoginPageLoginField(){
        $(loginPageLoginField).shouldBe(visible).shouldBe(empty);
        assertEquals(loginPageLoginField.getAttribute("placeholder"), loginPageLoginFieldPlaceholder);
    }
//    public void checkLoginPageWrongLoginPasswordLabel(){
//        $(loginPageWrongLoginPasswordLabel).shouldBe(visible).shouldHave(text(loginPageWrongLoginPasswordLabelText));
//    }

    public void checkLoginPagePasswordField(){
        $(loginPagePasswordField).shouldBe(visible).shouldBe(empty);
        assertEquals(loginPagePasswordField.getAttribute("placeholder"), loginPagePasswordFieldPlaceholder);
    }

    public void checkLoginPageSignInButton(){
        $(loginPageSignInButton).shouldBe(visible).shouldHave(text(loginPageSignInButtonText));
    }

    public void checkLoginPageRegistrationLink(){
        $(loginPageRegistrationLink).shouldBe(visible).shouldHave(text(loginPageRegistrationLinkText));
    }

    public void checkLoginPageForgotYourPasswordLink(){
        $(loginPageForgotYourPasswordLink).shouldBe(visible).shouldHave(text(loginPageForgotYourPasswordLinkText));
    }


    }
