package Script;

import org.testng.annotations.Test;

import Pompages.AddtoCart;
import Pompages.SkillraryDemoApplication;
import Pompages.SkillraryLoginPage;
import genericLib.BaseClass;

public class Testcase1 extends BaseClass{
	
	@Test
	public void tc1() {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoApplication();
		
		SkillraryDemoApplication d=new SkillraryDemoApplication(driver);
		driverutilies.switchTabs(driver);
		driverutilies.mouseHover(driver,d.getCoursetab());
		d.seleniumtrainingtab();
		
		
		AddtoCart a=new AddtoCart(driver);
		driverutilies.doubleClick(driver,a.getAddbtn());
	    a.addtocartbutton();
	    driverutilies.alertPopup(driver);
	}
	
}