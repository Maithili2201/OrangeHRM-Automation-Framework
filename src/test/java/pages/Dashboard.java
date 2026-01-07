package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class Dashboard extends BasePage{

	private final By btnasignleave = By.xpath("//button[@title='Assign Leave']");
	private final By btnleavelist = By.xpath("//button[@title='Leave List']");

	public Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public boolean assignLeaveIsDisplayes() {
		return waitForVisible(btnasignleave);
		
	}
	public boolean leaveListIsDisplayes() {
		return waitForVisible(btnleavelist);
		
	}

}
