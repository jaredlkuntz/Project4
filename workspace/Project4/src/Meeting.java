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

public class Meeting extends Serial {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This designates which conference which held the meeting.*/
	private Conference conference;
	/**This is where the conference was held.*/
	private Location location;
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Meeting(){
		
	}
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Location
	/**
	 * This an accessor for the Meeting's <code>location/code> data field.
	 * </P>
	 * @return location    This method holds the city, state or province, and country where the meeting was held.
	 */
	public Location getLocation() {
		return location;
	}//end getLocation()
	
	//Conference
	/**
	 * This an accessor for the Meeting's <code>conference/code> data field.
	 * </P>
	 * @return conference    This method holds the conference who parented the meeting.
	 */
	public Conference getConference() {
		return conference;
	}//end getConference()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************

	//Location
	/**
	 * This is a mutator for the Meeting's <code>location</code> data field.
	 * 
	 * @param location    This method takes a Location parameter containing the city, state or province, and country where the 
	 *                    meeting was held.
	 */
	public void setLocation(Location location) {
		this.location = location;
	}//end setLocation()
	
	//Conference
	/**
	 * This is a mutator for the Meeting's <code>conference</code> data field.
	 * 
	 * @param conference    This method takes a Conference containing the conference which held the meeting.
	 */
	public void setConference(Conference conference) {
		this.conference = conference;
	}//end setConference()
	
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}

