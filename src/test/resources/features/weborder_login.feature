@ui
Feature: Web order app login
  As a user
  I should be able to login to web order app

  #This is where repeating code can go
  Background:
    Given we are at the web order login page

  Scenario: User can login successfully
    #Given we are at the web order login page
    When we provide valid credentials
    Then we should see the all orders page

  Scenario: User login fails
    When we provide invalid credentials
    Then we should still be at the login page
    And login error message should be present

    #Whatever is enclosed inside of parenthesis will be sent as a parameter value
  Scenario: User logs in with specific credentials
    When user provides username "Tester" and password "test"
    Then we should see the all orders page

  Scenario: User logs in with the wrong credentials
    When user provides username "bla" and password "bla"
    Then we should still be at the login page
    And login error message should be present

  Scenario: Login to weborder app by providing username and password in 2 column table
    When we provide below credentials
      | username | Tester |
      | password | test   |
    Then we should see the all orders page
