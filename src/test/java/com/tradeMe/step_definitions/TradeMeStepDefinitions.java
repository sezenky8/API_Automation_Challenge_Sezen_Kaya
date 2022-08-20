package com.tradeMe.step_definitions;

import com.tradeMe.utilites.ApiUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

public class TradeMeStepDefinitions extends ApiUtils {
   JsonPath jsonPath;
   long actualListingId;
   boolean actualSuccessMessage;
   int actualTotalCount;
   int expectedStatusCode = 200;
   int actualStatusCode;

   @When("The user retrieves a specific listing and add it to his or her watchlist")
   public void theUserRetrievesASpecificListingAndAddItToHisHerWatchlist() {
      retrieveSingleList();
      actualStatusCode = retrieveSingleList().getStatusCode();
      Assert.assertEquals(expectedStatusCode, actualStatusCode);
      addListingToWatchlist();
      jsonPath = addListingToWatchlist().jsonPath();
      actualSuccessMessage = jsonPath.get("Success");
      Assert.assertTrue(actualSuccessMessage);
      Assert.assertEquals(expectedStatusCode, addListingToWatchlist().getStatusCode());
   }

   @Then("The user should review the listing could be successfully added to his or her watchlist")
   public void theUserShouldReviewTheListingCouldBeSuccessfullyAddedToHisHerWatchlist() {
      retrieveMyWatchlist();
      actualStatusCode = retrieveMyWatchlist().getStatusCode();
      jsonPath = retrieveMyWatchlist().jsonPath();
      actualListingId = jsonPath.get("List[0].ListingId");
      long expectedListingId = 2149443108L;
      Assert.assertEquals(expectedStatusCode, actualStatusCode);
      Assert.assertEquals(expectedListingId, actualListingId);
   }

   @And("The user removes items from his or her watchlist as needed")
   public void theUserRemovesItemsFromHisHerWatchlistAsNeeded() {
      deleteListingFromMyWatchlist();
      actualStatusCode = deleteListingFromMyWatchlist().getStatusCode();
      jsonPath = deleteListingFromMyWatchlist().jsonPath();
      actualSuccessMessage = jsonPath.get("Success");
      Assert.assertEquals(expectedStatusCode, actualStatusCode);
      Assert.assertTrue(actualSuccessMessage);
   }

   @Then("The user should only be able to view his or her own watchlist")
   public void theUserShouldOnlyBeAbleToViewHisHerOwnWatchlist() {
   }

   @And("The user filter his or her watchlist")
   public void theUserFilterHisHerWatchlist() {
      addListingToWatchlist();
      actualStatusCode = addListingToWatchlist().getStatusCode();
      Assert.assertEquals(expectedStatusCode, actualStatusCode);
      retrieveMyFilteredWatchlist();
      actualStatusCode = retrieveMyFilteredWatchlist().getStatusCode();
      jsonPath = retrieveMyFilteredWatchlist().jsonPath();
      actualTotalCount = jsonPath.get("TotalCount");
      boolean totalCountBiggerThanZero = actualTotalCount > 0;
      Assert.assertEquals(expectedStatusCode, actualStatusCode);
      Assert.assertTrue(totalCountBiggerThanZero);
   }
}