package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in org.example.Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a WebForm1")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterFirstName();
        webForm.enterLastName();
        webForm.enterJobTitle();
        webForm.clickRadioButton1();
        webForm.clickRadioButton2();
        webForm.clickRadioButton3();
        webForm.clickCheckBox();
        webForm.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        webForm.verifyAlertSuccess();
    }

    @Test(testName = "Submit a WebForm2")
    public static void submitForm2(){
        driver.get(Utils.FIRST_URL);
        WebForm webForm = new WebForm(driver);
        webForm.pressQuizBox();
        webForm.pressAssignmentBox();
        webForm.pressCodingBox();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test(testName = "Submit a WebForm3")
    public static void submitForm3(){
        driver.get(Utils.SEC_URL);
        WebForm webForm = new WebForm(driver);
        webForm.pressUpload();
        webForm.pressUploadFile();


        //webForm.enterFileName();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
