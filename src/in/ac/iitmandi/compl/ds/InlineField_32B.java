/**
 * 
 */
package in.ac.iitmandi.compl.ds;

import in.ac.iitmandi.compl.Utils;

/**
 * @author arjun
 *
 */
public primitive class InlineField_32B {

	private long x0;
	private long x1;
	private long x2;
	private long x3;

	
	public InlineField_32B() {
		this.x0 = Utils.genRandomLong(4096);
		this.x1 = Utils.genRandomLong(4096);
		this.x2 = Utils.genRandomLong(4096);
		this.x3 = Utils.genRandomLong(4096);
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
	/**
	 * @return the x2
	 */
	public long getX2() {
		return x2;
	}
	/**
	 * @return the x3
	 */
	public long getX3() {
		return x3;
	}
}
