package gui.comps;

/**
 * This class provides an abstract celltype for creation of static and editable
 * cells within the Sudoku game.
 * 
 * @author Alvin Moradi with contributions from the "TEAM AWESOME SAUCE"
 * @version 1.0
 *
 */

import javax.swing.JTextField;

public class AbstractCell extends JTextField {
	
	protected int value;
	protected int gridx;
	protected int gridy;
	
	/**
	 * Tags the value currently displayed in this cell. Not really used unless an implementation
	 * of listeners becomes necessary.
	 * 
	 * @param data A 2D array of elements for use in randomly populating the Sudoky grid.
	 */
	public void setValue(int data) {
		this.value = data;
		
	}
	
	/**
	 * Returns the value currently stored for this cell. Not really used unless an implementation
	 * of listeners becomes necessary.
	 * 
	 */
	public int getValue() {
		return this.value;
	}
}
