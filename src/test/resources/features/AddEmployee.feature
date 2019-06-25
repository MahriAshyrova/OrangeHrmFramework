
@addEmployee
Feature: Add Employee

  Background: 
    Given I logged into OrangeHrm
    And I click on PIM link
    And I click on Add Employee link

  @smoke 
  Scenario Outline: Add Employee to OrangeHrm
    When I provide Employee details "<fName>" and "<lName>" and "<loc>"
    And I click on save button
    Then I see employee "<fName>" and "<lName>" are added successfully

    Examples: 
      | fName   | lName    | loc          |
      | Anna    | Karenina | Smart Office |
      | Antosha | Chehov   | West Office  |
      | Leva    | Tolstoy  | HQ           |

  @regression
  Scenario Outline: Add Employee and Create Login details
    When I provide Employee details "<fName>" and "<lName>" and "<loc>"
    And I click on create login details
    And I provide all mandotory fields "<UserName>" and "<Password>" and "<ConfirmPassword>" and "<ESSRole>" and "<SuperviserRole>"
    And I click on save button
    Then I see employee "<fName>" and "<lName>" are added successfully

    Examples: 
      | fName  | lName      | loc          | UserName   | Password      | ConfirmPassword | ESSRole     | SuperviserRole     |
      | AnnaKA | KareninaAK | Smart Office | KareninaAK | Kizilka4321!$ | Kizilka4321!$   | Default ESS | Default Supervisor |

  @regression @temp
  Scenario: Add Employee Labels Verifications
    Then I see the following labels
      | First Name           |
      | Middle Name          |
      | Last Name            |
      | Employee Id          |
      | Location             |
      | Create Login Details |
