/**
 * 
 */
package in.ac.iitmandi.compl.ds;

/**
 * @author arjun
 *
 */
public class Container {

	private InlineField fieldX1;
	private InlineField fieldY1;
	private InlineField fieldZ1;
	private InlineField fieldX2;
	private InlineField fieldY2;
	private InlineField fieldZ2;
	
	/**
	 * @param fieldX
	 * @param fieldY
	 */
	public Container() {
		this.fieldX1 = new InlineField();
		this.fieldY1 = new InlineField();
		this.fieldZ1 = new InlineField();
		this.fieldX2 = new InlineField();
		this.fieldY2 = new InlineField();
		this.fieldZ2 = new InlineField();
	}

	/**
	 * @return the fieldX1
	 */
	public InlineField getFieldX1() {
		return fieldX1;
	}

	/**
	 * @param fieldX1 the fieldX1 to set
	 */
	public void setFieldX1(InlineField fieldX1) {
		this.fieldX1 = fieldX1;
	}

	/**
	 * @return the fieldY1
	 */
	public InlineField getFieldY1() {
		return fieldY1;
	}

	/**
	 * @param fieldY1 the fieldY1 to set
	 */
	public void setFieldY1(InlineField fieldY1) {
		this.fieldY1 = fieldY1;
	}

	/**
	 * @return the fieldZ1
	 */
	public InlineField getFieldZ1() {
		return fieldZ1;
	}

	/**
	 * @param fieldZ1 the fieldZ1 to set
	 */
	public void setFieldZ1(InlineField fieldZ1) {
		this.fieldZ1 = fieldZ1;
	}

	/**
	 * @return the fieldX2
	 */
	public InlineField getFieldX2() {
		return fieldX2;
	}

	/**
	 * @param fieldX2 the fieldX2 to set
	 */
	public void setFieldX2(InlineField fieldX2) {
		this.fieldX2 = fieldX2;
	}

	/**
	 * @return the fieldY2
	 */
	public InlineField getFieldY2() {
		return fieldY2;
	}

	/**
	 * @param fieldY2 the fieldY2 to set
	 */
	public void setFieldY2(InlineField fieldY2) {
		this.fieldY2 = fieldY2;
	}

	/**
	 * @return the fieldZ2
	 */
	public InlineField getFieldZ2() {
		return fieldZ2;
	}

	/**
	 * @param fieldZ2 the fieldZ2 to set
	 */
	public void setFieldZ2(InlineField fieldZ2) {
		this.fieldZ2 = fieldZ2;
	}
	
}
