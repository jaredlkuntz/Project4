import java.util.ArrayList;
/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */

public class Conference {
	
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the organization which sponsored the conference.*/
	private String sponsor;
	/** This is an ArrayList of the individual meetings of the conference*/
	private ArrayList<Meeting> meetings = new ArrayList<Meeting>();
	
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Conference() {
		
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Sponsor
	/**
	 * This an accessor for the Conference's <code>sponsor/code> data field.
	 * </P>
	 * @return sponsor This method returns a string containing the conference's sponsor.
	 */
	public String getSponsor() {
		return sponsor;
	}//end getSponsor()
	
	//Meetings
	/**
	 * This an accessor for the Conference's <code>meetings/code> data field.
	 * </P>
	 * @return sponsor This method returns the collection of Meetings the conference has held.
	 */
	public ArrayList<Meeting> getMeetings() {
		return meetings;
	}//end getMeetings()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Sponsor
	/**
	 * This is a mutator for the Conference's <code>sponsor</code> data field.
	 * 
	 * @param sponsor    This method takes an String parameter containing the name of the sponsor.
	 */
	public void setSponsor(String sponsor) {
		this.sponsor = sponsor;
	}//end setSponsor()
	
	//Meetings
	/**
	 * This is a mutator for the Conference's <code>meetings</code> data field.
	 * 
	 * @param meetings    This method takes an ArrayList parameter containing the meetings of the conference.
	 */
	public void setMeetings(ArrayList<Meeting> meetings) {
		this.meetings = meetings;
	}//end setConference()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}
