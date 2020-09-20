@sanity
Feature: To validate the FB page

  Scenario: To validate login with invalid credintials
    Given The user in the FB page
    When The user enter the userName and passWord details
      | vaiya | puri | suga |
      |   123 |  321 |  456 |
    And The user click the login button
    Then The user navigate to next page
