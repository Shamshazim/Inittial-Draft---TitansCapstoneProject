Feature: RetailPage

  Background: 
    Given user is on the home page
    When user click on MyAccount
    And user click on login option
    And user enter user name "student1@tekschool.us" and password "cali123"
    And user click on the login button
    Then user should be able to logged into account

  Scenario: Register as an Affiliate Account with Chegue Payment Method
    Given user click on the Register for an Affiliate account link
    And user fill affiliate form with below information
      | company | website | taxID | paymentMethod | Payee Name |
    And user check on About us check box
    And user click on Continue button
    Then user should see a success message

  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    Given User click on Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
    And User click on Continue button
    Then User should see a success message
