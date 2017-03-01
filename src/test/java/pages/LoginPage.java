package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by caixiaoxue on 16/10/19.
 */
public class LoginPage {
    private static AppiumDriver driver;

    public static final By CLASSNAMEUIABUTTON = By.className("UIAButton");
    public static final By CLASSNAMEUIATEXTFIELD= By.className("UIATextfield");
    public static final By CLASSNAMEUIASTATICTEXT = By.className("UIAStaticText");
    public static final By CLASSNAMEUIAKEY = By.className("UIAKey");
    public static final By CLASSNAMEUIATextView = By.className("UIATextView");

    public static List<WebElement> UIAButton = utils.AppiumUtil.findElements(CLASSNAMEUIABUTTON);
    public static List<WebElement> UIATextField = utils.AppiumUtil.findElements(CLASSNAMEUIATEXTFIELD);
    public static List<WebElement> UIAStaticText = utils.AppiumUtil.findElements(CLASSNAMEUIASTATICTEXT);
    public static List<WebElement> UIAKey = utils.AppiumUtil.findElements(CLASSNAMEUIAKEY);
    public static List<WebElement> UIATextView = utils.AppiumUtil.findElements(CLASSNAMEUIATextView);

    /**
     * 用户名输入框 userName
     */
    public static final WebElement USERNAME = UIATextField.get(0);
    public static final By XPATH_USERNAME = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]");

    /**
     * 用户名清除文本
     */
    public static final By CLASSNAME_CLEAR = By.className("UIAButton");
    public static final By XPATH_CLEAR = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIATextField[1]/UIAButton[1]");

    /**
     * 密码框 passWord
     */
    public static final By CLASSNAME_PASSWORD = By.className("UIASecureTextField");
    public static final By XPATH_PASSWORD = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIASecureTextField[1]");

    /**
     * 登录 login
     */

    public static final WebElement CLASSNAME_LOGIN = UIAButton.get(1);
    public static final By XPATH_LOGIN = By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAScrollView[1]/UIAButton[1]");

}
