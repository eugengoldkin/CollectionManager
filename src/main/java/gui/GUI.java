package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
	
	//-----------------------------------------------------------
	//                         Attributes
	//-----------------------------------------------------------	
	
	/** This object is the container for various strings in different languages
	 *  allowing us to make the application multilingual. */
	private Language L = new Language();
	
	/** A container for the gui preferences. */
	private GUIpreferences P = new GUIpreferences();
	
	/** This boolean is used as verifier for other Threads to see whether
	 *  the program is still running or is about to close. */
	boolean running = true;
	
	
	//-----------------------------------------------------------
	//                     JFrame Attributes
	//-----------------------------------------------------------	
	
	/** This is a refrence to the main frame of the graphical user interface */
	private JFrame f = new JFrame(L.TITLE);
	
	
	//-----------------------------------------------------------
	//                      Menu Attributes
	//-----------------------------------------------------------	
	
	/** This object holds menu at the top of the programs main frame, which
	 *  we implemented using swings JMenubar concept. */
	private JMenuBar JMB = new JMenuBar();
	
	/* ----- File menu ----- */
	/** The primal menu for the most basic and important tasks */
	private JMenu FileMenu = new JMenu(L.FILE);
	/** Option to create a new collection */
	private JMenuItem NewCollection 	= new JMenuItem(L.NEW_COLLECTION);
	/** Option to open a collection */
	private JMenuItem OpenCollection 	= new JMenuItem(L.OPEN_COLLECTION);
	/** Opens the preferences */
	private JMenuItem Preferences		= new JMenuItem(L.PREFERENCES);
	/** Opens the help frame */
	private JMenuItem Help      		= new JMenuItem(L.HELP);
	/** Stops all simulation and closes the program */
	private JMenuItem Exit      		= new JMenuItem(L.EXIT);
	
	/* ----- View menu ----- */
	/** This menu allows the user to open alternative views of the collection */
	private JMenu ViewMenu = new JMenu(L.VIEW);
	
	
	/* ----- Language ----- */
	/** The option to choose the language */
	private JMenu LanguageC	= new JMenu("");
	
	//-----------------------------------------------------------
	//                      public Methods
	//-----------------------------------------------------------	
	
	/** This function start the main frame of the program */
	public void startJFrame() {

		
				
		//Step 1: Building the GUI
		JMB.add(FileMenu);
		FileMenu.add(NewCollection);
		FileMenu.add(OpenCollection);
		FileMenu.add(getSeparator());
		FileMenu.add(Preferences);
		FileMenu.add(Help);
		FileMenu.add(getSeparator());
		FileMenu.add(Exit);
		
		JMB.add(ViewMenu);
		
		JMB.add(Box.createHorizontalGlue());
		JMB.add(LanguageC);
		ImageIcon[] IIL = L.getLanguageIconList();
		for(int i= 0; i < IIL.length; i++){
			JMenuItem JMI = new JMenuItem(L.getLanguageList()[i]);
			JMI.setBackground(Color.BLACK);
			JMI.setForeground(Color.LIGHT_GRAY);
			JMI.setIcon(IIL[i]);
			final int temp = i;
			JMI.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent arg0) {
					actionChangeLanguage(temp);
				}
			});
			LanguageC.add(JMI);
		}
		
		//Step 2: Setting the Menu Color
		setMenuColor();
		
		//Step 3: Adding the ActionListeners
		NewCollection.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionNewCollection();
			}
		});		
		OpenCollection.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionOpenCollection();
			}
		});	
		Preferences.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionPreferences();
			}
		});	
		Help.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				actionHelp();
			}
		});	
		Exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				running = false;
				f.dispose();
			}
		});	
		
		//Step 4: Set the default Icons
		setDefaultIcons();
		
		//Step 5: Set Component Orientation
		LanguageC.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		
		
		//Step 6: Make the main frame visible
		SwingUtilities.invokeLater(new Runnable() {
		      public void run() {
		        int X = GUIpreferences.FRAME_WIDTH;
		        int Y = GUIpreferences.FRAME_HEIGHT;
		        f.setSize(X, Y);
		        try {
					//f.setIconImage(GUIicons.car090);
				} catch (Exception e) {e.printStackTrace();}
		        f.setMinimumSize(new Dimension(X, Y));
		        f.setResizable(false);
		        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f.setLayout(new BorderLayout());
		        f.add(JMB,BorderLayout.NORTH);
		        //f.add(GP,BorderLayout.CENTER);
		        f.pack();
		        f.setLocationRelativeTo(null);
		        f.setVisible(true);
		        
		      }
		    });
		
		//start the repaint procedure for the DrawPanel DP
		guiRepaint.start();	
	}
	
	
	//-----------------------------------------------------------
	//                      private Methods
	//-----------------------------------------------------------	
	
	private JSeparator getSeparator() {
		JSeparator sep = new JSeparator(SwingConstants.HORIZONTAL);
        sep.setBackground(Color.LIGHT_GRAY);
        return sep;
	}
	
	private void setMenuColor() {
		JComponent[] MenuComponents = {
				JMB, 
				FileMenu, 
				NewCollection, 
				OpenCollection,
				Preferences,
				Help,
				Exit,
				ViewMenu};
		for(JComponent c : MenuComponents) {
			c.setBackground(P.BACKGROUND_COLOR);
			c.setForeground(P.FOREGROUND_COLOR);
		}
	}
	
	private void setDefaultIcons() {	
		LanguageC.setIcon			(L.getCurrentIcon());
		
		NewCollection.setIcon		(null);
		OpenCollection.setIcon		(GUIicons.Open);
		Preferences.setIcon			(GUIicons.Preferences);
		Help.setIcon				(GUIicons.Help);
		Exit.setIcon				(GUIicons.Exit);
	}
	
	//-----------------------------------------------------------
	//                  private action Methods
	//-----------------------------------------------------------	
	
	private void actionNewCollection() {
		// TODO Auto-generated method stub
	}
	private void actionOpenCollection() {
		// TODO Auto-generated method stub
	}
	private void actionPreferences() {
		// TODO Auto-generated method stub
	}
	private void actionHelp() {
		// TODO Auto-generated method stub
	}
	private void actionChangeLanguage(int language_index) {
		L.setLanguage(language_index);
		
		FileMenu.setText(L.FILE);
		NewCollection.setText(L.NEW_COLLECTION);
		OpenCollection.setText(L.OPEN_COLLECTION);
		Preferences.setText(L.PREFERENCES);
		Help.setText(L.HELP);
		Exit.setText(L.EXIT);
		ViewMenu.setText(L.VIEW);
		
		LanguageC.setIcon(L.getCurrentIcon());
		
		f.setTitle(L.TITLE);
		f.repaint();
	}
	
	//-----------------------------------------------------------
	//                         Threads
	//-----------------------------------------------------------

	/** This Thread coordinates the frames-per-second (FPS) of the main frame. */
	Thread guiRepaint = new Thread(){
		
		public void run(){
			try {
				while(running){
					sleep(P.RepaintMiliSecond);
					//GP.repaint();
				}
			} catch (InterruptedException e) {
				System.out.println("GUI Repaint function had issues.");
				e.printStackTrace();
			}
		}
 	};		
	
}
