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

public class Scholar {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the scholar's primary name, usually the family name.*/
	private String primaryName = "";
	/**This contains all other names the scholar uses.*/
	private String secondaryNames = "";
	/**This contains all of the institutions with which the scholar is affiliated. */
	private String[] institutionalAffiliations;
	/**These are the areas to which the scholar's research pertains.*/
	private String[] researchAreas;
	/**This is a collection of conferences the scholar has chaired.*/
	private HashMap<String,Conference> conferencesChaired = new HashMap<String,Conference>();
	/**This is a collection of conferences for which the scholar has served as a committee member. */
	private HashMap<String, Meeting> conferencesCommitteed = new HashMap<String, Meeting>();
	/**This is a collection of journals the scholar has edited.*/
	private HashMap<String, JournalArticle> journalsEdited = new HashMap<String, JournalArticle>();
	/**This is a collection of journals that the scholar has reviewed.*/
	private HashMap<String, JournalArticle> journalsReviewed = new HashMap<String, JournalArticle>();
	/** This is an ArrayList of AcademicPaper's which the author has published. */
	private ArrayList<ScholarlyPaper> publications = new ArrayList<ScholarlyPaper>();
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Scholar(){
		
	}
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Primary Name
	/**
	 * This an accessor for the Scholar's <code>primaryName/code> data field.
	 * </P>
	 * @return primaryName    This method returns the scholar's primary name, usually their family name.
	 */
	public String getPrimaryName() {
		return primaryName;
	}//end getPrimaryName()
	
	//Secondary Names
	/**
	 * This an accessor for the Scholar's <code>secondaryName/code> data field.
	 * </P>
	 * @return secondaryName    This method returns the scholar's secondary name(s).
	 */
	public String getSecondaryNames() {
		return secondaryNames;
	}//end getSecondaryNames()
	
	//Institutional Affiliations
	/**
	 * This an accessor for the Scholar's <code>institutionalAffiliations/code> data field.
	 * </P>
	 * @return institutionalAffiliations    This method returns the insitutions with which the scholar is associated. 
	 */
	public String[] getInstitutionalAffiliations() {
		return institutionalAffiliations;
	}//end getInstitutionalAffiliations()
	
	//Research Areas
	/**
	 * This an accessor for the Scholar's <code>researchAreas/code> data field.
	 * </P>
	 * @return institutionalAffiliations    This method returns the fields of research with which the scholar is associated. 
	 */
	public String[] getResearchAreas() {
		return researchAreas;
	}//end getResearchAreas()
	
	//Conferences Chaired
	/**
	 * This an accessor for the Scholar's <code>conferencesChaired/code> data field.
	 * </P>
	 * @return conferencesChaired    This method returns the conferences which the scholar has chaired. 
	 */
	public HashMap<String,Conference> getConferencesChaired() {
		return conferencesChaired;
	}//end getConferencesChaired()
	
	//Conferences Committeed
	/**
	 * This an accessor for the Scholar's <code>conferencesCommitteed/code> data field.
	 * </P>
	 * @return conferencesCommitteed    This method returns the conferences which the scholar has served on committee.
	 */
	public HashMap<String, Meeting> getConferencesCommitteed() {
		return conferencesCommitteed;
	}//end getConferencesCommitteed()
	
	//Journal Edited
	/**
	 * This an accessor for the Scholar's <code>journalsEdited/code> data field.
	 * </P>
	 * @return journalsEdited    This method returns the journals which the scholar has edited.
	 */
	public HashMap<String, JournalArticle> getJournalsEdited() {
		return journalsEdited;
	}//end getJournalsEdited()
	
	//Journals Reviewed
	/**
	 * This an accessor for the Scholar's <code>journalsReviewed/code> data field.
	 * </P>
	 * @return journalsReviewed    This method returns the journals which the scholar has reviewed
	 */
	public HashMap<String, JournalArticle> getJournalsReviewed() {
		return journalsReviewed;
	}//end getJournalsReviewed()
	
