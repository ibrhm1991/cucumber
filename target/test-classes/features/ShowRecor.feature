Feature:Show records functionality

  Background:
    Given I am on the login page


    Scenario: Verifying default values in Users page
#      When I click on "Users" link
#   Then show records default value should be 10
      And show records should have following options:
      |5   |
      |10  |
      |15  |
      |50  |
      |500 |


