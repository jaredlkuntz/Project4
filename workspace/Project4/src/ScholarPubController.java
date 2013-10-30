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

public class ScholarPubController {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the model which the controller manipulates.*/
	private ScholarPubModel theModel;
	/**This is the view from which the controller takes user input.*/
	private ScholarPubSelectionView theView;

	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public ScholarPubController(){
		
	}
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//The Model
	/**
	 * This an accessor for the ScholarPubController's <code>theModel</code> data field.
	 * </P>
	 * @return theModel    This method returns the model which the controller manipulates.
	 */
	public ScholarPubModel getTheModel(){
		return this.theModel;
	}//end getTheModel()
	
	//The View
	/**
	 * This an accessor for the ScholarPubController's <code>theView</code> data field.
	 * </P>
	 * @return theView    This method returns the selection view from which the controller receives input.
	 */
	public ScholarPubSelectionView getTheView(){
		return this.theView;
	}//end getTheView()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//The Model
	/**
	 * This is a mutator for the ScholarPubController's <code>theModel</code> data field.
	 * 
	 * @param newModel    This method designates a model which the controller will manipulate.
	 */
	public void setTheModel(ScholarPubModel newModel){
		this.theModel = newModel;
	}//end setTheModel()
	
	//The View
	/**
	 * This is a mutator for the ScholarPubController's <code>theView</code> data field.
	 * 
	 * @param newView    This method designates a view from which the controller will take input.
	 */
	public void setTheView(ScholarPubSelectionView newView){
		this.theView = newView;
	}//end setTheView()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
	public void addScholar (String name, String institutionalAffiliations, String researchAreas){
		
	}
	
	public void deleteScholar (Scholar scholar){
		
	}
	
	public void clearScholars () {
		
	}
	
	public void addConferenceMeeting (HashMap<String, Scholar> organizers, HashMap<String, Scholar> contributors, String month, int year, Location location){
		
	}
	
	public void addJournalIssue (HashMap<String, Scholar> organizers, HashMap<String, Scholar> contributors, String month, int year, Location location, int volume, int issue){
		
	}
	
	public void deleteSerial (Serial serial){
		
	}
	
	public void clearSerials () {
		
	}
	
	public void addPaper (HashMap<String, Scholar> authors, String title, String digitalObjectIdentifier, int firstPage, int lastPage){
		
	}
	
	public void deletePaper (ScholarlyPaper paper){
		
	}
	
	public void clearPapers () {
		
	}
	
	public void saveScholarship (Scholarship scholarship) {
		
	}
	
	public Scholarship loadScholarship (String filename) {
		Scholarship newScholarship = new Scholarship();
		return newScholarship;
	}
	
	public void exportScholarship (Scholarship scholarship){
		
	}
	
	public Scholarship importScholarship (String filename) {
		Scholarship newScholarship = new Scholarship();
		return newScholarship;
	}
	
	public Histogram plotTypeOfPublication(String key){
		Histogram histogram = new Histogram();
		return histogram;
	}
	
	public Histogram plotPublicationsPerYear(String key){
		Histogram histogram = new Histogram();
		return histogram;
	}
	
	public Histogram plotConferencePapersPerYear(String key){
		Histogram histogram = new Histogram();
		return histogram;
	}
	
	public Histogram plotJournalArticlesPerYear(String key){
		Histogram histogram = new Histogram();
		return histogram;
	}
	
	public Histogram plotCoAuthorsPerPublication(String key){
		Histogram histogram = new Histogram();
		return histogram;
	}
	
	
}
