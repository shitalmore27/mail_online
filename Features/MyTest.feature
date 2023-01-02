Feature: Test feature
  @Test
Scenario: Verification on web pages

Given Launch application
Then Validate todays date
When Navigate to Sports
Then validate background color for primary and secondary navigation
When Navigate to Football
When Navigate to first article
When Click on first image from article
Then validate Previous button on image is displayed
Then validate Next button on image is displayed
Then Validate Next button functionality
Then Validate Previous button functionality
When Click on close button
Then Click on Facebook icon and verify opened window
Then Click on Video full screen
Then exhibit points for "Liverpool" team
Then Close the test run

