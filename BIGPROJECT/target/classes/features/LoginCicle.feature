@LoginCicle
Feature: Login
  User want to Login

  @PositiveLogin
  Scenario: User Sign In with Gmail Account
  	Given User on The Cicle Login Page
		When User login with Gmail Account
		Then User Should be Navigated to Dashboard Cicle
		
