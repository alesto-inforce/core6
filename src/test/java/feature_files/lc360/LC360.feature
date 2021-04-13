Feature: Fill in LC360 risk details

  #Background: Open LC360
    #Given I open OKTA and select LC360 tile

  Scenario Outline: Quote Creation - row "<row>"

    And I navigate to inspections
    And I search for a policy "<policy>"
    And I select the policy "<policy>"
    And I assign myself as Risk Manager "<RM>"
    Then I fill in underwriter form "<row>"
    Examples:
      | policy      | RM                    | row |
      #| HO233748700 | Aleksandar Stojanovic | 1   |
      | HO233748800 | Aleksandar Stojanovic | 1   |
     | HO233748900 | Aleksandar Stojanovic | 1   |
     #| HO233749000 | Aleksandar Stojanovic | 1   |