package steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import pages.LoginPage;
import pages.OverViewPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MySteps {

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





//    STEPS FOR OVERVIEW PAGE:
    OverViewPage overViewPage = new OverViewPage();

    @Then("I can enter to overViewPage")
    public void thenICanEnterOverViewPage(){
        overViewPage.checkOverViewPageTitle();
//        overViewPage.checkOverViewPageUrl();
    }

}
