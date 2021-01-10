package org.cb.ta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropDownCheckBoxRadioBtnsPage {

  private final WebDriver driver;
  private WebElement dropDownMenu;
//  private final WebElement dropDownMenu1;
//  private final WebElement dropDownMenu2;
//  private final WebElement dropDownMenu3;
  private final List<WebElement> checkBoxes;
  private final List<WebElement> radioBtns;

  private final String xpathForDropMenus = "//select[@id='dropdowm-menu-";

  public DropDownCheckBoxRadioBtnsPage(WebDriver driver) {
    this.driver = driver;
    driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");

//    this.dropDownMenu1 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
//    this.dropDownMenu2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
//    this.dropDownMenu3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
    this.checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
    this.radioBtns = driver.findElements(By.xpath("//*[@id='radio-buttons']/input[@type='radio']"));
  }

  public WebElement selectAnOptionFromDropDownMenu(String optionName, int indexOfMenu) {
    Select dropDownMenuSelectObj = null;

//    StringBuilder xpath = new StringBuilder(this.xpathForDropMenus);

//    switch (indexOfMenu){
//      case 1 :
//          xpath.append("1']");
//          break;
//      case 2 :
//          xpath.append("2']");
//          break;
//      case 3 :
//          xpath.append("3']");
//          break;
//    }
//    this.dropDownMenu = driver.findElement(By.xpath(String.valueOf(xpath)));

    this.dropDownMenu = driver.findElement(By.xpath(this.xpathForDropMenus.concat(String.valueOf(indexOfMenu)).concat("']")));

    dropDownMenuSelectObj = new Select(dropDownMenu);

    dropDownMenuSelectObj.selectByValue(optionName);
    return dropDownMenuSelectObj.getFirstSelectedOption();

  }

  public List<WebElement> selectACheckBox() {
    return checkBoxes;
  }
  public List<WebElement> getRadioBtns() {
    return radioBtns;
  }

}
