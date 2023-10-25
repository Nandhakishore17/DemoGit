package StepDefinition;

import Atit_Base_Pom.Pom;
import RunnerClass.Atit_Runner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import java.net.URL;

import static Atit_Base_Pom.Base.*;

public class DataSci_AI_Step {

    public static WebDriver driver= Atit_Runner.driver;

    Pom po = new Pom(driver);
    @Given("Launching the URL")
    public void launching_the_url() {
        url(driver,"https://atit.org.in/index.html");
        maximize(driver);
    }
    @When("Clicking the course module")
    public void clicking_the_course_module() {
click(po.getCourses());
    }
    @When("Selecting the Datascience&AI")
    public void selecting_the_datascience_ai() {
       click(po.getDataScience_AI());
    }
    @When("Clicking the AI Training")
    public void clicking_the_ai_training() {
     click(po.getAI_Training());
    }
    @When("Clicking the About")
    public void clicking_the_about() throws InterruptedException {
       click(po.getAbout());
       Thread.sleep(3000);
       scroll(driver,po.getAI_Homepage_Training());
    }
    @When("Clicking the Curriculum")
    public void clicking_the_curriculum() throws InterruptedException {
        click(po.getCurriculum());
Thread.sleep(1000);

click(po.getBasics_of_Linux());
   Thread.sleep(1000);
        click(po.getBasics_of_Linux());
Thread.sleep(1000);
   click(po.getLearn_AWS_Cloud());
    Thread.sleep(1000);
        click(po.getLearn_AWS_Cloud());
Thread.sleep(1000);
        click(po.getInfra_as_Code_Terraform());
    Thread.sleep(1000);
        click(po.getInfra_as_Code_Terraform());
        Thread.sleep(1000);
        click(po.getDocker());
        Thread.sleep(1000);
        click(po.getDocker());
        Thread.sleep(1000);
        scroll(driver,po.getBasics_of_Linux());
        Thread.sleep(1000);
        click(po.getDevOps_GIT_ANSIBLE_JENKINS());
        Thread.sleep(1000);
        click(po.getDevOps_GIT_ANSIBLE_JENKINS());
        Thread.sleep(1000);

        click(po.getPrometheus_Grafana());
        scroll(driver,po.getAI_Homepage_Training());
    }

    @When("Clicking the Training Options")
    public void clicking_the_training_options() throws InterruptedException {
       click(po.getTraining_Options());
scroll(driver,po.getSmall_Training_Options());
Thread.sleep(1000);
click(po.getOnline_Class());
Thread.sleep(1000);
       click(po.getOffline_Class());
parentHandle(driver);
    }

    @When("Clicking the For Corporates")
    public void clicking_the_for_corporates() {
        click(po.getFor_Corporates());
        scroll(driver,po.getAI_Homepage_Training());
    }
    @When("Clicking the Testimonals")
    public void clicking_the_testimonals() {
       click(po.getTestimonials());
       scroll(driver,po.getAI_Homepage_Training());
    }







}
