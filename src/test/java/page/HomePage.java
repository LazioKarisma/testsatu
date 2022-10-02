package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//p[.='Sekolah QA']")
	private WebElement sekolahQAName;

	@FindBy(xpath = "//h1[contains(text(), 'PT CC')]")
	private WebElement selectCompany;
	
	@FindBy(xpath = "//*[@id='root']/div[@class='DashboardPage_container__2bMGZ']/div[@class='DashboardPage_DashboardPage__flex__2rA7e']/a[@href='/companies/63370d193d90ac5242015a30/teams/63370e6e9789eabfd569c02a']")
	private WebElement selectCard;
	
	private void clickElement(WebElement element) {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].click();", element);
	}

	public void pressCompany() {
		selectCompany.click();
	}

	public String teamPageText() {
		return sekolahQAName.getText();
	}
	
	public void pressCard() {
		selectCard.click();
	}

}
