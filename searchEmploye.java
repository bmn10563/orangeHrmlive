package orangHrmPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchEmploye {
	WebDriver driver;
	public  searchEmploye(WebDriver driver) {
		this.driver= driver;
	}
	
	By pim= By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
	//By information = By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/a");
	By firstNameSearch= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input");
	By searchBtn= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]");
	By resetBtn= By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]");
	
	public void clickPim() {
		driver.findElement(pim).click();
	} 

	
	public void enterFiatSearch(String asd) {
		driver.findElement(firstNameSearch).clear();
		driver.findElement(firstNameSearch).sendKeys(asd);
	}
	public void clickSearch() {
		
		driver.findElement(searchBtn).click();
	}
	
	
}
