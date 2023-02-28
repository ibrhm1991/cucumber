package com.cybertek.library.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class RecordsStepDef {
    @When("I click on {string} link")
    public void i_click_on_link(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("show records default value should be {int}")
    public void show_records_default_value_should_be(Integer int1) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List<String> options) {
        System.out.println("option.size()="+options.size());
        System.out.println(options);

    }


}
