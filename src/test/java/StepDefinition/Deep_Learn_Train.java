package StepDefinition;

import Atit_Base_Pom.Pom;
import RunnerClass.Atit_Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import javafx.scene.input.ClipboardContent;
import org.checkerframework.checker.units.qual.N;
import org.openqa.selenium.WebDriver;

import static Atit_Base_Pom.Base.*;
import static Atit_Base_Pom.Base.click;

public class Deep_Learn_Train {  public static WebDriver driver= Atit_Runner.driver;

    Pom NaNi = new Pom(driver);
    @Given("Launching the URL")
    public void launching_the_url() {
        url(driver,"https://atit.org.in/index.html");
        maximize(driver);
    }

    @When("Clicking the course module")
    public void clicking_the_course_module() {
        click(NaNi.getCourses());
    }
    @When("Selecting the Datascience&AI")
    public void selecting_the_datascience_ai() {
        click(NaNi.getDataScience_AI());
    }


    @When("Clicking the Deep Learning Training")
    public void clickingTheDeepLearningTraining() throws InterruptedException {
        click(NaNi.getDeep_Learning_Training());
        Thread.sleep(1000);

        click(NaNi.getBasics_of_Linux());
        Thread.sleep(1000);
        click(NaNi.getBasics_of_Linux());
        Thread.sleep(1000);
        click(NaNi.getLearn_AWS_Cloud());
        Thread.sleep(1000);
        click(NaNi.getLearn_AWS_Cloud());
        Thread.sleep(1000);
        click(NaNi.getInfra_as_Code_Terraform());
        Thread.sleep(1000);
        click(NaNi.getInfra_as_Code_Terraform());
        Thread.sleep(1000);
        click(NaNi.getDocker());
        Thread.sleep(1000);
        click(NaNi.getDocker());
        Thread.sleep(1000);
        scroll(driver,NaNi.getBasics_of_Linux());
        Thread.sleep(1000);
        click(NaNi.getDevOps_GIT_ANSIBLE_JENKINS());
        Thread.sleep(1000);
        click(NaNi.getDevOps_GIT_ANSIBLE_JENKINS());
        Thread.sleep(1000);

        click(NaNi.getPrometheus_Grafana());
        scroll(driver,NaNi.getAI_Homepage_Training());
    }
}
