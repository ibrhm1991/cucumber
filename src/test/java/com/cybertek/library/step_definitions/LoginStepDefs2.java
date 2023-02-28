package com.cybertek.library.step_definitions;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs2 {

    @When("I enter username {string}")
    public void i_enter_username(String username) {
        System.out.println(username);
    }

    @When("I enter password {string}")
    public void i_enter_password(String password) {
        System.out.println(password);
    }

    @When("click the  sign in button")
    public void click_the_sign_in_button() {
        System.out.println("clicking on sign");
    }
    @Then("there should be {int} users")
    public void there_should_be_users(int count) {
        System.out.println("Verifying user count "+ count);
    }

    @When("I login using {string} and {string}")
    public void i_login_using_and(String username, String password) {
        System.out.println("Loging in suing: "+ username+" and "+" pasword: "+password);

    }
}
