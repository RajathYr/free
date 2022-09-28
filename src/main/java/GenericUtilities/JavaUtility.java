package GenericUtilities;

import java.util.Date;
import java.util.Random;

/**
 * This class contains Java specific generic methods
 * @author Asus
 *
 */

public class JavaUtility {
	/**
	 * This method issued to get   random number within the boundary from 0 to 10000
	 * @return random
	 * 
	 */
	public int randomNumber()
	{
		Random ran = new Random();
		int random = ran.nextInt(10000);
		return random;
	}
	/**
	 * This method is used to get SystemDate and Time
	 * @return
	 */
	public String systemDate()
	{
		Date date = new Date();
		String systemDate = date.toString();
		return systemDate;
	}

}
