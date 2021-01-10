package org.cb.ta.TestSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;

public class CheckBoxTest1 {
    @Given("User opens checkboxes page")
    public void user_opens_checkboxes_page() {
        assertTrue(true);
    }

    @When("User selects checkbox with Option one")
    public void user_selects_checkbox_with_option_one() {
        assertTrue(true);
    }

    @Then("Test if option one checkbox is selected")
    public void testIfOptionOneCheckboxIsSelected() {
    }

    @Given("Option one checkbox is selected")
    public void option_one_checkbox_is_selected() {
        assertTrue(true);
    }

    @When("User unselects checkbox with Option one")
    public void user_unselects_checkbox_with_option_one() {
        assertTrue(true);
    }

    @Then("Option one checkbox is unselected")
    public void option_one_checkbox_is_unselected() {
        assertTrue(true);
    }
}
