@AddNewPayee @smoke
  Feature: Add new payee under pay bills

    Background:
      Given the user is logged in
      When the user clicks on Online Baking More Services
      And the user clicks on "Pay Bills" link
      And the "Pay Bills" page should be displayed
      And the user accesses the "Add New Payee" tab


  @AddNewPayee1
    Scenario Outline: Add a new payee
      And creates new payee using following information
        | Payee Name    | The Law Offices of Hyde, Price & Scharks |
        | Payee Address | 100 Same st, Anytown, USA, 10001         |
        | Account       | Checking                                 |
        | Payee details | XYZ account                              |
      Then validation "<message>" should be displayed
    Examples:
      | message |
      | The new payee The Law Offices of Hyde, Price & Scharks was successfully created. |

    @AddNewPayee2
    Scenario Outline: Add a new payee with empty Payee Name field
      And creates new payee using following information without Payee Name
        | Payee Name    |                                  |
        | Payee Address | 100 Same st, Anytown, USA, 10001 |
        | Account       | Checking                         |
        | Payee details | XYZ account                      |
      Then error "<message>" should be displayed
      Examples:
        | message                     |
        | Please fill out this field. |

