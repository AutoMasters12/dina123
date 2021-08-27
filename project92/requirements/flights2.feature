@fun
Feature: Flights functionlaity

  @smoke
  Scenario: perform search flight with vlaid credentials
    Given user should be in search flights page
    When user enter valid fields and submit
    Then user should navigate to list of flights page

  @smoke
  Scenario: perform search flight with invlaid credentials
    Given user should be in search flights page
    When user enter invalid fields and submit
    Then user should get error msg
