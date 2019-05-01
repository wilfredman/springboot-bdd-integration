@Login
Feature: As a Client Portal user, I want to use my login information to access the secure MIM Client Portal.

  Scenario: Login to MIM Client Portal
    Given the user has login credentials
      And setup clean & fresh test data
    When they input their credentials
      And select "Sign In"
    Then they will be given access to the client portal
    Then they will be brought to the MIM Institutional home page
    Then cleanup demo test data

