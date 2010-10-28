package gui;

/**
 * This class instantiates a graphical window or container frame for displaying
 * java graphical buttons.
 * 
 * @author Alvin Moradi with contributions from the "TEAM AWESOME SAUCE"
 * @version 1.0
 *
 */

import gui.comps.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class Window extends JFrame {
	
	/**
	 * @param title The title of the Window or application.
	 * @param data The randomized set of numbers to use for populating the board grid.
	 */
	public Window(String title, int[][] data) {
		
		Grid grid = new Grid(data);
		
		this.setTitle(title);
	    this.setResizable(false);
	    this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setPreferredSize(new Dimension(900,900));
				
		this.setContentPane( grid ); 
		
	}
}