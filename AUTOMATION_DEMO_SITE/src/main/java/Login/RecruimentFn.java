package Login;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruimentFn  {

	@FindBy(linkText = "Recruitment")
	public static WebElement RecuirmentTab;
	
	@FindBy(linkText = "Vacancies")
	public static WebElement vacancytab;
	
	@FindBy(xpath="//select[@id='vacancySearch_jobTitle']")
	public static WebElement  jobtitle;

	@FindBy(xpath="//input[@id='btnSrch']")
	public static WebElement searchbtn;
	
	
    @FindBy(xpath="//td[@colspan='5']")
    public static WebElement Records;
    
    @FindBy(xpath="//input[@id='btnAdd']")
    public static WebElement addbtn;
	
    @FindBy(xpath="//select[@name='addJobVacancy[jobTitle]']")
    public static WebElement job_req;
	
    @FindBy(xpath="//input[@name='addJobVacancy[name]']")
    public static WebElement vacant;
    
    @FindBy(xpath="//input[@id='addJobVacancy_hiringManager']")
    public static WebElement hiringmanger;
    
    @FindBy(xpath=" //input[@id='addJobVacancy_noOfPositions']")
    public static WebElement no_position;
    
    @FindBy(xpath="//*[@id='addJobVacancy_description']")
    public static WebElement decription;
    
    @FindBy(xpath="//input[@name='addJobVacancy[status]']")
    public static WebElement status;
    
    @FindBy(xpath="//input[@value='on']")
    public static WebElement Rss;
    
    @FindBy(xpath="//input[@name='btnSave']")
    public static WebElement Savebtn;
	
    @FindBy(xpath="//input[@id='btnBack']")
    public static WebElement backbtn;
    
    @FindBy(linkText="Recruitment")
    public static WebElement Recruitmenttab;
    
    @FindBy(linkText = "Candidates")
    public static WebElement Candidatestab;
    
    @FindBy(xpath="//input[@id='btnAdd']")
    public static WebElement Addbtn;
    
    @FindBy(xpath="//*[@id='addCandidate_firstName']")
    public static WebElement firstName;
    
    @FindBy(xpath="//input[@id='addCandidate_middleName']")
    public static WebElement middleName;
    
    @FindBy(xpath="//input[@id='addCandidate_lastName']")
    public static WebElement lastName;
    
    @FindBy(xpath="//*[@id='addCandidate_email']")
    public static WebElement email;
    
    @FindBy(xpath="//*[@id='addCandidate_contactNo']")
    public static WebElement contactNo;
    
    @FindBy(xpath="//*[@id='addCandidate_vacancy']")
    public static WebElement demo;
    
    @FindBy(xpath="//input[@name='addCandidate[resume]']")
    public static WebElement resume ;
    
    @FindBy(xpath="//*[@id='addCandidate_keyWords']")
    public static WebElement keyWords;
    
    @FindBy(xpath="//*[@id='addCandidate_comment']")
    public static WebElement comment ;
    
    @FindBy(xpath="//input[@id='btnSave']")
    public static WebElement savebtn;
    
    
    @FindBy(xpath="//input[@id='btnBack']")
    public static WebElement Backbtn;
    
    
    @FindBy(xpath="//select[@id='candidateSearch_jobTitle']")
    public static WebElement JobTitle;
    
    @FindBy(xpath="//input[@id='btnSrch']")
    public static WebElement Searchbtn;
    
    @FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[1]")
    public static WebElement Result;
    
    @FindBy(linkText ="Download")
    public static WebElement Download;

}

