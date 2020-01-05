Feature:
 @a
  Scenario: Verify the empty message on login home page
Given manager should be able to navigate to the url
When  manager signs in the home page
Then  manager should see an empty message "emptyMessage"
And manager should be able to verify the empty message
