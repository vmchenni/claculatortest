Feature: Get User From Page 2
  Scenario: Get User From Page 2
    Given User calls get user API
    Then Verify that status code is 200 and FirstName is "Janet"
    And Verify Last name as "Weaver"