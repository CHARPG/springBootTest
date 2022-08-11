Feature: feed the cat

  AS AN owner
  I WANT TO feed my cat
  SO THAT my cat isn't hungry

  Scenario: Successfully feed the cat
    Given the cat is hungry
    When I try to feed the cat
    Then the cat should no longer be hungry