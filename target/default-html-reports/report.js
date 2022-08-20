$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/tradeMe.feature");
formatter.feature({
  "name": "Checking the main functions of watchlist flow",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tradeMe"
    }
  ]
});
formatter.scenario({
  "name": "As a user I should be able to use the functions of watchlist",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tradeMe"
    }
  ]
});
formatter.step({
  "name": "The user retrieves a specific listing and add it to his or her watchlist",
  "keyword": "When "
});
formatter.match({
  "location": "com.tradeMe.step_definitions.TradeMeStepDefinitions.theUserRetrievesASpecificListingAndAddItToHisHerWatchlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should review the listing could be successfully added to his or her watchlist",
  "keyword": "Then "
});
formatter.match({
  "location": "com.tradeMe.step_definitions.TradeMeStepDefinitions.theUserShouldReviewTheListingCouldBeSuccessfullyAddedToHisHerWatchlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user removes items from his or her watchlist as needed",
  "keyword": "And "
});
formatter.match({
  "location": "com.tradeMe.step_definitions.TradeMeStepDefinitions.theUserRemovesItemsFromHisHerWatchlistAsNeeded()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should only be able to view his or her own watchlist",
  "keyword": "Then "
});
formatter.match({
  "location": "com.tradeMe.step_definitions.TradeMeStepDefinitions.theUserShouldOnlyBeAbleToViewHisHerOwnWatchlist()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user filter his or her watchlist",
  "keyword": "And "
});
formatter.match({
  "location": "com.tradeMe.step_definitions.TradeMeStepDefinitions.theUserFilterHisHerWatchlist()"
});
formatter.result({
  "status": "passed"
});
});