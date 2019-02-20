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
  Scenario: Incorrect Search Functionality

    Given User is in workspace
    When User click the SKIP button to skip the profile
    And User click the Search text box and enter search term with typo error
    And User click the Search button
    Then User should get the warning message says 'did you mean'

  @a
  Scenario: Curriculum Search

    Given User is in workspace
    When User click the SKIP button to skip the profile
    And User click the Explore our resources and Dashboard link
    And User click the Token Login link
    And User enter Token login id
    And User click the Submit button
    And User click the Explore our resources and Home link
    And User click the Search text box and enter search term 'Fractions'
    And User select the Curriculum Objective in the drop down
    Then User can see the Curriculum search page

  @s
  Scenario: Create Token account and Create Folder or LP

    Given User is in workspace
    When User click the SKIP button to skip the profile
    And User click the Explore our resources and Dashboard link
    And User click the Create a token account button and enter username and submit
    Then User can see the Flash message shows account created
    When User click the Workspace to create a Folder or LP
    When User enter Folder name or LP name and click create button
    Then User can see the Flash message shows Folder or LP created
    And User can see the Folder or LP in the Workspace


