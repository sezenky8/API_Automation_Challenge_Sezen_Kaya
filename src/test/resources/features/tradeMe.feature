@tradeMe
  Feature: Checking the main functions of watchlist flow
    Scenario: As a user I should be able to use the functions of watchlist
      When The user retrieves a specific listing and add it to his or her watchlist
      Then The user should review the listing could be successfully added to his or her watchlist
      And The user removes items from his or her watchlist as needed
      Then The user should only be able to view his or her own watchlist
      And The user filter his or her watchlist