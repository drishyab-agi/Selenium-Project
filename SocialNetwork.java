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
		
		/*//login
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
		System.out.println("Student logged out");*/
		
		//Teacher Part
		
		/* //sign up as a teacher
		 driver.findElement(By.xpath("//*[text()=' Sign up! ']")).click();
		 driver.findElement(By.xpath("//*[@id=\"status-group\"]/div[1]/div[2]")).click();
		 driver.findElement(By.id("registration_firstname")).sendKeys("Teju");
		 driver.findElement(By.id("registration_lastname")).sendKeys("Reddy");
		 driver.findElement(By.id("registration_email")).sendKeys("teju@gmail.com");
		 driver.findElement(By.id("username")).sendKeys("teju81");
		 driver.findElement(By.id("pass1")).sendKeys("Teju@1234");
		 driver.findElement(By.id("pass2")).sendKeys("Teju@1234");
		 driver.findElement(By.id("registration_phone")).sendKeys("6763846193");
		 driver.findElement(By.id("registration_submit")).click();
		 
		 //logout
		 driver.findElement(By.className("dropdown-toggle")).click();
		 driver.findElement(By.id("logout_button")).click();*/
		 
		 //login
		 driver.findElement(By.id("login")).sendKeys("teju81");
		 driver.findElement(By.id("password")).sendKeys("Teju@1234");
		 driver.findElement(By.id("form-login_submitAuth")).click();
		 
		 //Javascript for scrolling down
		 JavascriptExecutor js13 = (JavascriptExecutor) driver;
		 js13.executeScript("window.scrollBy(0,2000)");	
		 
		 //Creating a new course
		 driver.findElement(By.xpath("//*[text()='Create a course']")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 //Already existing course
		 driver.findElement(By.id("title")).sendKeys("Testing");
		 driver.findElement(By.id("add_course_submit")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-danger")).getText());
		 driver.findElement(By.xpath("//*[@id='title']")).clear();
		 
		 //Adding new course
		 driver.findElement(By.id("title")).sendKeys("Java Basics Tutorial3");
		 driver.findElement(By.id("add_course_submit")).click();
		 
		 //driver.findElement(By.xpath("//*[title='My courses']")).click();
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 System.out.println(driver.findElement(By.className("help-course")).getText());
		 
		 //creating description
		 driver.findElement(By.xpath("//img[@title='Course description']")).click();
		 driver.findElement(By.xpath("//img[@title='Description']")).click();
		 driver.findElement(By.id("course_description_title")).sendKeys("Java Basics22");
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 WebElement course = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']")); 
		 driver.switchTo().frame(course);
		 //System.out.println("switch to frame");
		 JavascriptExecutor js1 = (JavascriptExecutor) driver;
		 js1.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("java course on arrays, strings and exceptions");
		 //System.out.println("sending message");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.cssSelector(".btn.btn-primary")).click(); 
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 //creating learning path
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Learning path']")).click();
		 driver.findElement(By.xpath("//*[@title='Create new learning path']")).click();
		 driver.findElement(By.id("lp_add_lp_name")).sendKeys("Strings");
		 driver.findElement(By.id("lp_add_submit")).click();
		 
		 JavascriptExecutor js9 = (JavascriptExecutor) driver;
		 js9.executeScript("window.scrollBy(0,1000)");
		 
		 //agenda
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Agenda']")).click();
		 driver.findElement(By.xpath("//*[@data-date='2021-12-10']")).click();
		 driver.findElement(By.xpath("//*[@id='title']")).sendKeys("Python course");
		 WebElement agenda = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		 driver.switchTo().frame(agenda);
		 JavascriptExecutor js11 = (JavascriptExecutor) driver;
		 js11.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Python course from 10:00 am to 11:00 am");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.cssSelector(".ui-button.ui-widget.ui-state-default.ui-corner-all.ui-button-text-only")).click();
		 
		 JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js2.executeScript("window.scrollBy(0,500)");
		 
		 //Add glossary
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Glossary']")).click();
		 driver.findElement(By.xpath("//img[@title='Add new glossary term']")).click();
		 driver.findElement(By.id("glossary_title")).sendKeys("Abstract method");
		 WebElement glossary = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		 driver.switchTo().frame(glossary);
		 JavascriptExecutor js10 = (JavascriptExecutor) driver;
		 js10.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("A method that has no implementation");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("glossary_SubmitGlossary")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		//Adding links
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 driver.findElement(By.xpath("//img[@title='Links']")).click();
		 driver.findElement(By.xpath("//*[@title='Add a link']")).click();
		 driver.findElement(By.id("link_url")).sendKeys("www.java.com/");
		 driver.findElement(By.id("link_title")).sendKeys("JavaTutorials online website");
		 driver.findElement(By.id("link_submitLink")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		 
		 //create note
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js3 = (JavascriptExecutor) driver;
		 js3.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Notebook']")).click();
		 driver.findElement(By.xpath("//img[@title='Add new note in my personal notebook']")).click();
		 driver.findElement(By.id("note_title")).sendKeys("courses");
		 WebElement notes = driver.findElement(By.xpath("//*[@class='cke_wysiwyg_frame cke_reset']"));
		 driver.switchTo().frame(notes);
		 JavascriptExecutor js5 = (JavascriptExecutor) driver;
		 js5.executeScript("window.scrollBy(0,2000)");
		 driver.findElement(By.xpath("//*[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")).sendKeys("Update Java Basics Tutorial3 course");
		 driver.switchTo().defaultContent();
		 driver.findElement(By.id("note_SubmitNote")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		 
		 //creating new project
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js4 = (JavascriptExecutor) driver;
		 js4.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Projects']")).click();
		 driver.findElement(By.xpath("//img[@title='Create a new project']")).click();
		 driver.findElement(By.id("add_blog_blog_name")).sendKeys("Automation Testing");
		 driver.findElement(By.id("add_blog_blog_subtitle")).sendKeys("Automate a website using Selenium");
		 driver.findElement(By.id("add_blog_submit")).click();
		 
		 //Download reports
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js6 = (JavascriptExecutor) driver;
		 js6.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Reporting']")).click();
		 driver.findElement(By.xpath("//img[@title='Report on resource']")).click();
		 driver.findElement(By.xpath("//img[@title='CSV export']")).click();
		 
		 //create backup
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js7 = (JavascriptExecutor) driver;
		 js7.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Backup']")).click();
		 driver.findElement(By.linkText("Create a backup")).click();
		 driver.findElement(By.id("create_backup_form_submit")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-success")).getText());
		 driver.findElement(By.cssSelector(".btn.btn-primary.btn-large")).click();
		 
		 //delete the course
		 driver.findElement(By.xpath("//*[@title='My courses']")).click();
		 driver.findElement(By.linkText("Java Basics Tutorial3")).click();
		 JavascriptExecutor js8 = (JavascriptExecutor) driver;
		 js8.executeScript("window.scrollBy(0,2000)");
		 
		 driver.findElement(By.xpath("//img[@title='Backup']")).click();
		 driver.findElement(By.linkText("Completely delete this course")).click();
		 driver.findElement(By.linkText("Yes")).click();
		 
		 //Back to home page
		 driver.findElement(By.linkText("Back to Home Page.")).click();
		 
		//Reporting
		driver.findElement(By.linkText("Reporting")).click();
		driver.findElement(By.id("search_user_keyword")).sendKeys("005723");	
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/button/div/div/div")).click();
			
		//selecting active days
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[1]/input")).sendKeys("active");
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[2]/div[1]/div/div/div[2]/ul/li[1]/a/span")).click();
			
		//selecting in-active days as 5
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[3]/div[1]/div/button/div/div/div")).click();
		driver.findElement(By.xpath("//*[@id=\"search_user\"]/fieldset/div[3]/div[1]/div/div/div[2]/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul[1]/li[5]/a")).click();
			
		//social network wall messsage
		driver.findElement(By.id("social_wall_main_social_wall_new_msg_main")).sendKeys("Hello Everyone, How's the day ?");
		driver.findElement(By.id("social_wall_main_wall_post_button")).click();
		System.out.println("Posted on social wall"); 
		 
		 //logout
		 driver.findElement(By.className("dropdown-toggle")).click();
		 driver.findElement(By.id("logout_button")).click();
		 
		 //login using different password
		 driver.findElement(By.id("login")).sendKeys("teju81");
		 driver.findElement(By.id("password")).sendKeys("Teju@12");
		 driver.findElement(By.id("form-login_submitAuth")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-danger")).getText());
		 
		 //Lost password
		 driver.findElement(By.linkText("I lost my password")).click();
		 driver.findElement(By.id("lost_password_user")).sendKeys("teju@gmail.com");
		 driver.findElement(By.id("lost_password_submit")).click();
		 System.out.println(driver.findElement(By.cssSelector(".alert.alert-info")).getText());
		
		
		
	}
}
