@sanity1
Feature: To validate the FB page

  Scenario: To validate login with  credintials
    Given The user in  FB page
    When The user enter the usename and pass details
      | vaiya | 123|
       
    And The user is click the login button
    Then The user is navigate to next page
