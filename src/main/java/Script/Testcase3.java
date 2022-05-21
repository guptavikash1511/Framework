package Script;

import java.io.IOException;

import org.testng.annotations.Test;

import Pompages.CorejavaPage;
import Pompages.SkillraryLoginPage;
import Pompages.WishlistPage;
import genericLib.BaseClass;

public class Testcase3 extends BaseClass  {

	@Test
   public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.searchtextbox(p.getPropertyFiledata("name"));
		s.searchbutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavaselenium();
		
		WishlistPage w=new WishlistPage(driver);
		driverutilies.switchFrames(driver);
		w.playbutton();
		Thread.sleep(30000);
		w.pausebutton();
		
		driverutilies.switchbackframe(driver);
		w.addwishlistbtn();
	}
   
}
