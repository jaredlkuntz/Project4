import java.util.HashMap;
/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */

public class ScholarlyPaper {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is a collection of the scholar's cited as authors on a scholarly publication. */
	private HashMap<String, Scholar> authors = new HashMap<String, Scholar>();
	/**This is the title of the paper.*/
	private String title;
	/**This is the digital object identifier of a paper. Papers with no digital object identifier will have a null value.*/
	private String digitalObjectIdentifier;
	/**This is the page in the journal or conference proceedings on which the paper begins. */
	private int firstPage;
	/**This is the page in the journal or conference proceedings on which the paper ends. */
	private int lastPage;
	
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public ScholarlyPaper(){
		
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Authors
	/**
	 * This an accessor for the ScholarlyPaper's <code>authors</code> data field.
	 * </P>
	 * @return authors    This method returns the authors associated with the paper.
	 */
	public HashMap<String, Scholar> getAuthors() {
		return authors;
	}//end getAuthors()
	
	//Title
	/**
	 * This an accessor for the ScholarlyPaper's <code>title</code> data field.
	 * </P>
	 * @return title    This method returns the title of the paper.
	 */
	public String getTitle() {
		return title;
	}//end getTitle()
	
	//Digital Object Identifier
	/**
	 * This an accessor for the ScholarlyPaper's <code>digitalObjectIdentifier</code> data field.
	 * </P>
	 * @return digitalObjectIdentifier    This method returns the paper's digital object identifier, or null where none is present.
	 */
	public String getDigitalObjectIdentifier() {
		return digitalObjectIdentifier;
	}//end getDigitalObjectIdentifer()
	
	//First page
	/**
	 * This an accessor for the ScholarlyPaper's <code>firstPage</code> data field.
	 * </P>
	 * @return firstPage    This method returns the page on which the paper begins.
	 */
	public int getFirstPage() {
		return firstPage;
	}//end getFirstPage()
	
	//Last page
	/**
	 * This an accessor for the ScholarlyPaper's <code>lastPage</code> data field.
	 * </P>
	 * @return lastPage    This method returns the page on which the paper ends.
	 */
	public int getLastPage() {
		return lastPage;
	}//end getLastPage()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Authors
	/**
	 * This is a mutator for the ScholarlyPaper's <code>authors</code> data field.
	 * 
	 * @param authors    This method takes a HashMap paramter containing the paper's authors.
	 */
	public void setAuthors(HashMap<String, Scholar> authors) {
		this.authors = authors;
	}//end setAuthors()
	
	//Title
	/**
	 * This is a mutator for the ScholarlyPaper's <code>title</code> data field.
	 * 
	 * @param title    This method takes a String parameter containing the paper's title. 
	 */
	public void setTitle(String title) {
		this.title = title;
	}//end setTitle()
	
	
	//Digital Object Identifier
	/**
	 * This is a mutator for the ScholarlyPaper's <code>digitalObjectIdentifier</code> data field.
	 * 
	 * @param digitalObjectIdentifier    This method takes a String parameter containing the paper's 
	 *                                   digital object identifier.
	 */
	public void setDigitalObjectIdentifier(String digitalObjectIdentifier) {
		this.digitalObjectIdentifier = digitalObjectIdentifier;
	}//end setDigitalObjectIdentifier()
	
	//First Page
	/**
	 * This is a mutator for the ScholarlyPaper's <code>firstPage</code> data field.
	 * 
	 * @param firstPage    This method takes an Integer parameter containing the page on which the paper begins.
	 */
	public void setFirstPage(int firstPage) {
		this.firstPage = firstPage;
	}//end setFirstPage()
	
	//Last Page
	/**
	 * This is a mutator for the ScholarlyPaper's <code>lastPage</code> data field.
	 * 
	 * @param lastPage    This method takes an Integer parameter containing the page on which the paper ends.
	 */
	public void setLastPage(int lastPage) {
		this.lastPage = lastPage;
	}//end setLastPage()
	
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************

}
