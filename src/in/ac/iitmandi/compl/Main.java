/**
 * 
 */
package in.ac.iitmandi.compl;

/**
 * @author arjun
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Utils.createOutFile();
		Runner runner = new Runner();
		long startTime = System.currentTimeMillis();
		runner.runExpt();
		long endTime = System.currentTimeMillis();
		Utils.writeToOutFile(endTime -  startTime);
	}

}
