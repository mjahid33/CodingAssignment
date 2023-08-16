$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/discover.feature");
formatter.feature({
  "name": "Validation of APR for Cash Advances",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.scenario({
  "name": "As a user I should be able to verify that APR for Cash Advances is greater than 20%",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@run"
    }
  ]
});
formatter.step({
  "name": "User navigates to Discover HomePage",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageStep.user_navigates_to_Discover_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on the “Credit Cards” icon",
  "keyword": "When "
});
formatter.match({
  "location": "CreditCardStep.user_clicks_on_the_Credit_Cards_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks “Apply Now” for card type: Secured Credit Card",
  "keyword": "And "
});
formatter.match({
  "location": "ApplyNowStep.user_clicks_Apply_Now_for_card_type_Secured_Credit_Card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user skips the pre-fill step",
  "keyword": "Then "
});
formatter.match({
  "location": "SkipStep.user_skips_the_pre_fill_step()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user verifies that the APR for Cash Advances is greater than 20%",
  "keyword": "And "
});
formatter.match({
  "location": "AssertStep.user_verifies_that_the_APR_for_Cash_Advances_is_greater_than(Integer)"
});
formatter.result({
  "status": "passed"
});
});