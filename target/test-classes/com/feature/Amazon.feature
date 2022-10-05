Feature: Customer can purchase product
Scenario: HomePage

Given type The Url Of The Application
When user Click The Dropdown Option
And type Soft Toy In The Search Box
Then click On The Soft Toy Suggestion

Scenario: Productpage
When find The Number Of Products In Results
And find The Number of products in more results
Then print the result