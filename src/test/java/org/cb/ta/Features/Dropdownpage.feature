Feature: DropDownPage
  Scenario: Test Select An Option From Drop Down Menu
    Given User is on drop down page
    When Select one of the programming language from the first drop down menu
    And Select one of the  tool from the second drop down menu
    And Select one of the  webpage tool from the third drop down menu
    Then User selects 3 drop down menu items

  Scenario: Test Check Boxes
    Given User is on Check Boxes page
    When Select only one of the option from the check box menu And Disable other three check boxes
    And Uncheck selected checkbox And enable all check boxes
    And Select only one of the option from the check box menu And Disable other three check boxes
    Then User selects only one check box from check boxes

    

