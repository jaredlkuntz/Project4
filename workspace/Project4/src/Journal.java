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

public class Journal {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the publisher of the journal.*/
	private String publisher;
	/**This is where the journal was published*/
	private Location publishingLocation;
	/**This is a HashMap of the journal's volumes, containing ArrayLists' of the individual volumes' issues  */
	private HashMap<Integer, ArrayList<JournalIssue>> volumes = new HashMap<Integer, ArrayList<JournalIssue>>();
	
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Journal(){
		
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Publisher
	/**
	 * This an accessor for the Journal's <code>publisher/code> data field.
	 * </P>
	 * @return publisher    This method returns the conference with which the paper is associated.
	 */
	public String getPublisher() {
		return publisher;
	}//end getPublisher()
	
	//Publishing Location
	/**
	 * This an accessor for the Journal's <code>publishingLocation/code> data field.
	 * </P>
	 * @return publishingLocation This method returns the location at which the journal is published.
	 */
	public Location getPublishingLocation() {
		return publishingLocation;
	}//end getPublishingLocation()
	
	//Volumes
	/**
	 * This an accessor for the Journal's <code>volumes/code> data field.
	 * </P>
	 * @return volumes This method returns the collection of volumes of the journal.
	 */
	public HashMap<Integer, ArrayList<JournalIssue>> getVolumes() {
		return volumes;
	}//end getVolumes
	
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Publishing Location
	/**
	 * This is a mutator for the Journal's <code>publishingLocation</code> data field.
	 * 
	 * @param publishingLocation    This method takes a Location parameter containing the journal's site of publication.
	 */
	public void setPublishingLocation(Location publishingLocation) {
		this.publishingLocation = publishingLocation;
	}//end setPublishingLocation()
	
	//Publisher
	/**
	 * This is a mutator for the Journal's <code>publisher</code> data field.
	 * 
	 * @param publisher    This method takes a String parameter containing the name of the journal's publisher.
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}//end setPublisher()
	
	//Volumes
	/**
	 * This is a mutator for the Journal's <code>volumes</code> data field.
	 * 
	 * @param volumes    This method takes a HashMap parameter containing the volumes of the journal.
	 */
	public void setVolumes(HashMap<Integer, ArrayList<JournalIssue>> volumes) {
		this.volumes = volumes;
	}//end setVolumes()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}

