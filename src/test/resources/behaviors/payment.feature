Feature: We reject the credit card

  Scenario: (1) A debit card except HalkBank asks for payment but rejected
    When credit card number 5170410000000004 asks for payment on date 2018-03-03 as transaction code 001
    Then payment should be rejected

