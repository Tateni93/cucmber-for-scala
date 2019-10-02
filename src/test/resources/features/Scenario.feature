@test

Feature: Example

  Scenario: Navigate to a url
    When I go to https://www.google.com
    And I type Hello World in q
    Then I click btnK