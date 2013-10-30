import java.util.HashMap;
/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */

public class Scholarship {
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is a master list of all the serials in the program.*/
	HashMap<String, Serial> serials = new HashMap<String, Serial>();
	/**This is a master list of all the scholars in the program. */
	HashMap<String, Scholar> scholars = new HashMap<String, Scholar>();
	/**This is a master list of all the papers in the program. */
	HashMap<String, ScholarlyPaper> papers = new HashMap<String, ScholarlyPaper>();
	
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Scholarship() {
		
	}
	
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//Serials
	/**
	 * This an accessor for the Scholarship's <code>serials</code> data field.
	 * </P>
	 * @return serials    This method returns the serials contained within Scholarship.
	 */
	public HashMap<String, Serial> getSerials(){
		return this.serials;
	}
	
	//Scholars
	/**
	 * This an accessor for the Scholarship's <code>scholars</code> data field.
	 * </P>
	 * @return scholars    This method returns the scholars contained within Scholarship.
	 */
	public HashMap<String, Scholar> getScholars(){
		return this.scholars;
	}//end getScholars()
	
	//Papers
	/**
	 * This an accessor for the Scholarship's <code>papers</code> data field.
	 * </P>
	 * @return papers    This method returns the papers contained within Scholarship.
	 */
	public HashMap<String, ScholarlyPaper> getPapers(){
		return this.papers;
	}//end papers()
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//Serials
	/**
	 * This is a mutator for the Scholarship's <code>serials</code> data field.
	 * 
	 * @param newSerials    This method takes HashMap containing Serials.
	 */
	public void setSerials(HashMap<String, Serial> newSerials){
		this.serials = newSerials;
	}//end setSerials()
	
	//Scholars
	/**
	 * This is a mutator for the Scholarship's <code>scholars</code> data field.
	 * 
	 * @param newScholars    This method takes a HashMap containing Scholars.
	 */
	public void setScholars(HashMap<String, Scholar> newScholars){
		this.scholars = newScholars;
	}//end setScholars()
	
	//Papers
	/**
	 * This is a mutator for the Scholarship's <code>papers</code> data field.
	 * 
	 * @param newPapers    This method takes a HashMap containing ScholarlyPapers.
	 */
	public void setPapers(HashMap<String, ScholarlyPaper> newPapers){
		this.papers = newPapers;
	}//end setPapers()
	
}
