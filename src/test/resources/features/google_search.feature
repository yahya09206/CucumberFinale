@ui
Feature: Google search page

  As a user,
  I should be able to search by keyword
  and get my result

  @wip
  Scenario: User searches by keyword
    Given user is at the homepage
    When user searches for keyword "selenium"
    Then we should see the results page
    And and the title should start with "selenium"