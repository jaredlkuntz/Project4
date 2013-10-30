

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

//TODO Update javadoc info for project 4 
/**
 * Project #3 CS 2334, Section 010 22 October, 2013
 * <P>
 * This class generates histograms from a HashMap<Integer, Integer> dataset of the various types of graphs specified
 * in the Project 3 documentation. The code is a modified version of the Histogram.java example found in Chapter 17 of 
 * Liang's Introduction to Java Programming, 9th edition. The code was edited to work with a HashMap<Integer, Integer> 
 * as the main dataset, as well adding drawn Strings to display the Author's name and the type of graph. Additional changes
 * were made to resize the graph so that it will always fit in the window.   
 * </P>
 * 
 * @version 2.0
 */
public class Histogram extends JPanel {
	
	//Serialization
	private static final long serialVersionUID = 1L;
	
	// *******************************************************************************************************************
	// *************************************--------Variables--------*****************************************************
	// *******************************************************************************************************************
	
	/**This is a HashMap<Integer, Integer> that holds either years or number of co-authors as keys, and counts as values*/
    private HashMap<Integer, Integer> count;
    
    /**This is an integer that holds either the last year with publications or the maximum number of co-authors*/
    private int max;
    
    /**This is an integer that holds either the first year with publications or the minimum number of co-authors*/
    private int min;
    
    /**This is a String that holds the author's name*/
    private String author = "";
    
    /**This is a String that holds the type of graph*/
    private String title = "";
    
    // *********************************************************************************************************************
 	// ****************************************-------Methods-------********************************************************
 	// *********************************************************************************************************************
    
    //Show histogram
    /**
	 * This method paints the histogram.
	 * <P>
	 * Algorithm:<br>
	 * 1. Assign values to data fields.<br>
	 * 2. Paint the histogram.<br>
	 * </P>
	 * 
	 */
    public void showHistogram(HashMap<Integer, Integer> count, int max, int min, String author, String title) {
        //Assign values to data field
    	this.count = count;
        this.max = max;
        this.min = min;
        this.author = author;
        this.title = title;
        
        //Paint histogram
        repaint();
    }//end showHistogram()

    
    /**
	 * This method generates the histogram from a provided dataset. 
	 * <P>
	 * Algorithm:<br>
	 * 1. Get the dimensions of the window.<br>
	 * 2. Find the width for each individual bar.<br>
	 * 3. Find the unit size which the graph will use for scaling<br>
	 * 4. Generate a unique bar for each point of data in the dataset's range, including zero values<br>
	 * 5. Paint an author and title to the histogram
	 * </P>
	 * 
	 */
    protected void paintComponent(Graphics g) {
    	
    	// No display if count is null
        if (count == null) return; 

        super.paintComponent(g);

        // Find the panel size and bar width and interval dynamically
        int width = getWidth();
        int height = getHeight();
        int interval;
        int individualWidth = (int)(((width - 40) / 24) * 0.60);
    
        
        if (max - min == 0){
        	interval = (width - 100) / (1) ;
        }
        else {
        	interval = (width - 100) / (max - min);
        }
        //Find the maximum value to scale the graph
        int maxValue = 0; 
        
        for (Integer n: count.values()){
        	if (n > maxValue){
    		    maxValue = n;
    	    }
        }
        
        
        // x is the start position for the first bar in the histogram
        int x = 30;

        // Draw a horizontal base line
        g.drawLine(10, height - 45, width - 10, height - 45);
        
        // Draw the bar and labels
        for (int i = min; i <= max; i++) {
    	
    	    int barHeight;
      
    	    //Look for a value in the dataset or determine there is no value
            if (count.containsKey(i)){	
                barHeight = (int)((((double)count.get(i) *  (400 / maxValue))));
            }
            else {
    	        barHeight = 0;
            }
            
            // Display a bar (i.e. rectangle)
            g.drawRect(x, height - 45 - barHeight, individualWidth, barHeight);

            // Display a label under the base line
            if (title.equalsIgnoreCase("Type of Publication") && i == 0){
    	        g.drawString("Conference Papers" , x - 10, height - 30);
            }
            else if (title.equalsIgnoreCase("Type of Publication") && i == 1){
    	        g.drawString("Journal Articles" , x - 50, height - 30);
            }
            else {
            g.drawString((i + ""), x , height - 30);
            }
      
      
            //Display bar count
            if (count.containsKey(i)){
                g.drawString((count.get(i) + ""), x - 4 + individualWidth / 2,  height - barHeight - 50 );
            }
            else {
    	        g.drawString((0 + ""), x - 4 + individualWidth / 2, height - barHeight - 50);  
            }
            
            // Move x for displaying the next character
            x += interval;
        }
    
        //Draw the author's name
        g.drawString(author, width / 2 - author.length() / 2 ,  50);
    
        //Draw title
        g.drawString(title, width / 2 - title.length() / 2 - title.length() / 2 ,  70);
    }//end PaintComponent()

    
    /**
	 * This method resizes the panel to fit the histogram.
	 * <P>
	 * Algorithm:<br>
	 * 1. Scale the x component to the number of items in the histogram.<br>
	 * 2. Check if the graph is within reasonable viewing parameters for humans. If not, make it so.<br>
	 * 3. Return the dimensions<br>
	 * </P>
	 * 
	 * @return    Dimensions    This method returns JPanel dimensions. 
	 */
    public Dimension getPreferredSize() {
    	//Scale the panel to fit the graph
	    int x = (max - min + 1) * 60 + 100;
	    
	    //Scale up for small graphs
	    if (x < 800) {
		    x = 800;
	    }
	    
	    //Return dimensions
        return new Dimension(x , 600);
    }//end getPreferredSize()
}//end class Histogram
