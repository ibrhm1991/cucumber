package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import io.cucumber.java.en.Then;

public class DashBoardStepDefs {
    LoginPage loginPage=new LoginPage();
    @Then("user name should be {string}")
    public void user_name_should_be(String string) {

    }
}
