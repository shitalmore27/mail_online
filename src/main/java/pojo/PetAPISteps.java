package pojo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.SoftAssertions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;
import org.testng.Assert;
import pages.MainPage;

import static com.relevantcodes.extentreports.LogStatus.PASS;

public class PetAPISteps {

    public PetInfo createPetClass(Map<String, String> petData) {
        Category category = new Category(Integer.parseInt(petData.get("categoryId")),petData.get("categoryName"));
        List<String> photoUrls = new ArrayList<>();
        photoUrls.add(petData.get("photoUrls"));
        List<Tag> tags = new ArrayList<>();
        Tag tagData = new Tag(Integer.parseInt(petData.get("tagsId")),petData.get("tagsName"));
        tags.add(tagData);
        PetInfo petInfo = new PetInfo(Integer.parseInt(petData.get("petId")),category,petData.get("petName"),photoUrls,tags,petData.get("status"));
        return petInfo;
    }

    public Response createPetRequest(String url, PetInfo petInfo) {
        APIRequestBuilder apiRequestBuilder = new APIRequestBuilder(url, "application/json", petInfo);
        RequestSpecification requestSpec = apiRequestBuilder.getRequestSpecification();
        requestSpec = RestAssured.given().spec(requestSpec);
        Response res = requestSpec.when().post();
        return res;

    }
    @Step
    public PetInfo validatePetInfoIsAdded(Response res) {
        PetInfo petInfo = petResponseDeSerialization(res);
        System.out.println(res.getStatusCode());
        MainPage.test = MainPage.report.startTest("API Test");
        if(res.getStatusCode()==200) {
            MainPage.test.log(PASS, "Pet record created");
        }
        return petInfo;
    }

    private PetInfo petResponseDeSerialization(Response res) {
        return res.as(PetInfo.class);
    }



    public PetInfo fetchPetInfoById(String url,String petId) {
        APIRequestBuilder apiRequestBuilder = new APIRequestBuilder(url + "/" + petId, "application/json", null);
        RequestSpecification requestSpec = apiRequestBuilder.getRequestSpecification();
        requestSpec = RestAssured.given().spec(requestSpec);
        Response res = requestSpec.when().get();
        PetInfo expectedResponse = res.as(PetInfo.class);
        if(res.getStatusCode()==200) {
            MainPage.test.log(PASS, "Pets record with "+petId+"fetched and pet name is "+expectedResponse.getName());
        }

        return expectedResponse;

    }


    public PetAPIResponse deletePetInfoById(String petUrl, String petId) {
        APIRequestBuilder apiRequestBuilder = new APIRequestBuilder(petUrl + "/" + petId, "application/json", null);
        RequestSpecification requestSpec = apiRequestBuilder.getRequestSpecification();
        requestSpec = RestAssured.given().spec(requestSpec);
        Response res = requestSpec.when().delete();
        PetAPIResponse expectedResponse = res.as(PetAPIResponse.class);
        if(res.getStatusCode()==200) {
            MainPage.test.log(PASS, "Pets record with pet id "+petId+" deleted");
        }
            res = requestSpec.when().get();
        MainPage.report.endTest(MainPage.test);
        return expectedResponse;
    }


}