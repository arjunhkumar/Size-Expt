/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class Container_4B {

	/** Estimated size of the container: 2 * 2 = 8B*/
	private InlineField_2B fieldX1;
	private InlineField_2B fieldY1;

	
	/**
	 * @param fieldX
	 * @param fieldY
	 */
	public Container_4B() {
		this.fieldX1 = new InlineField_2B();
		this.fieldY1 = new InlineField_2B();
	}

	/**
	 * @return the fieldX1
	 */
	public InlineField_2B getFieldX1() {
		return fieldX1;
	}

	/**
	 * @param fieldX1 the fieldX1 to set
	 */
	public void setFieldX1(InlineField_2B fieldX1) {
		this.fieldX1 = fieldX1;
	}

	/**
	 * @return the fieldY1
	 */
	public InlineField_2B getFieldY1() {
		return fieldY1;
	}

	/**
	 * @param fieldY1 the fieldY1 to set
	 */
	public void setFieldY1(InlineField_2B fieldY1) {
		this.fieldY1 = fieldY1;
	}


}
