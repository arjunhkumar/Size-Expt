/**
 * 
 */
package in.ac.iitmandi.compl;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.Container;

/**
 * @author arjun
 *
 */
public class Runner {
	
	private static final int SIZE = 4096;//4096 8192

	public void runExpt() {
		/** First fill the cache and then perform the expt. */
		List<Container> containerCache = createContainerCache();
		polluteCache(containerCache);
		List<Container> containerCache4Expt = createContainerCache();
		int i = 0;
		while(i++ < 25) {
			runTest(containerCache4Expt);
		}
		
		
	}

	private void runTest(List<Container> containerCache) {
		long blackHole = 0;
		for(int i=0;i<(SIZE);i++) {
			Container c1 = containerCache.get(i);
			for(int j=0;j<(SIZE);j++) {
				Container c2 = containerCache.get(Utils.genRandomInt(4095));
				blackHole += operate(c1,c2);
			}
			System.out.println("Test Result: "+blackHole);
		}
	}

	private List<Container> createContainerCache() {
		List<Container> containerCache = new ArrayList<>();
		for(int i=0;i<SIZE;i++) {
			containerCache.add(new Container());
		}
		return containerCache;
	}
	
	private void polluteCache(List<Container> containerCache) {
		long blackHole = 0;
		for(int i=0;i<SIZE;i++) {
			Container c1 = containerCache.get(i);
			Container c2 = containerCache.get(Utils.genRandomInt(4095));
			blackHole += operate(c1,c2);
		}
		System.out.println("Init Result: "+blackHole);
	}

	private long operate(Container c1, Container c2) {
		long val1 = c1.getFieldX1().getX2();
		long val2= c1.getFieldX2().getX24();
		long val3 = c2.getFieldZ2().getX5();
		long val4= c2.getFieldY1().getX15();
		long sum = val1 + val2 + val3 + val4;
		return sum % SIZE;
	}
}
