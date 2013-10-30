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

public class Serial {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This holds the month the conference was held, or the month in which the academic journal was published. */
	private String month;
	/**This holds the year the conference was held, or the year in which the academic journal was published. */
	private int year;
	/**This is a collection of the conference's program chairs, or an academic journal's editors.*/
	private HashMap<String, Scholar> organizers = new HashMap<String, Scholar>();
	/**This is a collection of a conference's committee members, or an academic journal's reviewers.*/
	private HashMap<String, Scholar> contributors = new HashMap<String, Scholar>();
	/**This is a collection of the papers from an academic conference or an academic journal */
	private ArrayList<ScholarlyPaper> papers = new ArrayList<ScholarlyPaper>();
	
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Serial(){
		
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Month
	/**
	 * This an accessor for the Scholarship's <code>month</code> data field.
	 * </P>
	 * @return month    This method returns the month the conference was held, or the journal was published.
	 */
	public String getMonth() {
		return month;
	}//end Month()
	
	//Year
	/**
	 * This an accessor for the Scholarship's <code>year</code> data field.
	 * </P>
	 * @return year    This method returns the year the conference was held, or the journal was published.
	 */
	public int getYear() {
		return year;
	}//end getYear()
	
	//Organizers
	/**
	 * This an accessor for the Scholarship's <code>organizers</code> data field.
	 * </P>
	 * @return organizers    This method returns the conference's chairs, or the journal's editors.
	 */
	public HashMap<String, Scholar> getOrganizers() {
		return organizers;
	}//end getOrganizers()
	
	//Contributors
	/**
	 * This an accessor for the Scholarship's <code>contributors</code> data field.
	 * </P>
	 * @return contributors    This method returns the conference's committee members, or the journal's reviewers.
	 */
	public HashMap<String, Scholar> getContributors() {
		return contributors;
	}
	
	//Papers
	/**
	 * This an accessor for the Scholarship's <code>papers</code> data field.
	 * </P>
	 * @return papers    This method returns the collection of papers contained in the serial.
	 */
	public ArrayList<ScholarlyPaper> getPapers() {
		return papers;
	}//end getPapers()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Month
	/**
	 * This is a mutator for the Serial's <code>month</code> data field.
	 * 
	 * @param month    This method takes a String parameter containing the month in which the conference meeting was held, or
	 *                 the month in which the journal was published. 
	 */
	public void setMonth(String month) {
		this.month = month;
	}//end setMonth()
	
	//Year
	/**
	 * This is a mutator for the Serial's <code>year</code> data field.
	 * 
	 * @param year    This method takes an Integer parameter containing the year in which the conference meeting was held, or 
	 *                the year in which the journal was published.  
	 */
	public void setYear(int year) {
		this.year = year;
	}//end setYear()
	
	//Organizers
	/**
	 * This is a mutator for the Serial's <code>organizers</code> data field.
	 * 
	 * @param organizers    This method takes a HashMap containing the Scholar's which chaired the conference meeting, or the 
	 *                      Scholar's which edited a journal. 
	 */
	public void setOrganizers(HashMap<String, Scholar> organizers) {
		this.organizers = organizers;
	}//end setOrganizers()
	
	//Contributors
	/**
	 * This is a mutator for the Serial's <code>contributors</code> data field.
	 * 
	 * @param contributors    This method takes a HashMap containing the Scholar's that served on a conference meeting's committee, 
	 *                        or the Scholar's that reviewed a journal.  
	 */
	public void setContributors(HashMap<String, Scholar> contributors) {
		this.contributors = contributors;
	}//end setContributors()
	
	//Papers
	/**
	 * This is a mutator for the Serial's <code>papers</code> data field.
	 * 
	 * @param papers    This method takes an ArrayList containing the papers put out by the serial.  
	 */
	public void setPapers(ArrayList<ScholarlyPaper> papers) {
		this.papers = papers;
	}//end setPapers()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}
