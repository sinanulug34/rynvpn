Feature: Free user scenarios

  Scenario: Verify that free user must be able to see elements
    When I click use for free button
    When I click close popup
    When I click close popup
    Then I must be able to see text as connect
    Then I must be able to see text as game
    Then I must be able to see text as stream
    Then I must be able to see text as time left
    Then I must be able to see text as server location

  Scenario: Offline Subscription
    When I click use for free button
    When I click close popup
    When I click close popup
    When I click stream button
    Then I must be able to see as streaming servers
    Then I must be able to see server country icon
    When I click any server
    When I click start your 7 days free trial button
    When I click offline subscription
    When I fill secret key
    When I click enter button
    When I click Allow button
    When I click connect button
    Then I must be able to see text as time left

  Scenario: Choose subscription
    When I click use for free button
    When I click close popup
    When I click close popup
    When I click stream button
    When I click any server
    When I click start your 7 days free trial button
    When I click subscription
    When I click connection request approve
    When I click Subscribe button
    When I click OK button for purchase
    Then I must not be able to see no add shown




