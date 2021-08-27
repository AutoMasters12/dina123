@fun
Feature: Flights functionlaity

  # sampletest cases
  @smoke
  Scenario: perform search flight with vlaid credentials
    Given user should be in search flights page
    When user enter valid fields and submit
    Then user should navigate to list of flights page

