package RunnerClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\logar\\IdeaProjects\\ATIT\\src\\test\\java\\FeatureFile\\AI Training.feature",
        glue = "StepDefinition"

)
public class Atit_Runner {

    public static WebDriver driver;

    @BeforeClass
    public static void start(){
        ChromeOptions nk = new ChromeOptions();

        nk.addArguments("--remote-allow-orgins=*");

        driver = new ChromeDriver(nk);

    }



}
