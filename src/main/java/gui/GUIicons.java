package gui;

import javax.swing.*;
import java.io.IOException;

public class GUIicons {
	
	//-----------------------------------------------------------
	//                      public Attributes
	//-----------------------------------------------------------
	
	// GUI.java
	public static ImageIcon Exit;
	public static ImageIcon Help;
	public static ImageIcon Open;
	public static ImageIcon Preferences;
	
	// Language.java
	public static ImageIcon[] IIA;
	
	
	//-----------------------------------------------------------
	//                           Methods
	//-----------------------------------------------------------
	
	/** Loads all pictures from the folder <b>icons</b> into their designated field.
	 * 
	 * @throws IOException
	 * 		   The exception is thrown should an error occur during reading */
	public void loadFilesFromFolder() throws IOException{
		loadFilesFromFolder("icons");
	}
	
	/** Loads all pictures from the prescribed folder into their designated field.
	 * 
	 * @param folder
	 * 		  The path to the folder containing all the pictures
	 * @throws IOException
	 * 		   The exception is thrown should an error occur during reading */
	public void loadFilesFromFolder(String folder) throws IOException{
		
	}
	
	/** Loads all language icons from the folder <b>languageicons</b> into their designated field.
	 * 
	 * @throws IOException
	 * 		   The exception is thrown should an error occur during reading */
	public void loadLanguageIconsFromFolder() throws IOException{
		loadFilesFromFolder("languageicons");
	}
	
	/** Loads all language icons from the prescribed folder into their designated field.
	 * 
	 * @param folder
	 * 		  The path to the folder containing all the language icons
	 * @throws IOException
	 * 		   The exception is thrown should an error occur during reading */
	public void loadLanguageIconsFromFolder(String folder) throws IOException{
		Exit 					= new ImageIcon(folder+ "/icon/Exit.png");
		Help 					= new ImageIcon(folder+ "/icon/Help.png");
		Open 					= new ImageIcon(folder+ "/icon/Open.png");
		Preferences 			= new ImageIcon(folder+ "/icon/Preferences.png");
		
		ImageIcon[] temp = {
				new ImageIcon(folder+ "/lang/ENG.png"),
				new ImageIcon(folder+ "/lang/DEU.png")
			};
		IIA = temp;
	}
	
	/** Loads all pictures as Resouces. This means that the pictures have to be saved inside the runable jar file. 
	 * 
	 * @throws IOException
	 * 		   The exception is thrown should an error occur during reading */
	public void loadFilesFromSource() throws IOException{

		Exit 					= new ImageIcon(getClass().getClassLoader().getResource("icon/Exit.png"));
		Help 					= new ImageIcon(getClass().getClassLoader().getResource("icon/Help.png"));
		Open 					= new ImageIcon(getClass().getClassLoader().getResource("icon/Open.png"));
		Preferences 			= new ImageIcon(getClass().getClassLoader().getResource("icon/Preferences.png"));

		IIA = new ImageIcon[]{
				new ImageIcon(getClass().getClassLoader().getResource("lang/ENG.png")),
				new ImageIcon(getClass().getClassLoader().getResource("lang/DEU.png")),
//				new ImageIcon(getClass().getClassLoader().getResource("lang/CZE.png")), //Tschechisch
//				new ImageIcon(getClass().getClassLoader().getResource("lang/FRA.png")), //Französisch
//				new ImageIcon(getClass().getClassLoader().getResource("lang/SPA.png")), //Spanisch
//				new ImageIcon(getClass().getClassLoader().getResource("lang/RUS.png"))  //Russisch
			};
	}

	
}
