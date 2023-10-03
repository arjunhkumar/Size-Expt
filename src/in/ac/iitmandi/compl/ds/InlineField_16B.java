/**
 * 
 */
package in.ac.iitmandi.compl.ds;

import in.ac.iitmandi.compl.Utils;

/**
 * @author arjun
 *
 */
public primitive class InlineField_16B {

	private long x0;
	private long x1;

	
	public InlineField_16B() {
		this.x0 = Utils.genRandomLong(4096);
		this.x1 = Utils.genRandomLong(4096);
	}
	
	/**
	 * @return the x0
	 */
	public long getX0() {
		return x0;
	}
	/**
	 * @return the x1
	 */
	public long getX1() {
		return x1;
	}
}
