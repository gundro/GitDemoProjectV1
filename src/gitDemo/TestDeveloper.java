/**
 * 
 */
package gitDemo;

/**
 * @author ronithrajgund
 *
 */
public class TestDeveloper {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String hungry="yes";
		
		//Adding one more condition below as suggested by Lead
		if("yes" == hungry || "y" == hungry || "Y" == hungry)
		{
			System.out.println("Eat Something");
		}
		else
		{
			System.out.println("Do work");
		}
	}

}
