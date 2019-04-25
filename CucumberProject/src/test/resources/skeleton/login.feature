Feature: Login Feature
Scenario Outline: Valid User Scenario
Given The URL of Mercurytours
When user enters <Username> as Username
And user enters <Password> as Password
Then user is in the <Page>
Examples:
#bitwise OR is used to creating a datatable.
|Username		|Password		|Page|
|Lalitha		|Password123		|Home |
|admin		|Password456	|Admin Home |

@invalid
Scenario: invalid scenario
    Given The URL of Mercurytours
    When user enters invalid data
    |Lalitha|Password123|
    |Lalitha|Password890|
    |abc123|abc123|
    Then user is in loginpage
    |Home|
    |abc|
    |xyz|