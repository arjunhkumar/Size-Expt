/**
 * 
 */
package in.ac.iitmandi.compl;

import java.util.ArrayList;
import java.util.List;

import in.ac.iitmandi.compl.ds.Container_384B;

/**
 * @author arjun
 *
 */
public class Runner {
	
	private static final int SIZE = 4096;//4096 8192

	public void runExpt() {
		/** First fill the cache and then perform the expt. */
		List<Container_384B> containerCache = createContainerCache();
		polluteCache(containerCache);
		List<Container_384B> containerCache4Expt = createContainerCache();
		int i = 0;
		while(i++ < 25) {
			runTest(containerCache4Expt);
		}
	}

	private void runTest(List<Container_384B> containerCache) {
		long blackHole = 0;
		for(int i=0;i<(SIZE);i++) {
			Container_384B c1 = containerCache.get(i);
			for(int j=0;j<(SIZE);j++) {
				Container_384B c2 = containerCache.get(Utils.genRandomInt(4095));
				blackHole += operate(c1,c2);
			}
			System.out.println("Test Result: "+blackHole);
		}
	}

	private List<Container_384B> createContainerCache() {
		List<Container_384B> containerCache = new ArrayList<>();
		for(int i=0;i<SIZE;i++) {
			containerCache.add(new Container_384B());
		}
		return containerCache;
	}
	
	private void polluteCache(List<Container_384B> containerCache) {
		long blackHole = 0;
		for(int i=0;i<SIZE;i++) {
			Container_384B c1 = containerCache.get(i);
			Container_384B c2 = containerCache.get(Utils.genRandomInt(4095));
			blackHole += operate(c1,c2);
		}
		System.out.println("Init Result: "+blackHole);
	}

	private long operate(Container_384B c1, Container_384B c2) {
		long val1 = c1.getFieldX1().getX0();
		long val2= c2.getFieldY1().getX31();
		long val3 = c2.getFieldX1().getX25();
		long val4= c1.getFieldY1().getX0();
		long sum = val1 + val2 + val3 + val4;
		return sum % SIZE;
	}
}
