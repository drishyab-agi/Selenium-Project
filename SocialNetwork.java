package MavenProject.MavenProject;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class SocialNetwork {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00005737\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://elearningm1.upskills.in/");
		
		//maximize window
		driver.manage().window().maximize();
		
		/* //signup
		driver.findElement(By.xpath("//*[@id=\"login-block\"]/div/ul/li[1]/a")).click();
		
		 //register as student
		driver.findElement(By.xpath("//*[@id=\"registration_firstname\"]")).sendKeys("roy");
		driver.findElement(By.xpath("//*[@id=\"registration_lastname\"]")).sendKeys("s");
		driver.findElement(By.xpath("//*[@id=\"registration_email\"]")).sendKeys("roy@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("roy");
		driver.findElement(By.id("pass1")).sendKeys("roy123");
		driver.findElement(By.id("pass2")).sendKeys("roy123");
		driver.findElement(By.xpath("//*[@id=\"registration_phone\"]")).sendKeys("8553464226");
		driver.findElement(By.id("registration_submit")).click();
		System.out.println("Registered sucessfully"); 
		
		//logout
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.id("logout_button")).click();
		System.out.println("Student logged out");	*/
		
		//login
		driver.findElement(By.id("login")).sendKeys("roy");
		driver.findElement(By.id("password")).sendKeys("roy123");
		driver.findElement(By.id("form-login_submitAuth")).click();
		System.out.println("Logged in sucessfully");
		
		//my courses
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[2]/a")).click();
		
		
		//browse course
		driver.findElement(By.xpath("//*[@id=\"coursesCollapse\"]/div/ul/li[3]/a")).click();
		System.out.println("Navigating the courses"); 
		//Java script executor for scrolling down
		JavascriptExecutor js = (JavascriptExecutor) driver;    
		js.executeScript("window.scrollBy(0,3000)");
			
		//navigate to page 2
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[4]/nav/ul/li[2]/a")).click();
		
		//subscribe to course
	 	js.executeScript("window.scrollBy(0,500)");
	 	//driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[3]/div[4]/div/div[2]/div[4]/div/a")).click();
		System.out.println("Course subscribed sucessfully");
		//System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-info']")).getText());
		
		
		Thread.sleep(1000);
  		//personal agenda
	  	driver.findElement(By.xpath("//*[@title='Personal agenda']")).click();
	  	driver.findElement(By.xpath("//*[@data-date='2021-12-09']")).click();
	  	driver.findElement(By.id("title")).sendKeys("Meeting");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("/html/body/div[4]/div[11]/div/button/span")).click();
		System.out.println("Agenda has been set");		

		/*//check certificates
		
		//drop down
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[2]/li[2]/ul/li[4]/a")).click();		
		System.out.println("Checking certificates");
		System.out.println(driver.findElement(By.xpath("//*[@class='alert alert-warning']")).getText());*/
		
		Thread.sleep(1000);
		//check progress
	  	driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[4]/a")).click();
	  	System.out.println("Progress checked");
	
		
		//social network
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		
		//message
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[2]/a")).click(); 
		
		//compose message
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/div[1]/a[1]/img")).click(); 
		
		driver.findElement(By.xpath("//*[@id=\"compose_message\"]/fieldset/div[1]/div[1]/span/span[1]/span/ul/li/input")).sendKeys("raju");
		Thread.sleep(3000);
		List<WebElement> listOfElements=driver.findElements(By.xpath("//*[@id=\"select2-compose_message_users-results\"]/li"));
		for (WebElement webElement : listOfElements) {
			if(webElement.getText().trim().equals("Savitha Kanakaraju (savitha)")){
				webElement.click();
				break;
			}
		}
		Thread.sleep(3000);
		
		WebElement message = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(message);
		driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("My Presentation Report");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("compose_message_title")).sendKeys("Presentation Report");
		
		driver.findElement(By.xpath("//*[@id=\"file-descrtiption\"]")).sendKeys("My Presentation Report");
		driver.findElement(By.xpath("//*[@id=\"compose_message_compose\"]")).click();
		
		//outbox
		driver.findElement(By.xpath("//*[@id=\"toolbar\"]/div/div[1]/a[2]/img")).click(); 
		
		//selectall
		driver.findElement(By.xpath("//*[@id=\"form_message_outbox_id\"]/table/tbody/tr/td[1]/div/div[1]/a[1]")).click();
		
		//delete
		driver.findElement(By.xpath("//*[@id=\"form_message_outbox_id\"]/table/tbody/tr/td[1]/div/div[2]/button[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"form_message_outbox_id\"]/table/tbody/tr/td[1]/div/div[2]/ul/li/a")).click();
		
		//accept alert
		//driver.switchTo().alert().accept();
		
		//dismiss alert
		driver.switchTo().alert().dismiss();

		
		//unselectall
		driver.findElement(By.xpath("//*[@id=\"form_message_outbox_id\"]/table/tbody/tr/td[1]/div/div[1]/a[2]")).click();
	
		
		//Invitations
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();// social network
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[3]/a")).click();// to click invitations
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div[2]/div[2]/div/a")).click();// to find friends
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();// to select option
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// to select user
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click(); // click on submit button
		
		//send invitation
		driver.findElement(By.xpath("//*[@class='btn btn-default btn-sm btn-to-send-invitation']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"content_invitation_id\"]")).sendKeys("Hi, accept my invitation");
		driver.findElement(By.id("btn-send-invitation")).click();
		System.out.println("Invitation sent sucessfully");
		Thread.sleep(1000);
		
		
		//my shared profile
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		driver.findElement(By.id("social_wall_main_social_wall_new_msg_main")).sendKeys("Hello Everyone, How's the day ?");
		driver.findElement(By.id("social_wall_main_wall_post_button")).click();
		System.out.println("Posted on social wall"); 
		
		//Friends
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();//social network
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[5]/a")).click();//friennds
		driver.findElement(By.xpath("//*[@id=\"wallMessages\"]/div[2]/div/a")).click();//find friends
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();//select option
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// user
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click();//search
		
	
		//social groups
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[6]/a")).click(); 
		//driver.findElement(By.xpath("//*[@id=\"tab_browse-1\"]/div[2]/div[1]/div/div/div[2]/a")).click(); 
		
		//see members
		//driver.findElement(By.xpath("//*[@id=\"tabs2\"]")).click();
		
		//my groups
		driver.findElement(By.xpath("//*[@id=\"tab_browse3\"]")).click();
		
		//groups
		driver.findElement(By.xpath("//*[@id=\"tab_browse-3\"]/div[2]/div[1]/div/div/div[2]/div[1]/h5/a")).click();
		
		//see members
		driver.findElement(By.xpath("//*[@id=\"tabs2\"]")).click();
		
		//you should create topic
		driver.findElement(By.xpath("//*[@id=\"cm-content\"]/div/div[2]/div/div/div[2]/div/div[1]/a")).click();
		Thread.sleep(1000);

		WebElement txtTitle = driver.findElement(By.xpath("//*[@id=\"form_title\"]"));
		

		Actions builder = new Actions(driver);
		Action actions = builder
			.moveToElement(txtTitle) 
			.click() 
			.sendKeys(txtTitle, "Selenium") 
			.build();
			actions.perform();
			
		WebElement topicMessage = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(topicMessage);
		driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Selenium Course");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//*[@id=\"form_submit\"]")).click();
		
		//social network
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
		
		 //search
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();//social network
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[7]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("ajeya");//user or group name
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();//select option
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[2]/a")).click();// user
		driver.findElement(By.xpath("//*[@id=\"search_user_submit\"]")).click();//search
		Thread.sleep(1000);
		
		//myfiles
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[8]/a")).click();
		
		//personal data
		driver.findElement(By.xpath("//*[@id=\"sn-sidebar-collapse\"]/div/ul/li[9]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"_block\"]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"personal-data-list-Friends\"]/u")).click();
		driver.findElement(By.xpath("//*[@id=\"personal-data-list-Events\"]/u")).click();
		driver.findElement(By.xpath("//*[@id=\"personal-data-list-GradebookCertificate\"]/u")).click();
				
		//logout
		driver.findElement(By.cssSelector(".dropdown-toggle")).click();
		driver.findElement(By.id("logout_button")).click();
		System.out.println("Student logged out");
		
	}
}
