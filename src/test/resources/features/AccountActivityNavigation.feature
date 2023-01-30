@AccountActivityNavigation @smoke
Feature: Navigating to specific accounts in Accounts Activity

  @AccountActivityNavigation1
  Scenario Outline: Login with invalid credentials
    When the user on the login page
    And the user type username "<username>"
    And the user type password "<password>"
    And the user click the sign in button
    Then verify "<error message>" should be displayed

    Examples:
      | username    | password    | error message                    |
      |             | password    | Login and/or password are wrong. |
      | USERNAME    | PASSWORD    | Login and/or password are wrong. |
      | username    |             | Login and/or password are wrong. |
      | username123 | password    | Login and/or password are wrong. |
      | username    | password123 | Login and/or password are wrong. |
      | username123 | password123 | Login and/or password are wrong. |
      |             |             | Login and/or password are wrong. |


  @AccountActivityNavigation2
  Scenario: Savings account redirect
    Given  the user is logged in
    When the user clicks on Online Baking More Services
    When the user clicks on "Account Activity" link
    Then the "Account Activity" page should be displayed
    And the user accesses the "Show Transactions" tab
    And Account drop down should have following parts

      | Savings     |
      | Brokerage   |
      | Checking    |
      | Credit Card |
      | Loan        |





#  @AccountActivityNavigation3
#  Scenario Outline: Savings account redirect
#    Given  the user is logged in
#    When the user clicks on Online Baking More Services
#    When the user clicks on "Account Activity" link
#    Then the "Account Activity" page should be displayed
#    And the user accesses the "Show Transactions" tab
#    And Account drop down should have "<part>" selected
##    And the user logged out
#
#    Examples:
#      | part        |
#      | Savings     |
#      | Brokerage   |
#      | Checking    |
#      | Credit Card |
#      | Loan        |
