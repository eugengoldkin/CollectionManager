package gui;

import javax.swing.*;
import java.awt.*;

public class DrawPanel  extends JPanel{

	/** A reference to the preference class {@link GUIpreferences} */
	private GUIpreferences P;
	
	/** A reference to a {@link Language} object to be able to 
	 *  retrieve translated Strings in different languages. */
	private Language L;
	
	//-----------------------------------------------------------
	//                        Constructor
	//-----------------------------------------------------------	
		
	/** A constructor method for the drawing panel.
	 * 
	 * @param L
	 * 		  A reference to the {@link Language} class.
	 * @param P
	 * 		  A reference to the preference class {@link GUIpreferences} */
	protected DrawPanel(GUIpreferences P, Language L ){
		
		this.P = P;
		this.L = L;
			
	}
	
	//-----------------------------------------------------------
	//                     protected Methods
	//-----------------------------------------------------------	
	
	@Override
	protected void paintComponent(Graphics g) {
	      super.paintComponent(g);
	
	}
	
}
