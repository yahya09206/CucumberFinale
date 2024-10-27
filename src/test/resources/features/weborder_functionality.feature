@ui2
Feature: WebOrder app is working as expected

  @wip3
  Scenario: User should see all of the products from the list according to availability
    Given we are at the web order login page
    And we provide valid credentials
    When we select "Order" tab from sidebar
    Then we should see below options in Product dropdown list
      | MyMoney     |
      | FamilyAlbum |
      | ScreenSaver |