
@tag
Feature: search

  @tag1
  Scenario: arts dropdown validation
    Given open chrome  and enter ebay url
    When user selects arts from the search dropdown
    And clicks on search
    Then validate the arts text

 