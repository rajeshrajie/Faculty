Feature: Technologies
  Background: open browser and load url
    Given browser is opened
    And username is entered as "capstone" and password is entered as "123456"
    And dashboard page should appear

  Scenario:Create a new technology
    When navigate to technologies page
    Then page title should be "Technologies"
    When technology name is entered as "Flask" and click on submit
    Then new technology should be created in departments table as "Flask"
    When exit the application