Feature: Visit a page and click on a link

  @test
  Scenario Outline: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    When I click on click on Sign in
    And sign in page is displayed
    And I enter valid user Email or username as "<Email_username>"
    And I enter valid password as "<Password>"
    And I click on Sign in button
    And I click on Weather link tab
    And Weather Search page is displayed
    And I enter location as "<Location>"
    And I click on the search button
    And Search result is displayed
    And I select the search result
    And Weather details page for the searched "<Location>" is displayed
    And I click on Add to My Location button
    Then Location is Added to my location



    Examples:
      | Email_username     | Password     | Location   |
      | olu.engr@gmail.com | Password@123 | London     |



