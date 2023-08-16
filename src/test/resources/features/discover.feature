@run
Feature: Validation of APR for Cash Advances

  Scenario: As a user I should be able to verify that APR for Cash Advances is greater than 20%
    Given User navigates to Discover HomePage
    When user clicks on the “Credit Cards” icon
    And user clicks “Apply Now” for card type: Secured Credit Card
    Then user skips the pre-fill step
    And user verifies that the APR for Cash Advances is greater than 20%
