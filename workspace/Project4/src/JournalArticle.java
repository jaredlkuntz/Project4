/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */
public class JournalArticle extends ScholarlyPaper{
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the volume of the journal which contains the article.*/
	private int volume;
	/**This is the issue of the journal which contains the article. */
	private int issue;
	
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public JournalArticle(){
		super();
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Volume
	/**
	 * This an accessor for the JournalArticle's <code>volume/code> data field.
	 * </P>
	 * @return volume    This method returns the volume which contains the paper.
	 */
	public int getVolume() {
		return volume;
	}//end getVolume()
	
	//Issue
	/**
	 * This an accessor for the JournalArticle's <code>issue/code> data field.
	 * </P>
	 * @return issue   This method returns the issue which contains the paper.
	 */
	public int getIssue() {
		return issue;
	}//end getIssue()
	
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Volume
	/**
	 * This is a mutator for the JournalArticle's <code>volume</code> data field.
	 * 
	 * @param volume    This method takes an integer parameter containing the volume which contains the article.
	 */
	public void setVolume(int volume) {
		this.volume = volume;
	}//end setVolume()
	
	//Issue
	/**
	 * This is a mutator for the JournalArticle's <code>issue</code> data field.
	 * 
	 * @param issue    This method takes an integer parameter containing the issue which contains the article.
	 */
	public void setIssue(int issue) {
		this.issue = issue;
	}//end setIssue()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}
