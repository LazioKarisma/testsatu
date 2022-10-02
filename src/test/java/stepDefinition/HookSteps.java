package stepDefinition;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import page.BoardPage;
import page.HomePage;

public class HookSteps {
    protected static WebDriver driver;
    
    @Before
    public void setup(){
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\laziokh\\AppData\\Local\\Google\\Chrome\\User Data\\");
        chrome_options.addArguments("--profile-directory=Default");
        System.setProperty("webdriver.chrome.driver", "C:/Users/laziokh/Downloads/chromedriver.exe");
        driver = new ChromeDriver(chrome_options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
    
    @Given("^User is landing in homepage$")
    public void user_is_landing_in_homepage() throws InterruptedException {
    	 HomePage homepage1 = new HomePage(driver);
         driver.get("https://staging.cicle.app/signin");
         Thread.sleep(2000);
         homepage1.pressCompany();
         Thread.sleep(2000);
       //  Assert.assertEquals("PT CC",homepage1.teamPageText());
    }
    
    @When("^User clicks Team icon$")
    public void ClicksTeamIcon() throws InterruptedException{
	   	 HomePage homepage2 = new HomePage(driver);
	     Thread.sleep(2000);
	     homepage2.pressCard();
    }
    
    @When("^User clicks Board icon$")
    public void AddListBoard() throws InterruptedException{
	   	 BoardPage boardPage = new BoardPage(driver);
	     Thread.sleep(2000);
	     boardPage.pressAddListBoard();
    }
    
    @And("^And User clicks Group Chat icon$")
    public void AddGroupChat() throws InterruptedException{
	   	 BoardPage boardPage2 = new BoardPage(driver);
	     Thread.sleep(2000);
	     boardPage2.pressGroupChat();
         Thread.sleep(2000);
    }
    
    
    
    @When("User clicks Group Chat icon")
    public void user_clicks_group_chat_icon() throws InterruptedException {
    	 BoardPage boardPage1 = new BoardPage(driver);
	     Thread.sleep(2000);
	     boardPage1.pressGroupChat();
         Thread.sleep(2000);
    }
    


    
}
