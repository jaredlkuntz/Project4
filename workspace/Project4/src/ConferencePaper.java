/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */
public class ConferencePaper extends ScholarlyPaper {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the conference to which the conference proceedings pertain.*/
	private Meeting meeting;
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public ConferencePaper(){
		
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Conference
	/**
	 * This an accessor for the ConferencePaper's <code>conference/code> data field.
	 * </P>
	 * @return conference    This method returns the conference with which the paper is associated.
	 */
	public Meeting getMeeting() {
		return meeting;
	}//end getConference()
	
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Meeting
	/**
	 * This is a mutator for the ConferencePaper's <code>meeting</code> data field.
	 * 
	 * @param meeting    This method takes a Meeting parameter containing the meeting to which the paper pertains.
	 */
	public void setMeeting(Meeting newMeeting) {
		this.meeting = newMeeting;
	}//end setMeeting()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************

}