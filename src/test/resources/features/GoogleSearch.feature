Feature: Google Search 

Scenario: Search by typing 

Given I navigated to the Google page
When I type the item to search
And I click on search button
Then I see the search results are displayed 