package FF.Cloud;

import FF.Cloud.steps.MySteps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPageSteps extends MySteps {

    //    STEPS FOR LOGIN PAGE:
    LoginPage loginPage = new LoginPage();
    @Given("As user being on loginPage")
    public void givenAsUserBeingOnLoginPage(){
        loginPage.goToLoginPage();
    }

    @When("I type valid login and password")
    public void whenITypeValidLoginAndPassword(){
        $(loginPage.loginPageLoginField).setValue(loginPage.userLogin);
        $(loginPage.loginPagePasswordField).setValue(loginPage.userPassword);
    }

    @When("I click on SignInButton")
    public void whenIClickOnSignInButton() {
        loginPage.clickOnSignInButton();
    }

    @Then("I can enter to overViewPage")
    public void thenICanEnterOverViewPage(){

        loginPage.checkLoginPageTitle();
        loginPage.checkLoginPageUrl();
    }



}
