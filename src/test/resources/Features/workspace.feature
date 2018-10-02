@regression
Feature: Workspace Login


  @smoke
  Scenario: Login with Existing Token login

Given User is in workspace
  When User click the SKIP button to skip the profile
  And User click the Explore our resources and Dashboard link
  And User click the Token Login link
  And User enter Token login id
  And User click the Submit button
  Then User enter in to workspace with Log out button


  @sanity
  Scenario: Common Search Functionality

    Given User is in workspace
    When User click the SKIP button to skip the profile
    And User click the Search text box and enter search term with typo error
    And User click the Search button
    Then User should get the warning message says 'did you mean'