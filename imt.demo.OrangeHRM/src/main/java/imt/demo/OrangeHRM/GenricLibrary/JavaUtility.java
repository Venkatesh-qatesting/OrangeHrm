package imt.demo.OrangeHRM.GenricLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility {
	
	public int randomNumber() {
		Random r = new Random();
		int randomnumber = r.nextInt();
		return randomnumber;
	}
	
	public String dateAndTime() {
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY hh-mm-ss");
		String formattedDate = sdf.format(time);
		return formattedDate;
	}
	
	public void robotClass() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_TAB);
	}
}
