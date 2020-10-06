package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pojo.Response;

import java.util.concurrent.TimeUnit;

import static io.restassured.RestAssured.given;


public class myStepDef {
    Response response;
    @Given("^User calls get user API$")
    public void UsercallsgetuserAPI(){
       response=    given().
                    when().
                    get("https://reqres.in/api/users/2").
                    then().assertThat().statusCode(200).
                     extract().as(Response.class);
    }
    @Then("Verify that status code is {int} and FirstName is {string}")
    public void verify_that_status_code_is_and_FirstName_is(Integer int1, String sExpected) {
      String sFirstName=  response.getData().getFirst_name();
      System.out.println("First Name is ;-"+sFirstName);
        Assert.assertEquals(sExpected,sFirstName);
    }
    @And("^Verify Last name as \"([^\"]*)\"$")
    public void verify_last_name_as_something(String sLastName) throws Throwable {
        Assert.assertEquals(sLastName,response.getData().getLast_name());
    }

    @Given("User launches URL")
    public void userLaunchesURL() {
        System.out.println("Hello World!");
        System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver-Linux");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.SECONDS);
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);
//        try{
//            driver.findElement(By.xpath("//h1[contains(text(),'Demo Calculator')]")).isDisplayed();
//        }catch (Exception e){
//            System.out.println("HomePage is not displayed");
//        }

        driver.close();
        driver.quit();

    }
}
