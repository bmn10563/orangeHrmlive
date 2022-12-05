package orangHrmTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import orangHrmPage.addEmployee;
import orangHrmPage.logForm;
import orangHrmPage.searchEmploye;
import orangHrmPage.searchEmployee;


public class testTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\javasource\\new driver\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		   
		  //login form 
		   logForm log= new logForm(driver);
		   log.enterUserName("Admin");
		   log.enterPassword("admin123");
		   log.clickBtn();
		   
		   // go to search page
		   searchEmploye search1= new searchEmploye(driver);
			  
			  search1.clickPim();
			  Thread.sleep(3000); 
			  search1.enterFiatSearch("maryam");
			  search1.clickSearch();
			  Thread.sleep(3000); 
			  
			  
		   //go to add employee
		   addEmployee add= new addEmployee(driver);
		  // add.clickPim();
		   add.clickaddEmployee();
		  add.enterFirstname("bb");
		  add.enterLastName("gggggggggggggg");
		  add.enterMiddleName("44444");
		 // add.clickImage("C:\\Users\\43660\\Desktop\\madarek maryam\\m.jpg");
		 // System.out.println("this is "+ add.checkempId());
		  add.clickSave();
		  Thread.sleep(3000); 
		 
		  //go to search form
		  searchEmploye search= new searchEmploye(driver);
		 // search.clickInformation();
		  Thread.sleep(2000);
		  //search.clickemployeeList();
		//  search.enterFiatSearch("bb");
		//  search.clickSearch();
			  
		 
	}
	

}
