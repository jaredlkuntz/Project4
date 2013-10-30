import static org.junit.Assert.*;

import org.junit.Test;


public class ScholarPubControllerTest {
	
	String name = "Kuntz, Jared Layne";
	String institutionalAffiliations = "University of Oklahoma; United States Marine Corps";
	String researchAreas = "Automated Systems; Small Arms Development";
	@Test
	public void testAddScholar() {
		Scholar testScholar = new Scholar();
		
		
		
		
		String[] namesArray = name.split(",");
		
		String[] institutionalAffiliationsArray = institutionalAffiliations.split(";");
		String[] trimmedInstitutionalAffiliationArray = new String[institutionalAffiliationsArray.length];
		
		for (int n = 0; n <trimmedInstitutionalAffiliationArray.length; n++ ){
			trimmedInstitutionalAffiliationArray[n] = institutionalAffiliationsArray[n].trim();
		}
		
		String[] researchAreasArray = researchAreas.split(";");
        String[] trimmedresearchAreasArray = new String[researchAreasArray.length];
		
		for (int n = 0; n <trimmedresearchAreasArray.length; n++ ){
			trimmedresearchAreasArray[n] = researchAreasArray[n].trim();
		}
		
		testScholar.setPrimaryName(namesArray[0].trim());
		testScholar.setSecondaryNames(namesArray[1].trim());
		testScholar.setInstitutionalAffiliations(trimmedInstitutionalAffiliationArray);
		testScholar.setResearchAreas(trimmedresearchAreasArray);
		
		System.out.println(testScholar.getInstitutionalAffiliations()[1]);
		assertTrue(testScholar.getPrimaryName().equalsIgnoreCase("Kuntz"));
		assertTrue(testScholar.getSecondaryNames().equalsIgnoreCase("Jared Layne"));
		assertTrue(testScholar.getInstitutionalAffiliations()[0].equalsIgnoreCase("University of Oklahoma"));
		assertTrue(testScholar.getInstitutionalAffiliations()[1].equalsIgnoreCase("United States Marine Corps"));
		assertTrue(testScholar.getResearchAreas()[0].equalsIgnoreCase("Automated Systems"));
		assertTrue(testScholar.getResearchAreas()[1].equalsIgnoreCase("Small Arms Development"));
		
	}

	@Test
	public void testAddConferenceMeeting() {
		Meeting testMeeting = new Meeting();
		String publicationDate = "January 2013";
		
		testMeeting.setConference(new Conference());
		testMeeting.getConference().setSponsor("The Brookings Institute");
		
		testMeeting.setLocation(new Location());
		testMeeting.getLocation().setCity("Norman");
		testMeeting.getLocation().setState("Oklahoma");
		testMeeting.getLocation().setCountry("'Merica");
		
		
		
		testMeeting.getOrganizers().put("Kuntz", new Scholar());
		testMeeting.getOrganizers().put("Le", new Scholar());
		testMeeting.getOrganizers().put("Bond", new Scholar());
		
		testMeeting.getContributors().put("Jared", new Scholar());
		testMeeting.getContributors().put("Andrew", new Scholar());
		testMeeting.getContributors().put("Daniel", new Scholar());
		
		
		String[] publicationData = publicationDate.split(" ");
		testMeeting.setMonth(publicationData[0]);
		testMeeting.setYear(Integer.parseInt(publicationData[1]));
		
		assertTrue(testMeeting.getOrganizers().size()==3);
		assertTrue(testMeeting.getContributors().size()==3);
		assertTrue(testMeeting.getMonth().equalsIgnoreCase("january"));
		assertTrue(testMeeting.getYear()==2013);
		assertTrue(testMeeting.getConference().getSponsor().equalsIgnoreCase("The Brookings Institute"));
		assertTrue(testMeeting.getLocation().getCity().equalsIgnoreCase("Norman"));
		assertTrue(testMeeting.getLocation().getState().equalsIgnoreCase("Oklahoma"));
		assertTrue(testMeeting.getLocation().getCountry().equalsIgnoreCase("'merica"));
		
	}

	@Test
	public void testAddJournalIssue() {
		JournalIssue testJournalIssue = new JournalIssue();
		String publicationDate = "January 2013";
		
		testJournalIssue.setJournal(new Journal());
		testJournalIssue.getJournal().setPublisher("The Brookings Institute");
		
		testJournalIssue.getJournal().setPublishingLocation(new Location());
		testJournalIssue.getJournal().getPublishingLocation().setCity("Norman");
		testJournalIssue.getJournal().getPublishingLocation().setState("Oklahoma");
		testJournalIssue.getJournal().getPublishingLocation().setCountry("'Merica");
		
		
		
		testJournalIssue.getOrganizers().put("Kuntz", new Scholar());
		testJournalIssue.getOrganizers().put("Le", new Scholar());
		testJournalIssue.getOrganizers().put("Bond", new Scholar());
		
		testJournalIssue.getContributors().put("Jared", new Scholar());
		testJournalIssue.getContributors().put("Andrew", new Scholar());
		testJournalIssue.getContributors().put("Daniel", new Scholar());
		
		
		String[] publicationData = publicationDate.split(" ");
		testJournalIssue.setMonth(publicationData[0]);
		testJournalIssue.setYear(Integer.parseInt(publicationData[1]));
		
		assertTrue(testJournalIssue.getOrganizers().size()==3);
		assertTrue(testJournalIssue.getContributors().size()==3);
		assertTrue(testJournalIssue.getMonth().equalsIgnoreCase("january"));
		assertTrue(testJournalIssue.getYear()==2013);
		assertTrue(testJournalIssue.getJournal().getPublisher().equalsIgnoreCase("The Brookings Institute"));
		assertTrue(testJournalIssue.getJournal().getPublishingLocation().getCity().equalsIgnoreCase("Norman"));
		assertTrue(testJournalIssue.getJournal().getPublishingLocation().getState().equalsIgnoreCase("Oklahoma"));
		assertTrue(testJournalIssue.getJournal().getPublishingLocation().getCountry().equalsIgnoreCase("'merica"));
	}

	@Test
	public void testAddPaper() {
		fail("Not yet implemented");
	}

}
