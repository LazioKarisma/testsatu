package page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BoardPage {
	WebDriver driver;

	public BoardPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='TeamPage_container__2m61r']/div[@class='TeamPage_rowBox__zylkg']/div[@class='TeamPage_colBox__1rz7F']/a[@href='/companies/63370d193d90ac5242015a30/teams/63370e6e9789eabfd569c02a/boards/63370e6e9789eabfd569c02d']")
	private WebElement addListBoard;
	@FindBy(xpath = "//div[@class='TeamPage_container__2m61r']/div[@class='TeamPage_rowBox__zylkg']/div[@class='TeamPage_colBox__1rz7F']/a[@href='/companies/63370d193d90ac5242015a30/teams/63370e6e9789eabfd569c02a/group-chats/63370e6e9789eabfd569c02e']")
	private WebElement addGroupChat;
	
	
	public void pressAddListBoard() {
		addListBoard.click();
	}
	
	public void pressGroupChat() {
		addGroupChat.click();
	}

}
