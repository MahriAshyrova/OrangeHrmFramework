#Author: //syntax team    John.smith@wellsfargo.com
@sprint1 @login
Feature: Login

  Background: 
    Given I see OrangeHrm logo

  @smoke 
  Scenario: Valid login
    When I enter valid userName and Password
    And I click on login button
    Then I successfully logged in

  @regression 
  Scenario: Invalid login
    When I enter invalid userName and Password
    And I click on login button
    Then I see the error message is displayed

  @regression
  Scenario: Error message Validation
    When I enter invalid username and password I see the errorMessage
      | username | password    | errorMessage        | 
      | Admin    | Admin123    | Invalid Credentials |
      | Admin1   | Syntax123!  | Invalid Credentials |
      | Admin1   | Syntax123!! | Invalid Credentials |
