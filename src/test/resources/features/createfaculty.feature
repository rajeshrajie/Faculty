Feature: Create Faculty
  Background: open browser and load urls
    Given browser is opened
    When username is entered as "capstone" and password is entered as "123456"
    Then dashboard page should appear

  Scenario: create a new faculty
    When navigate to create faculty page
    Then page title should be "List of Faculty"
    When click on create faculty button
    Then pop up should appear with title "Create Faculty"
    When enter faculty name as "Rajinikanth"
    And upload profile file as "C:\Users\rajin\IdeaProjects\Faculty\src\test\resources\download.jpeg"
    And enter faculty contact as "8897953981"
    And enter faculty email as "rajesh@gmail.com"
    And select department as "web development"
    And select designation as "frontend developer"
    And enter skillset as "java,python,testng,selenium,html,css,javascript,bootstrap"
    And click on submit button
    Then faculty should be created with name "Rajinikanth"
    Then exit the application