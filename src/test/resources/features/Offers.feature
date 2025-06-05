Feature: Offers

@offers @regression
Scenario Outline: Validate Offers Page Title

	Given I have launch yatra application
	Then I can see the yatra home page
	When I click on offers field
	Then I can see the offers page