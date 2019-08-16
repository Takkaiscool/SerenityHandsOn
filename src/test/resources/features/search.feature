Feature: As an IMDb user
  I want to search for a TV program
  So that i can see that in the search results

  Scenario Outline: Validate search functionality on IMDB homepage

    Given I am on IMDB home page
    When I select TV Episodes in quick search dropdown
    And I enter <searchKeyword> in search text box
    And I click search button
    Then I should see <expectedSearchResult> in the search results

    Examples:
      | searchKeyword   | expectedSearchResult                                                                     |
      | Walking Dead    | Walking Dead (2014) (TV Episode)                                                         |
      | Rick and Morty  | Rick and Morty! PPG 2016! (2014) (TV Episode)                                            |
      | The Good Doctor | The Good Doctor (2003) (TV Episode)                                                      |
      | Shameless       | Shameless 'n' Andean (1997) (TV Episode)                                                 |
      | Game Of Thrones | Game of Thrones                                                                          |
      | Stranger Things | Stranger-er Things (2016) (TV Episode)                                                   |
      | Big Little Lies | Big Lies, Little Lies (2011) (TV Episode)                                                |
      | Attack on Titan | Attack on Titan: Part 1 (2014) (TV Episode)                                              |
      | The Wire        | On the Wire (2002) (TV Episode)                                                          |
      | Cosmos          | Cosmoscope (2002) (TV Episode)                                                           |

    Scenario: Validate director name displayed on program details page

      Given I am on IMDB home page
      When I select Most Popular TV Shows from Movies, TV and Showtimes menu
      And I click on The Walking Dead (2010) on Most Popular TV Shows page
      Then I should see Creators: Frank Darabont, Angela Kang on the program Details page