package pagesHelper;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import pages.LoginPage;
import utils.AppiumUtil;



import static com.oracle.tools.packager.Log.info;

/**
 * Created by caixiaoxue on 16/10/27.
 */
public class LoginPageHelper {

    public  static Logger logger = Logger.getLogger(LoginPageHelper.class);

    public  static void clickOnLoginPage(AppiumUtil appiumUtil,By byelement){
        appiumUtil.click(byelement);
    }

    public static void waitLoginUI(AppiumUtil appiumUtil,int elementTimeOut){
        logger.info("正在等待app首页元素加载");
        appiumUtil.waitForElementToLoad(elementTimeOut,LoginPage.XPATH_USERNAME);
        appiumUtil.waitForElementToLoad(elementTimeOut,LoginPage.XPATH_PASSWORD);
        appiumUtil.waitForElementToLoad(elementTimeOut,LoginPage.XPATH_LOGIN);
        logger.info("app首页元素加载完毕");

    }

}
