Feature: Login with parameters

   Background:
     Given I am on the login page

  Scenario: Login as librarian 11

    When I enter username "librarian11@library"
    And I enter password "I61FFPPf"
    And click the  sign in button
    Then dashboard should be displayed
    And there should be 23 users


  Scenario: Login as librarian same line

    When I login using "librarian11@library" and "I61FFPPf"
    Then dashboard should be displayed