	/**
	 * This an accessor for the Scholar's <code>publications/code> data field.
	 * </P>
	 * @return publications    This method returns the papers the scholar has published.
	 */
	public ArrayList<ScholarlyPaper> getPublications() {
		return publications;
	}//end getPublications()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Primary Name
	/**
	 * This is a mutator for the Scholar's <code>primaryName</code> data field.
	 * 
	 * @param primaryName    This method takes a String parameter containing the scholar's primary name, usually their family name.
	 */
	public void setPrimaryName(String primaryName) {
		this.primaryName = primaryName;
	}//end setPrimaryName()
	
	//Secondary Name
	/**
	 * This is a mutator for the Scholar's <code>secondaryNames</code> data field.
	 * 
	 * @param secondaryNames    This method takes a String parameter containing the scholar's secondary names.
	 */
	public void setSecondaryNames(String secondaryNames) {
		this.secondaryNames = secondaryNames;
	}//end secondaryNames()
	
	//Institutional Affiliations
	/**
	 * This is a mutator for the Scholar's <code>institutionalAffiliations</code> data field.
	 * 
	 * @param institutionalAffiliations    This method takes a String array containing the names of institutions with
	 *                                     which the scholar is affiliated.
	 */
	public void setInstitutionalAffiliations(String[] institutionalAffiliations) {
		this.institutionalAffiliations = institutionalAffiliations;
	}//end setInstitutionalAffiliations()
	
	//Research Areas
	/**
	 * This is a mutator for the Scholar's <code>researchAreas</code> data field.
	 * 
	 * @param researchAreas    This method takes a String array containing the fields of research with
	 *                         which the scholar is affiliated.
	 */
	public void setResearchAreas(String[] researchAreas) {
		this.researchAreas = researchAreas;
	}//end setResearchAreas()
	
	//Conferences Chaired
	/**
	 * This is a mutator for the Scholar's <code>conferencesChaired</code> data field.
	 * 
	 * @param conferencesChaired    This method takes a HashMap  containing the conferences that the scholar has chaired.
	 */
	public void setConferencesChaired(HashMap<String,Conference> conferencesChaired) {
		this.conferencesChaired = conferencesChaired;
	}//end setConferencesChaired()
	
	//Conferences Committeed
	/**
	 * This is a mutator for the Scholar's <code>conferencesCommitteed</code> data field.
	 * 
	 * @param conferencesCommitteed    This method takes a HashMap  containing the conferences for which the 
	 *                                 scholar has served on committee.
	 */
	public void setConferencesCommitteed(HashMap<String, Meeting> conferencesCommitteed) {
		this.conferencesCommitteed = conferencesCommitteed;
	}//end setConferencesCommitteed
	
	//Journals Edited
	/**
	 * This is a mutator for the Scholar's <code>journalsEdited</code> data field.
	 * 
	 * @param journalsEdited    This method takes a HashMap containing the journals which the scholar has edited.
	 */
	public void setJournalsEdited(HashMap<String, JournalArticle> journalsEdited) {
		this.journalsEdited = journalsEdited;
	}//end setJournalsEdited()
	
	//Journals Reviewed
	/**
	 * This is a mutator for the Scholar's <code>journalsReviewed</code> data field.
	 * 
	 * @param journalsReviewed    This method takes a HashMap containing the journals which
	 *                            the scholar has reviewed.
	 */
	public void setJournalsReviewed(HashMap<String, JournalArticle> journalsReviewed) {
		this.journalsReviewed = journalsReviewed;
	}//end setJournalsReviewed()
	
	//Publications
	/**
	 * This is a mutator for the Scholar's <code>publications</code> data field.
	 * 
	 * @param publications    This method takes an ArrayList containing the papers the scholar has published.
	 */
	public void setPublications(ArrayList<ScholarlyPaper> publications) {
		this.publications = publications;
	}//end setPublications()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************

	

	
	
}
