package general_utility;

import java.util.Random;

public class java_utility_test {



/**
 * This class contains all java specific generaic methods
 * 
 *
 */
public class JavaLibrary {

	/**
	 * This method will generate random number for every execution
	 * @return
	 */
	public int getRandomNum()
	{
		Random r = new Random();
		return r.nextInt(200);
	}
}

public int getRandomNum() {
	// TODO Auto-generated method stub
	Random r = new Random();
	return r.nextInt(1000);

}
}
