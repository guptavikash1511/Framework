package Pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
    @FindBy(xpath="//*[@id=\"player\"]/div[7]/div[3]/button/div[2]")
    private WebElement playicon;
    
	@FindBy(xpath="//div[@class='pause-icon']")
	private WebElement pauseicon;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void playbutton()
	{
		playicon.click();
	}
	public void pausebutton() {
		pauseicon.click();
	}
	public void addwishlistbtn() {
		addtowishlist.click();	
	}
}
