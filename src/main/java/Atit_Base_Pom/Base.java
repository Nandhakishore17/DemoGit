package Atit_Base_Pom;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class Base {

    public  static WebDriver driver;
    public static void url(WebDriver driver, String url) {
        driver.get(url);
    }

    public static void maximize(WebDriver driver) {
        driver.manage().window().maximize();
    }

    public static void click(WebElement cl){
        cl.click();
    }
    public static void javaclick(WebElement jc){
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", jc);
    }
    public static void sendkeys(WebElement sendvalue,String value) {
        sendvalue.sendKeys(value);
    }

    public static void scroll(WebDriver driver,WebElement e) {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()", e);

    }

    public static void Towait(WebDriver driver,int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }

    public static void parentHandle(WebDriver driver) {
        String windowHandle = driver.getWindowHandle();
        driver.switchTo().window(windowHandle);
    }




}
