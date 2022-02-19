package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
        loginPage.signInButton.click();
    }
    @Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String userName, String passWord) {
        loginPage.loginBox.sendKeys(userName);
        loginPage.passwordBox.sendKeys(passWord);
        loginPage.submit.click();
        Driver.get().get("http://zero.webappsecurity.com/bank/account-summary.html");
    }
    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {

    }

}