Feature: Online Banking Login Feature
  @wip
  Scenario: Authorized users should be able to login to the application
    Given the user is on the login page
    And User logins with username "username" and password "password"
    Then the "Account Summary" page should be displayed