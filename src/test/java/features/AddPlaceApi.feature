Feature: As a user i want to add a place

Scenario: user hits the add place api call then place should be added successfully
Given the add place api details
When user hits the add place api call
Then place should get added successfully
And status code should be "201"