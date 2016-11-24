package run;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pagesObjets.LoginPage;
import pagesObjets.SendMailPage;

public class Run {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.yandex.by/");
		driver.manage().window().maximize();
		
		LoginPage loginMail = new LoginPage(driver);
			if(	loginMail.loginAs("testuser2710", "2710user").equals("Авторизация"))
			{
				System.out.println("Chek your login and password");
			}
			else{
				SendMailPage sandmail = new SendMailPage(driver);
				sandmail.writeTheLatter("some@yandex.ru", "some", "Helo!!!");
				System.out.println("The latter was sended");
			}

	}

}
