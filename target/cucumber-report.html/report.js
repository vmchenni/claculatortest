$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:ChromeDriver/Features/SanityTest.feature");
formatter.feature({
  "name": "Sanity Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.scenario({
  "name": "Sanity Test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User launches URL",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.myStepDef.userLaunchesURL()"
});
formatter.result({
  "status": "passed"
});
});