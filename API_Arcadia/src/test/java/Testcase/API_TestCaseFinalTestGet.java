package Testcase;

import static io.restassured.RestAssured.given;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import Utility.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class API_TestCaseFinalTestGet {
	ResponseSpecification res;
    RequestSpecification req_spec;
    String str=" ";
    @BeforeClass
    public void setSpecification()
    {
        res=RestAssured.expect();
        res.statusLine("HTTP/1.1 200 OK");
        res.contentType(ContentType.JSON);
        ExtentReportManager.createReport("reportName");
    }
    
@Test(priority=1)
    
    public void GeneralSetting() {
        RestAssured.baseURI="https://arcadia.pisystindia.com/";
        Response resp=given().header("Authorization",str).when().get("api/generalSetting").then().contentType(ContentType.JSON).extract().response();
        System.out.println("get op is:" +resp.asPrettyString());
    }   
    
         @AfterMethod
        public void tearDown() {
            ExtentReportManager.extentReportManager.endTest(ExtentReportManager.extentTest);
        }
        
        @AfterClass
        public void closeReport() {
            ExtentReportManager.extentReportManager.flush();
        }
}





