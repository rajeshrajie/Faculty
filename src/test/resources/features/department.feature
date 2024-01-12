Feature: Departments
  Background: open browser and load url
    Given browser is opened
    When username is entered as "capstone" and password is entered as "123456"
    Then dashboard page should appear

  Scenario: create a new department
    When navigate to departments page
    Then page title should be "Departments"
    When department name is entered as "web development" ans click on submit
    Then new department should be created in departments table as "web development"
    When exit the application
