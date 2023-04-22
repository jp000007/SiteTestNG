package org.example;// Page URL: https://formy-project.herokuapp.com/form
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject{

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";

    private final String JOB_TITLE = "Job Title";

    private final String ITEM = "Japanese Toilet";

    private final String FILE_NAME = "C:\\download.jfif";

    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(id = "job-title")
    private WebElement job_title;

    @FindBy(id = "radio-button-1")
    private WebElement radio_button_1;

    @FindBy(id = "radio-button-2")
    private WebElement radio_button_2;

    @FindBy(id = "radio-button-3")
    private WebElement radio_button_3;

    @FindBy(id = "checkbox-1")
    private WebElement check_box_1;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;

    @FindBy(xpath = "//*[@id=\"j_idt107\"]/div[2]")
    private WebElement check_quiz;

    @FindBy(xpath = "//*[@id=\"j_idt109\"]/div[2]")
    private WebElement check_assign;

    @FindBy(xpath = "//*[@id=\"j_idt111\"]/div[2]")
    private WebElement check_coding;

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[18]/a")
    private WebElement click_upload;

    @FindBy(id = "file-upload")
    private WebElement upload_file;

    @FindBy(xpath = "//*[@id=\"content\"]/ul/li[18]/a")
    private WebElement text_box;

    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    private WebElement item_button;

    @FindBy(xpath = "//*[@id=\"menuform:j_idt38\"]/a")
    private WebElement menu_button;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;
////*[@id="menuform:j_idt38"]/a
////*[@id="content"]/ul/li[18]/a

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void enterJobTitle(){
        this.last_name.sendKeys(JOB_TITLE);
    }

    public void clickRadioButton1(){this.radio_button_1.click();}

    public void clickRadioButton2(){this.radio_button_2.click();}

    public void clickRadioButton3(){this.radio_button_3.click();}

    public void clickCheckBox(){this.submit_button.click();}

    public void pressSubmitButton(){
        this.submit_button.click();
    }

    public void pressQuizBox(){this.check_quiz.click();}

    public void pressAssignmentBox(){this.check_assign.click();}

    public void pressCodingBox(){this.check_coding.click();}

    public void pressUpload(){this.click_upload.click();}

    public void pressUploadFile(){this.upload_file.sendKeys(FILE_NAME);}

    public void enterItem(){
        this.text_box.sendKeys(ITEM);
    }

    public void pressItem(){this.item_button.click();}





    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}