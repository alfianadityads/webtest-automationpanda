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

  @Negative
  Scenario: Send message without fill email field
    When User Fill all filed but without fill email field
    Then User see error message