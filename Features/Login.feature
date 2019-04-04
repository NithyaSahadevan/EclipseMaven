Feature:Login functionality for demoqa.com

Scenario:Verify that user is able to successfully login to demoqa.com website
	Given A user is on demoqa.com
	When User clicks on MyAccount link
	Then User is taken to Login page
	When User enters a valid UserName and Password
	Then User is able to login successfully