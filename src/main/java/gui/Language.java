package gui;

import javax.swing.*;


/** The class Language provides the language options for the software
 *	itself and the help menu. Therefore it contains Attributes for
 *	Strings, a list of languages (String[] LanguageList) and according
 *	icons (ImageIcon[] IIA) and holds the information which language is
 *	set (int currentLanguage). The constructor creates a Language object
 *	and sets the language to 'default language'. According methods get and
 *	set a language, (e.g. setEnglish).
 * 
 * @author Eugen Goldkin
 * @version 1.0
 * @since 31.12.2022
 */
public class Language {
	
	//-----------------------------------------------------------
	//            Container Attributes for Strings
	//-----------------------------------------------------------

	//Softwaretitle
	protected String TITLE;
	
	//Menubar
	protected String FILE;
	protected String NEW_COLLECTION;
	protected String OPEN_COLLECTION;
	protected String PREFERENCES;
	protected String HELP;
	protected String EXIT;
	protected String VIEW;

	//-----------------------------------------------------------
	//                         Attributes
	//-----------------------------------------------------------
	
	/** This integer holds the ID of the current language. */
	int currentLanguage;
	
	/** An array containing the names of all available languages */
	private String[] LanguageList ={
		"English",
		"Deutsch"
	};
	
	/** An array containing the icons of all available languages */
	private ImageIcon[] IIA = GUIicons.IIA;
	
	//-----------------------------------------------------------
	//                        Constructor
	//-----------------------------------------------------------
	
	/** Creates a Language object and sets the language to 'default language' */
	public Language(){
		currentLanguage = 0;
		setLanguage(currentLanguage);
	}
	
	//-----------------------------------------------------------
	//                      public Methods
	//-----------------------------------------------------------
	
	/** Getter function for the array containing all icons
	 * 
	 * @return An array containing the icons of all available languages */
	public ImageIcon[] getLanguageIconList(){
		return IIA;
	}
	
	/**Getter function for the array containing all language names
	 * 
	 * @return An array containing the names of all available languages */
	public String[] getLanguageList(){
		return LanguageList;
	}

	/** Sets the language to the specified ID
	 * 
	 * @param language_index
	 * 		  The identification of the language */
	public void setLanguage(int language_index) {
		currentLanguage = language_index;
		setDefaultLangauage();
		switch(language_index){
		case 0: setEnglish(); break;
		case 1: setGerman(); break;
		default: setDefaultLangauage();
		}
	}
	
	/** Returns the icon of the current language
	 * 
	 * @return The icon of the current language
	 */
	public Icon getCurrentIcon() {
		return IIA[currentLanguage];
	}
	
	//-----------------------------------------------------------
	//                     private Methods
	//-----------------------------------------------------------
	
	/** Sets the language to English */
	private void setDefaultLangauage(){
		setEnglish();
	}
	
	/** Sets the language to English */
	private void setEnglish(){
		//Softwaretitle
		TITLE 				= "Collection Manager";
		
		//Menubar
		FILE 				= "File";
		NEW_COLLECTION 		= "New Collection";
		OPEN_COLLECTION		= "Open Collection";
		PREFERENCES			= "Preferences";
		HELP 				= "Help";
		EXIT 				= "Exit";
		VIEW				= "View";
		
	}
	
	/** Sets the language to German */
	private void setGerman(){

	}
	
	
	
}
