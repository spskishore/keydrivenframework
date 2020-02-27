package kwdf;

import org.openqa.selenium.WebDriver;

public class driver_script {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String kw,loc,td;
		WebDriver dr=null;
		all_webelements_fns we = new all_webelements_fns(dr);
		excel_keydriven ex = new excel_keydriven();
		
		for(int r=1;r<=4;r++)
		{
			kw=ex.read_excel(r, 2);
			loc=ex.read_excel(r, 3);
			td=ex.read_excel(r, 4);
			
			switch(kw)
			{
			case "launchBrowser":
				we.launch_chrome(td);
				break;
				
			case "enterText":
				we.enter_txt(loc,td);
				break;
				
			case "click":
				we.click(loc);
				break;
			}
		}
		
	}

}
