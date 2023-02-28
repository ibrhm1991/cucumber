Feature: Add new user dialog

  Scenario: Placeholder test
    Given I am on the login page
    And I log in using following credentials:
    |email   | librarian21@libray|
    |password| aZ849tSZ          |
    When I click on Add Users
     Then dilaog fields must have matching placeholder
       |fullname  | Fullname|
       |email     | Email   |
       |password  | Password|

