package org.cb.ta.TestSteps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.cb.ta.BaseTest;
import org.cb.ta.DropDownCheckBoxRadioBtnsPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;

public class DropDownTest extends BaseTest {
    DropDownCheckBoxRadioBtnsPage dropDownCheckBoxRadioBtnsPage;

    @Given("User is on drop down page")
    public void userIsOnDropDownPage() {
        SoftAssert sa = new SoftAssert();

        this.dropDownCheckBoxRadioBtnsPage = new DropDownCheckBoxRadioBtnsPage(driver);
        Assert.assertNotNull(this.dropDownCheckBoxRadioBtnsPage);
        Assert.assertEquals("java", dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("java", 1).getAttribute("value"));
        Assert.assertEquals("eclipse", dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("eclipse", 2).getAttribute("value"));
        sa.assertEquals("html", dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("html", 3).getAttribute("value"),"Failed");
    }

    @When("Select one of the programming language from the first drop down menu")
    public void selectOneOfTheProgrammingLanguageFromTheFirstDropDownMenu() {
        WebElement selectedOption = dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("python", 1);
        assertEquals(selectedOption.getAttribute("value"), "python");
    }

    @And("Select one of the  tool from the second drop down menu")
    public void selectOneOfTheToolFromTheSecondDropDownMenu() {
        WebElement selectedOption = dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("junit",2);
        assertEquals(selectedOption.getAttribute("value"), "junit");
    }

    @And("Select one of the  webpage tool from the third drop down menu")
    public void selectOneOfTheWebpageToolFromTheThirdDropDownMenu() {
        WebElement selectedOption = dropDownCheckBoxRadioBtnsPage.selectAnOptionFromDropDownMenu("css",3);
        assertEquals(selectedOption.getAttribute("value"), "css");
    }

    @Then("User selects {int} drop down menu items")
    public void userSelectsDropDownMenuItems(int arg0) {
    }
}
