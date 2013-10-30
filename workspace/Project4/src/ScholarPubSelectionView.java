import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 * Project #4 CS 2334, Section 010 28 October, 2013
 * <P>
 * 
 * </P>
 * 
 * @version 3.0
 */

public class ScholarPubSelectionView {

	private JFrame frame;
	private JMenuBar menubar;
	private JMenuItem file;
	private JMenu fileSubmenu;
	private JMenuItem saveScholarship;
	private JMenuItem loadScholarship;
	private JMenuItem importScholarship;
	private JMenuItem exportScholarship;
	private JMenu plotSubmenu;
	private JMenuItem typeOfPublication;
	private JMenuItem publicationsPerYear;
	private JMenuItem ConferencePapersPerYear;
	private JMenuItem JournalArticlesPerYear;
	private JMenuItem coAuthorsPerPublication;
	private JLabel jlbScholars;
	private JLabel jlbSerials;
	private JLabel jlbPapers;
	private JButton jbtAddScholar;
	private JButton jbtDeleteScholar;
	private JButton jbtClearScholars;
	private JButton jbtAddSerial;
	private JButton jbtDeleteSerial;
	private JButton jbtClearSerials;
	private JButton jbtaddPaper;
	private JButton jbtdeletePaper;
	private JButton jbtClearPapers;
	private JDialog jdlAddScholar;
	private JDialog jdlDeleteScholar;
	private JDialog jdlClearScholars;
	private JDialog jdlAddSerial;
	private JDialog jdlDeleteSerial;
	private JDialog jdlClearSerials;
	private JDialog jdlAddPaper;
	private JDialog jdlDeletePaper;
	private JDialog jdlClearPapers;
	private JDialog jdlImportScholarship;
	private JDialog jdlExportScholarship;
	private JDialog jdlSaveScholarship;
	private JDialog jdlLoadScholarship;
	private JDialog jdlSelectAuthor;

}
