package pageObject;
import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signIn_page {


    public signIn_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how=How.NAME,using ="email")
    public WebElement enterStudentEmail;
    @FindBy(how=How.NAME,using ="password")
    public WebElement enterStudentPassword;
    @FindBy(how=How.CLASS_NAME,using ="my-login")
    public WebElement clickLoginButton;


    public void enterStudentEmailAddress(String email){
        enterStudentEmail.sendKeys(email);
    }
    public void enterStudentPass(String password) {
        enterStudentPassword.sendKeys(password);

    }
    public void clickLogin() {
        clickLoginButton.click();
    }
}
