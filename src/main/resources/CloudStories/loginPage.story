Meta:

Narrative:
As the system user after entering the correct authorization data
I am able to enter the system with the respective role
for having an ability to use the system.

Scenario: User logs on to system with valid data
Given As user being on loginPage
When I type valid login and password
When I click on SignInButton
Then I can enter to overViewPage