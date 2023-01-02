package Steps;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import net.thucydides.core.annotations.Steps;
import pages.MainPage;
import pojo.PetAPIResponse;
import pojo.PetAPISteps;
import pojo.PetInfo;
import java.util.List;
import java.util.Map;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class StepAPI {
    private static String petUrl = null;
    private PetInfo petInfo = null;
    private Response res = null; // Response

@Steps
    PetAPISteps petAPISteps=new PetAPISteps();
    @Before
    public void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
       // this.softAssertion = new SoftAssertions();
    }

    @After
    public void tearDown() {
       // this.softAssertion.assertAll();
        RestAssured.reset();
    }

    @Given("^As a owner add new pet to the store with the below data$")
    public void as_a_owner_I_would_add_new_pet_to_the_store_with_url(List<Map<String, String>> listOfData) {
        Map<String, String> petData = listOfData.get(0);
        StepAPI.petUrl = petData.get("url");
        this.petInfo = petAPISteps.createPetClass(petData);
        this.res = petAPISteps.createPetRequest(StepAPI.petUrl, this.petInfo);
        PetInfo petResponse = petAPISteps.validatePetInfoIsAdded(this.res);
//       // petAPISteps.comparePetInfo(softAssertion, this.petInfo, petResponse);
    }

    @When("^search pet ID with \"([^\"]*)\"$")
    public void add_new_pet_it_shoud_be_avilable_to_serach_with_pet_by_ID(String petId) throws Throwable {
        PetInfo petResponse = petAPISteps.fetchPetInfoById(StepAPI.petUrl, petId);
         }

    @Then("^delete the pet profile by id \"([^\"]*)\"$")
    public void delete_the_pet_profile_by_id(String petId) throws Throwable {
        PetAPIResponse expectedResponse = petAPISteps.deletePetInfoById(StepAPI.petUrl, petId);
    }

}
