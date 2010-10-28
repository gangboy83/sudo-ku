package gui;

/**
 * This class creates and provides a panel on which a Sudoku alike grid is shown. It initiates
 * this grid using a parameter of values provided through the constructor.
 * 
 * @author Alvin Moradi with contributions from the "TEAM AWESOME SAUCE"
 * @version 1.0
 *
 */

import gui.comps.AbstractCell;
import gui.comps.EditableCell;
import gui.comps.StaticCell;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;

import javax.swing.*;

import javax.swing.*;
import javax.swing.table.*;

public class Grid extends JPanel {

	JButton button;
	AbstractCell[][] cells;
	int[][] values;
	
	/**
	 * The constructor for calling this grid class.
	 * 
	 * @param values A set of numbers for use with the creation of the Sudoku grid.
	 */
	public Grid(int[][] values) {
		this.values = values;
		
		initComponent();
	}
	
	/**
	 * Initiate all of the components required for drafting a proper Sudoku board.
	 */
	public void initComponent() {
		
		GridBagConstraints c = new GridBagConstraints();
		GridLayout layout = new GridLayout(9,9);
		cells = new AbstractCell[9][9];
		layout.setHgap(0);
		layout.setVgap(0);

		this.setBackground(Color.LIGHT_GRAY);		
		this.setPreferredSize(new Dimension(900,900));
        this.setLayout(layout);
        
        for (int i = 0; i < 9; i++) {
        	for (int j = 0; j < 9; j++) {    		
	        	cells[i][j] = values[i][j] == 0? new EditableCell(i,j): new StaticCell(i,j,values[i][j]);
	        	this.add(cells[i][j], c);				
			}
		}
	}
        
	/* (non-Javadoc)
	 * @see javax.swing.JComponent#paintComponent(java.awt.Graphics)
	 */
	public void paintComponent(Graphics g) {	  
		
		//parent component must always be called.
		super.paintComponent(g);
		//casting so that swing packages can be utilized as well.
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(7));
		g2.drawLine(10,291,890,291);
		g2.drawLine(10,582,890,582);
		g2.drawLine(300,10,300,862);
		g2.drawLine(600,10,600,862);

		g2.setStroke(new BasicStroke(1));
    }
}