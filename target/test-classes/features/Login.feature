@Smoke @login @login-1
Feature: Login
  As a user, I should be able to login
  Scenario: Login as an librarian
    Given I am on the login page
    When I login as admin user
    Then dashboard should be displayed

    #This is a comment
  @librarian
  Scenario: Login as a Student
    Given I am on the login page
    When I login a Student
    Then dashboard should be displayed
     @admin
  Scenario: Login as a admin
    Given I am on the login page
    When I login a admin
    Then dashboard should be displayed
