Feature: Login
  Background: open browser and load url
    Given browser is opened

  Scenario: login with valid username and password
    When username is entered as "capstone" and password is entered as "123456"
    Then dashboard page should appear
    Then exit the application