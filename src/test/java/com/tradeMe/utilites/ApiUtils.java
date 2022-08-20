package com.tradeMe.utilites;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.response.Response;

public class ApiUtils {
   Header header=new Header(
         "Authorization",
         "OAuth oauth_consumer_key=\"D60013868D88E73FA56B7F3A2F42FEDF\"," +
         "oauth_token=\"899E51F1FD01B44A9ACE4DA67399CAE0\"," +
         "oauth_signature_method=\"PLAINTEXT\"," +
         "oauth_timestamp=\"1660928214\"," +
         "oauth_nonce=\"MkBcyn0nO7C\"," +
         "oauth_version=\"1.0\"," +
         "oauth_signature=\"61E2F002D5E9F41D75DF58DD52749AF4%26A9DE4569A1F067C9E0BDC9B2F178B450\"");

   public Response retrieveSingleList() {
      Response response = RestAssured.given()
            .accept(ContentType.JSON)
            .header(header)
            .get("https://api.tmsandbox.co.nz/v1/Listings/2149443108.json");
      return response;
   }

   public Response addListingToWatchlist() {
      Response response = RestAssured.given()
            .accept(ContentType.JSON)
            .header(header)
            .post("https://api.tmsandbox.co.nz/v1/MyTradeMe/WatchList/2149443108.json");
      return response;
   }

   public Response retrieveMyWatchlist() {
      Response response = RestAssured.given()
            .accept(ContentType.JSON)
            .header(header)
            .get("https://api.tmsandbox.co.nz/v1/MyTradeMe/WatchList/All.json");
      return response;
   }

   public Response deleteListingFromMyWatchlist() {
      Response response = RestAssured.given()
            .accept(ContentType.JSON)
            .header(header)
            .delete("https://api.tmsandbox.co.nz/v1/MyTradeMe/WatchList/2149443108.json");
      return response;
   }

   public Response retrieveMyFilteredWatchlist() {
      Response response = RestAssured.given()
            .accept(ContentType.JSON)
            .header(header)
            .get("https://api.tmsandbox.co.nz/v1/MyTradeMe/WatchList/ReserveMet.json");
      return response;
   }
}