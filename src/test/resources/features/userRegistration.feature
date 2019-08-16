Feature: As an IMDb user
  I want to create account on IMDb site
  So that i can login to the application

  Scenario Outline: Registration in IMDb website
    Given I am on IMDB home page
    When I click Other Sign in options
    And I click Create a New Account
    And I enter name in First Name textbox
    And I enter email in Email textbox
    And I enter Password in password textbox
    And I enter password again in Re-enter password textbox
    And I click Create your IMDb account button
    Then I should get logged in to my account
    And I log out of the application

    Examples:
      | TestDataRowNumber |
      | 1                 |
      | 2                 |
      | 3                 |
      | 4                 |
