Feature: shoutfeature
Scenario: Sean shouts
Given Sean is 10metres away from Lucia
When Sean shouts "Free Coffee"
Then Lucia "listens" to the message

Scenario: Sean shouts away from lucia
Given Sean is 10metres away from Lucia
When Sean shouts "Free Coffee"
Then Lucia "cannot listen" to the message
