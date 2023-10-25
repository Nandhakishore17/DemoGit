package StepDefinition;

import Atit_Base_Pom.Pom;
import RunnerClass.Atit_Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static Atit_Base_Pom.Base.*;
import static Atit_Base_Pom.Base.click;

public class DataScienceTraining_Step {

    public static WebDriver driver= Atit_Runner.driver;

Pom nk = new Pom(driver);
    @Given("Launching the URL")
    public void launching_the_url() {
        url(driver,"https://atit.org.in/index.html");
        maximize(driver);
    }

    @When("Clicking the course module")
    public void clicking_the_course_module() {
        click(nk.getCourses());
    }
    @When("Selecting the Datascience&AI")
    public void selecting_the_datascience_ai() {
        click(nk.getDataScience_AI());
    }

    @When("Selecting the Datascience Training")
    public void selectingTheDatascienceTraining() throws InterruptedException {
        click(nk.getDataSci_Training());
        Thread.sleep(1000);

        click(nk.getBasics_of_Linux());
        Thread.sleep(1000);
        click(nk.getBasics_of_Linux());
        Thread.sleep(1000);
        click(nk.getLearn_AWS_Cloud());
        Thread.sleep(1000);
        click(nk.getLearn_AWS_Cloud());
        Thread.sleep(1000);
        click(nk.getInfra_as_Code_Terraform());
        Thread.sleep(1000);
        click(nk.getInfra_as_Code_Terraform());
        Thread.sleep(1000);
        click(nk.getDocker());
        Thread.sleep(1000);
        click(nk.getDocker());
        Thread.sleep(1000);
        scroll(driver,nk.getBasics_of_Linux());
        Thread.sleep(1000);
        click(nk.getDevOps_GIT_ANSIBLE_JENKINS());
        Thread.sleep(1000);
        click(nk.getDevOps_GIT_ANSIBLE_JENKINS());
        Thread.sleep(1000);

        click(nk.getPrometheus_Grafana());
        scroll(driver,nk.getAI_Homepage_Training());
    }







}
