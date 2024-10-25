Feature: Web order app login
  As a user
  I should be able to login to web order app

  Scenario: User can login successfully
    Given we are at the web order login page
    When we provide valid credentials
    Then we should see the all orders page