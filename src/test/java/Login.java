import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import pages.LoginPage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import static pages.LoginPage.*;

/**
 * Created by caixiaoxue on 16/10/19.
 */
public class Login {

    private static AppiumDriver driver;
    private static String appName = "QFD.app";

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        File root = new File(System.getProperty("user.dir"));
        File app = new File(root, "app" + File.separator + appName);
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.3");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPad Air");
        capabilities.setCapability(MobileCapabilityType.UDID, "4869d49a18c6503608fbc8026dc2cb6513142b53");
        capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        //capabilities.setCapability(MobileCapabilityType.UNICODE_KEYBOARD,"True");
        //capabilities.setCapability("resetKeyboard", "True");
        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);


    }

    public boolean getKeybord_num(String numbers){

       List<WebElement> lis = LoginPage.UIAKey;

        int keyCode[] = {9,0,1,2,3,4,5,6,7,8};
        if (numbers.length() == 11) {//判断手机号码长度是否为11位
            for (int i = 0; i < numbers.length(); i++) {
                char num = numbers.charAt(i);
                lis.get(keyCode[num - '0']).click();
            }
            return true;
        }else{
            System.out.print("手机号码长度不对");
            return false;
        }

    }

    @Test
    public void LoginHD() throws Exception{

        WebElement userName = USERNAME;
        userName.clear();

        Boolean a = getKeybord_num("13631153598");//输入用户名手机号码
        if(a) {//手机号码位数正确之后才输入密码
            WebElement passWord = utils.AppiumUtil.findElement(CLASSNAME_PASSWORD);//密码输入框
            passWord.sendKeys("123456");//键入密码
        }

        WebElement login = CLASSNAME_LOGIN;
        System.out.println("login:" + login.getText());
        login.click();

       /* Thread.sleep(3000);
        List<WebElement> character = driver.findElements(By.className("UIAStaticText"));
        System.out.println("character.size:" + character.size());

        System.out.println("character:" + character.get(6).getText());
        System.out.println("isDisplayed:" + character.get(6).isDisplayed());
        if(character.get(6).isDisplayed()){

            List<MobileElement> chars = driver.findElements(By.className("UIATableCell"));
            chars.get(1).click();

        }else {
            MobileElement err = (MobileElement) driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAStaticText[1]"));
            System.out.print(err.getText().contains("账号/密码错误"));
        }*/

    }

}
