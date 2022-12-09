Feature:As a user, I should be able to attach files about problems

  Background:
    Given user goes to therapist login page

  Scenario: TC_001
    When user clicks clients
    Then user search client
    When user clicks view detail
    And  user clicks login Presenting Issue
    And  user clicks Additional Notes
    Then Assert voice Notes is enable
    When  user clicks add Voice
    Then  user verifies Recording
    When user clicks recorded sound
    And user clicks Play button and Voice play
    And user verifies "tıtle"


