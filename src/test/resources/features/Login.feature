Feature: Ryn VPN

  Scenario: Verify that free user must be able to see elements
    When I click use for free button
    When I click close popup
    Then I must be able to see text as connect
    Then I must be able to see text as game
    Then I must be able to see text as stream
    Then I must be able to see text as time left
    Then I must be able to see text as server location

  Scenario: User Free VPN connection
    When I click use for free button
    #When I click close popup
    When I click back button
    When I click stream button
    Then I must be able to see as streaming servers
    Then I must be able to see server country icon
    When I click any server
    When I click back button
    # bir step daha back gerekebilir.
    When I click offline subscription
    When I fill secret key
    When I click enter button
    When I click Allow button
    When I click connect button
    Then I must be able to see text as time left


  Scenario: Try premium for 7 days
    When I click try premium button
    Then I must be able to see select plan element
    Then I must be able to see half yearly subscription
    Then I must be able to see monthly subscription
    Then I must be able to see three months subscription
    When I click continue button

