package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

public class AddUserStepDep {

    @When("I click on Add Users")
    public void i_click_on_Add_Users() {
       LoginPage loginpage= new LoginPage();
       loginpage.addUsers.click();
    }
    @Then("dilaog fields must have matching placeholder")
    public void dilaog_fields_must_have_matching_placeholder(Map<String,String> fields) {
        fields.get("fullname");
        fields.get("email");
        fields.get("password");


    }



}
