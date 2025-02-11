package vtiger.Generic_utility;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * @author Amman
 */
public class JavaUtility {
	/**
	 * this method will capture system date and time and return
	 * 
	 * @return System date and time
	 */
	public String getSystemTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	public int getRandomNumber() {
		Random ran=new Random();
		return ran.nextInt(1000);
	}
}
