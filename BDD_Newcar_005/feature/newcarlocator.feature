Feature: Test New car locator 

Scenario: Positive test for new car 
Given Initialize the browser with chrome
When User navigate to Newcar website
Then User should be able to see all car in mention location  
And close browsers
