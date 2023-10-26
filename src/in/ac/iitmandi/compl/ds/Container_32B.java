/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class Container_32B {

	/** Estimated size of the container: 8 * 4 = 32B*/
	private InlineField_8B fieldX1;
	private InlineField_8B fieldY1;
	private InlineField_8B fieldX2;
	private InlineField_8B fieldY2;
	
	/**
	 * @param fieldX
	 * @param fieldY
	 */
	public Container_32B() {
		this.fieldX1 = new InlineField_8B();
		this.fieldY1 = new InlineField_8B();
		this.fieldX2 = new InlineField_8B();
		this.fieldY2 = new InlineField_8B();
	}

	/**
	 * @return the fieldX1
	 */
	public InlineField_8B getFieldX1() {
		return fieldX1;
	}

	/**
	 * @param fieldX1 the fieldX1 to set
	 */
	public void setFieldX1(InlineField_8B fieldX1) {
		this.fieldX1 = fieldX1;
	}

	/**
	 * @return the fieldY1
	 */
	public InlineField_8B getFieldY1() {
		return fieldY1;
	}

	/**
	 * @param fieldY1 the fieldY1 to set
	 */
	public void setFieldY1(InlineField_8B fieldY1) {
		this.fieldY1 = fieldY1;
	}

	/**
	 * @return the fieldX2
	 */
	public InlineField_8B getFieldX2() {
		return fieldX2;
	}

	/**
	 * @param fieldX2 the fieldX2 to set
	 */
	public void setFieldX2(InlineField_8B fieldX2) {
		this.fieldX2 = fieldX2;
	}

	/**
	 * @return the fieldY2
	 */
	public InlineField_8B getFieldY2() {
		return fieldY2;
	}

	/**
	 * @param fieldY2 the fieldY2 to set
	 */
	public void setFieldY2(InlineField_8B fieldY2) {
		this.fieldY2 = fieldY2;
	}

}