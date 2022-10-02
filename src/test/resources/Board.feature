@Regression @BoardFeature
Feature: Board Feature

@Login-001
  Scenario:Succesfully login to Cilsy
    Given User is landing in homepage
    When User clicks Team icon
    #And User clicks Board icon
    And User clicks Group Chat icon
    
    
#    Then User should be navigated to Teams page
#
#  @Board-001
#  Scenario:Successfully add new list on kanban board
#
#    Given User already on kanban board page2
#    And User click add list
#    And User type list name
#    When User click create button1
#    Then User should be success create new list