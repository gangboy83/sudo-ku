package gui.comps;

/**
* This class instantiates an editable cell for the Sudoku board.
 * 
 * @author Alvin Moradi with contributions from the "TEAM AWESOME SAUCE"
 * @version 1.0
 *
 */

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

@SuppressWarnings("serial")
public class EditableCell extends AbstractCell {

	/**
	 * Constructor is used to create a cell. Although not necessary for the current implementation
	 * of the game, the x and y locations become paramount once game implements dynamic actions.
	 * 
	 * @param x The 'X' location of this cell in the Sudoku grid.
	 * @param y The 'Y' location of this cell in the Sudoku grid.
	 */
	public EditableCell(int x, int y){
		this.gridx = x;
		this.gridy = y;
		
		initComponent();
	}
	
	
	/**
	 * Initiate the cell and all applicable attributes.
	 */
	private void initComponent(){
		Font font = new Font("Verdana", Font.PLAIN, 60);
		this.setFont(font);
		
		this.setEditable(true);
		this.setBackground(Color.white);
		this.setForeground(Color.black);
		this.setHorizontalAlignment(JTextField.CENTER);
		
		this.setValue(gridx);
	}
}
