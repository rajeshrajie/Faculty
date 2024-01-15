Feature: Login
  Background: open browser and load url
    Given browser is opened

  Scenario Outline: data driven test for login
    When username is entered as <uname> and password is entered as <pword>
    Then dashboard page should appear
    Then exit the application
    Examples:
      | uname  | pword |
      |"cap"     |"123"    |
      |"capstone"|"2345"   |
      |"stone"   |"123456" |
      |"capstone"|"123456" |
