@reg1
Feature: User is validate login functionality

  Scenario Outline: To verify username and password
    Given User in fb page
    When User to send "<username>" and "<password>"
    Then User click login buttn

    Examples: 
      | username | password |
      | vaiay    |      123 |
      | puri     |      321 |
      | sakthi   |      213 |
