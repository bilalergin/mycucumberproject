@contact_us
Feature: contact_us
  Scenario: contact_us_form
    Given user launches the browser
    When user navigates to URL
    Then user verifies that home page is visible successfully
    When user clicks on Contact Us button
    And user verifies Get In Touch is visible
    And user enters name, email, subject and message
    And user uploads file
    And user  clicks Submit button
    And user clicks OK button
    Then user verifies success message Success Your details have been submitted successfully is visible
    And user clicks on home button and verifies that landed home page successfully
    Then close the application