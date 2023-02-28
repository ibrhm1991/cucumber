package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class LoginStepDefs {
    LoginPage loginPage=new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Going to the login page");
       String url= ConfigurationReader.getProperty("url");
       Driver.getDriver().get(url);
    }



    @When("I login as admin user")
    public void i_login_as_admin_user() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logging in as a librarian");
    }
    @When("I login a Student")
    public void i_login_a_Student() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logging in as a Student");
        String email=ConfigurationReader.getProperty("librarian_email");
        String password=ConfigurationReader.getProperty("librarian_password");

        loginPage.login(email,password);
    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Verifying dashboard page");
    }
    @When("I login a admin")
    public void i_login_a_admin() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Login as a admin");
    }

    @Given("I log in using following credentials:")
    public void i_log_in_using_following_credentials(Map<String ,String> credentials) {
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        System.out.println(credentials);
        String email=credentials.get("email");
        String password=credentials.get("password");

    }





}
