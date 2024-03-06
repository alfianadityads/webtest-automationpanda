Feature: Go to contact page

  As an user, I can go to contact page this website

  Background:
    Given User is on home page
    And User click contact page button
    And User already on contact page

  @Positive
  Scenario: Fill all field with valid contents
    When User provide all valid data
    Then User see success message