package Atit_Base_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.PrivateKey;

public class Pom {

    public static WebDriver driver;

    @FindBy(xpath = "(//a[normalize-space(text())='Courses'])[1]")
    private WebElement courses;

@FindBy(xpath = "(//li[@class='menu-item-has-children'])[4]")
private WebElement DataScience_AI;

@FindBy(xpath = "(//a[@href='artificial-intelligence-training.html'])[1]")
    private WebElement AI_Training;

@FindBy(xpath = "(//a[.='About'])[1]")
private WebElement About;

@FindBy(xpath = "//h1[@class='text-40 lh-14 text-white  lg:pr-0']")
private WebElement AI_Homepage_Training;

@FindBy(xpath = "//a[@href='#curriculum']")
private WebElement Curriculum;

@FindBy(xpath = "//span[.='Basics of Linux']")
private WebElement Basics_of_Linux;

@FindBy(xpath = "//span[.='Learn AWS Cloud']")
private WebElement Learn_AWS_Cloud;

    @FindBy(xpath = "//span[.='Infra as Code - Terraform']")
    private WebElement Infra_as_Code_Terraform;

    @FindBy(xpath = "//span[.='Docker']")
    private WebElement Docker;

    @FindBy(xpath = "//span[.='DevOps (GIT | ANSIBLE | JENKINS)']")
    private WebElement DevOps_GIT_ANSIBLE_JENKINS;


    @FindBy(xpath = "//span[.='Prometheus & Grafana']")
    private WebElement Prometheus_Grafana;

@FindBy(xpath = "//a[.='Training Options']")
private WebElement Training_Options;

@FindBy(xpath = "(//a[.='Join Now'])[1]")
private WebElement Online_Class;

@FindBy(xpath = "(//a[.='Join Now'])[2]")
private WebElement Offline_Class;

@FindBy(xpath = "(//h2[@style='text-align:center; margin-top: 30px;'])[1]")
private WebElement Small_Training_Options;

@FindBy(xpath = "//a[.='For Corporates']")
private WebElement For_Corporates;

@FindBy(xpath = "//a[.='Testimonials']")
private WebElement Testimonials;

@FindBy(xpath = "(//a[.=' Deep Learning Training'])[1]")
private WebElement Deep_Learning_Training;


@FindBy(xpath = "(//a[.=' Data Science Training'])[1]")
private WebElement DataSci_Training;








public Pom(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public WebElement getCourses() {
        return courses;
    }

    public WebElement getDataScience_AI() {
        return DataScience_AI;
    }

    public WebElement getAI_Training() {
        return AI_Training;
    }

    public WebElement getAbout() {
        return About;
    }

    public WebElement getAI_Homepage_Training() {
        return AI_Homepage_Training;
    }

    public WebElement getCurriculum() {
        return Curriculum;
    }

    public WebElement getBasics_of_Linux() {
        return Basics_of_Linux;
    }

    public WebElement getLearn_AWS_Cloud() {
        return Learn_AWS_Cloud;
    }

    public WebElement getInfra_as_Code_Terraform() {
        return Infra_as_Code_Terraform;
    }

    public WebElement getDocker() {
        return Docker;
    }

    public WebElement getDevOps_GIT_ANSIBLE_JENKINS() {
        return DevOps_GIT_ANSIBLE_JENKINS;
    }

    public WebElement getPrometheus_Grafana() {
        return Prometheus_Grafana;
    }

    public WebElement getTraining_Options() {
        return Training_Options;
    }

    public WebElement getOnline_Class() {
        return Online_Class;
    }

    public WebElement getOffline_Class() {
        return Offline_Class;
    }

    public WebElement getSmall_Training_Options() {
        return Small_Training_Options;
    }

    public WebElement getFor_Corporates() {
        return For_Corporates;
    }

    public WebElement getTestimonials() {
        return Testimonials;
    }

    public WebElement getDeep_Learning_Training() {
        return Deep_Learning_Training;
    }

    public WebElement getDataSci_Training() {
        return DataSci_Training;
    }


}
