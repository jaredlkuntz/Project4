import java.util.ArrayList;
import java.util.HashMap;
/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */

public class JournalIssue extends Serial {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/** This is the journal to which the issue belongs.*/
	private Journal journal;
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public JournalIssue(){
		
	}
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Journal
	/**
	 * This an accessor for the JournalIssue's <code>journal/code> data field.
	 * </P>
	 * @return journal    This method returns the journal which published the issue.
	 */
	public Journal getJournal() {
		return journal;
	}//end getJournal()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Journal
	/**
	 * This is a mutator for the JournalIssue's <code>journal</code> data field.
	 * 
	 * @param journal    This method takes a Journal parameter designating the Journal to which the issue belongs.
	 */
	public void setJournal(Journal journal) {
		this.journal = journal;
	}//end Journal()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}