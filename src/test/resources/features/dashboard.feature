Feature: Dashboard Page

Background: 
    Given the application is open
    When I enter username "Admin"
    And I enter password "admin123"
    And I click the login button
    Then I should see the dashboard
@smoke
Scenario: validate all buttton on Quick launch
	Then I should see Assign Leave button
	Then I should see  Leave list button
	
	
	

 