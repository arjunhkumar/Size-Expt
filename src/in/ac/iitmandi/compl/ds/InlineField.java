/**
 * 
 */
package in.ac.iitmandi.compl.ds;

import in.ac.iitmandi.compl.Utils;

/**
 * @author arjun
 *
 */
public primitive class InlineField {

	private long x0;

	
	public InlineField() {
		this.x0 = Utils.genRandomLong(4096);
	}
	
	/**
	 * @return the x0
	 */
	public long getX0() {
		return x0;
	}
}
