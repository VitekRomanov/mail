package pagesObjets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

public class SendMailPage {
	
	WebDriver driver;
	
	@FindBy(xpath=".//*[@id='nb-1']/body/div[2]/div[4]/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div/a")
	WebElement writeLatter;
	
	@FindBy(xpath=".//*[@id='nb-1']/body/div[2]/div[4]/div/div[2]/div[3]/div[4]/div/div[1]/div[2]/div[1]/div/div[1]/label/div[3]/div")
	WebElement address;
	
	@FindBy(name="subj")
	WebElement tema;
	
	@FindBy(css=".cke_wysiwyg_div.cke_reset.cke_enable_context_menu.cke_editable.cke_editable_themed.cke_contents_ltr.cke_show_borders")
	WebElement letter;
	
	@FindBy(id="nb-41")
	WebElement sendButton;
	
	public SendMailPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void writeTheLatter(String adres,String temaOfLatter,String emailLatter){
		WebDriverWait wait = new WebDriverWait(driver, 10);
		driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
		wait.until(ExpectedConditions.presenceOfElementLocated((By.xpath(".//*[@id='nb-1']/body/div[2]/div[4]/div/div[2]/div[3]/div[1]/div/div/div[2]/div/div"))));
		writeLatter.click();
//		address.click();
		address.sendKeys(adres);
		tema.click();
//		tema.sendKeys(temaOfLatter);
//		letter.click();
		letter.sendKeys(emailLatter);
		//sendButton.click();
		
	}


}
