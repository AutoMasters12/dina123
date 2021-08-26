@fun
Feature: login functionality

  @reg
  Scenario Outline: login to app
    Given user should be in login page of app
    When user should enter creds "<userid>" and "<pswd>" to submit
    Then user should navigate to welcome page

    Examples: 
      | userid | pswd |
      | usr01  | ps01 |
      | osr02  | ps02 |
      | osr03  | ps03 |
      | osr04  | ps04 |
