Feature: Google Login and Logout Functionality

  @Login
  Scenario: User logs in with correct credentials
    Given User is on Google homepage
    When User clicks on the Gmail link
    And User logs in with correct credentials
    Then User should be logged in successfully

  @Logout
  Scenario: User logs out from the account
    Given User is logged in to the account
    When User clicks on the profile icon
    And User clicks on the logout button
    Then User should be logged out successfully