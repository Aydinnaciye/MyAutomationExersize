@register_user
Feature: Register_User_Functionality

  Scenario: TC01_register_user
    When user launches the browser
    And user navigates to home page
    Then user verifies home page is visible
    Then user clicks signup_button
    Then user verifies new user signup is visible

  Scenario: TC01_signup_user
    When user enters name and email
    And user clicks signup_login button
    And user clicks signup_button
    And user verifies that enter account information is visible
    And user fills details
    And user selects checkbox signup for our newsletter
   And user selects checkbox receive special offers
   And user fills details2And user clicks create account button
   Then user verifies that account is created

  Scenario: TC01_delete_account
    When user clicks continue button
    And user verifies that logged in
    And user clicks delete account button
    Then user verifies that account deleted

