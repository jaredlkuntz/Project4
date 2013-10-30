/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */
public class Location {
    // *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	/**This is the city where the conference was held, or the city in which the journal was published. */
	private String city;
	/**This is the state where the conference was held, or the state in which the journal was published. */
	private String state;
	/**This is the country where the conference was held, or the country in which the journal was published. */
	private String country;
	// *******************************************************************************************************************
	// *************************************-------Constructors-------****************************************************
	// *******************************************************************************************************************
	public Location(){
		
	}
	// *********************************************************************************************************************
	// ****************************************-------Getters-------********************************************************
	// *********************************************************************************************************************
	
	//City
	/**
	 * This an accessor for the Location's <code>city/code> data field.
	 * </P>
	 * @return city    This method holds the name of a city.
	 */
	public String getCity() {
		return city;
	}//end getCity()
	
	//State
	/**
	 * This an accessor for the Location's <code>state/code> data field.
	 * </P>
	 * @return state    This method holds the name of a state.
	 */
	public String getState() {
		return state;
	}//end getState()
	
	//Country
	/**
	 * This an accessor for the Location's <code>country/code> data field.
	 * </P>
	 * @return country    This method holds the name of a country.
	 */
	public String getCountry() {
		return country;
	}//end getCountry()
	
	
	// *********************************************************************************************************************
	// ****************************************-------Setters-------********************************************************
	// *********************************************************************************************************************
	
	//City
	/**
	 * This is a mutator for the Location's <code>city</code> data field.
	 * 
	 * @param city    This method takes a String parameter containing the name of a city.
	 */
	public void setCity(String city) {
		this.city = city;
	}//end setCity()
	
	//State
	/**
	 * This is a mutator for the Location's <code>state</code> data field.
	 * 
	 * @param state    This method takes a String parameter containing the name of a state.
	 */
	public void setState(String state) {
		this.state = state;
	}//end setState()
	
	//Country
	/**
	 * This is a mutator for the Location's <code>country</code> data field.
	 * 
	 * @param country    This method takes a String parameter containing the name of a country.
	 */
	public void setCountry(String country) {
		this.country = country;
	}//end setCountry()
	
	// *********************************************************************************************************************
	// ****************************************-------Methods-------********************************************************
	// *********************************************************************************************************************
}
