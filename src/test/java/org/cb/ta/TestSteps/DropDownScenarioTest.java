package org.cb.ta.TestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertTrue;


public class DropDownScenarioTest {
    @Given("User is on drop down page")
    public void userIsOnDropDownPage() {
        System.out.println("Test1 Run Oleeyyyyyy");
    }

    @When("Select one of the programming language from the first drop down menu")
    public void selectOneOfTheProgrammingLanguageFromTheFirstDropDownMenu() {
        assertTrue(true);
    }

    @And("Select one of the  tool from the second drop down menu")
    public void selectOneOfTheToolFromTheSecondDropDownMenu() {
        assertTrue(true);
    }

    @And("Select one of the  webpage tool from the third drop down menu")
    public void selectOneOfTheWebpageToolFromTheThirdDropDownMenu() {
        assertTrue(true);
    }

    @Then("User selects {int} drop down menu items")
    public void userSelectsDropDownMenuItems(int arg0) {
        assertTrue(true);
    }

}
