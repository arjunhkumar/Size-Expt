/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class Container_256B {

	/** Estimated size of the container: 32 * 8 = 256B*/
	private InlineField_32B fieldW1;
	private InlineField_32B fieldX1;
	private InlineField_32B fieldY1;
	private InlineField_32B fieldZ1;
	private InlineField_32B fieldW2;
	private InlineField_32B fieldX2;
	private InlineField_32B fieldY2;
	private InlineField_32B fieldZ2;
	
	/**
	 * @param fieldX
	 * @param fieldY
	 */
	public Container_256B() {
		this.fieldW1 = new InlineField_32B();
		this.fieldX1 = new InlineField_32B();
		this.fieldY1 = new InlineField_32B();
		this.fieldZ1 = new InlineField_32B();
		this.fieldW2 = new InlineField_32B();
		this.fieldX2 = new InlineField_32B();
		this.fieldY2 = new InlineField_32B();
		this.fieldZ2 = new InlineField_32B();
	}

	/**
	 * @return the fieldX1
	 */
	public InlineField_32B getFieldX1() {
		return fieldX1;
	}

	/**
	 * @param fieldX1 the fieldX1 to set
	 */
	public void setFieldX1(InlineField_32B fieldX1) {
		this.fieldX1 = fieldX1;
	}

	/**
	 * @return the fieldY1
	 */
	public InlineField_32B getFieldY1() {
		return fieldY1;
	}

	/**
	 * @param fieldY1 the fieldY1 to set
	 */
	public void setFieldY1(InlineField_32B fieldY1) {
		this.fieldY1 = fieldY1;
	}

	/**
	 * @return the fieldX2
	 */
	public InlineField_32B getFieldX2() {
		return fieldX2;
	}

	/**
	 * @param fieldX2 the fieldX2 to set
	 */
	public void setFieldX2(InlineField_32B fieldX2) {
		this.fieldX2 = fieldX2;
	}

	/**
	 * @return the fieldY2
	 */
	public InlineField_32B getFieldY2() {
		return fieldY2;
	}

	/**
	 * @param fieldY2 the fieldY2 to set
	 */
	public void setFieldY2(InlineField_32B fieldY2) {
		this.fieldY2 = fieldY2;
	}

	/**
	 * @return the fieldZ1
	 */
	public InlineField_32B getFieldZ1() {
		return fieldZ1;
	}

	/**
	 * @param fieldZ1 the fieldZ1 to set
	 */
	public void setFieldZ1(InlineField_32B fieldZ1) {
		this.fieldZ1 = fieldZ1;
	}

	/**
	 * @return the fieldZ2
	 */
	public InlineField_32B getFieldZ2() {
		return fieldZ2;
	}

	/**
	 * @param fieldZ2 the fieldZ2 to set
	 */
	public void setFieldZ2(InlineField_32B fieldZ2) {
		this.fieldZ2 = fieldZ2;
	}

	/**
	 * @return the fieldW1
	 */
	public InlineField_32B getFieldW1() {
		return fieldW1;
	}

	/**
	 * @param fieldW1 the fieldW1 to set
	 */
	public void setFieldW1(InlineField_32B fieldW1) {
		this.fieldW1 = fieldW1;
	}

	/**
	 * @return the fieldW2
	 */
	public InlineField_32B getFieldW2() {
		return fieldW2;
	}

	/**
	 * @param fieldW2 the fieldW2 to set
	 */
	public void setFieldW2(InlineField_32B fieldW2) {
		this.fieldW2 = fieldW2;
	}

}
