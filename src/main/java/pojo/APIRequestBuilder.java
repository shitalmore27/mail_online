package pojo;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class APIRequestBuilder {

    private RequestSpecification requestSpec = null;

    public APIRequestBuilder(String urlPath,String contentType,Object jsonObject) {
        RequestSpecBuilder builder = new RequestSpecBuilder();
        builder.setBasePath(urlPath);
        builder.setContentType(contentType);
        if(jsonObject != null) {
            builder.setBody(jsonObject);
        }
        System.out.println(urlPath);
        this.requestSpec = builder.build();
        this.requestSpec = RestAssured.given().spec(this.requestSpec);
        this.requestSpec.log().all();

    }


    public  RequestSpecification getRequestSpecification() {
        return this.requestSpec;
    }
}
