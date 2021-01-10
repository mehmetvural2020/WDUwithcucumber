Feature: CheckBox
  Scenario: Test selecting checkbox
    Given User opens checkboxes page
    When User selects checkbox with Option one
    Then Test if option one checkbox is selected

  Scenario: Test unselecting checkbox
    Given Option one checkbox is selected
    When User unselects checkbox with Option one
    Then Option one checkbox is unselected
