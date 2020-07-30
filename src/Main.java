//Import all libraries from java swing - used to generate graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//Generate new window
		JFrame frame = new JFrame ();
		
		//Create Text area for searching
		JTextArea searchBar = new JTextArea("Search here", 1, 1);
		
		JButton b = new JButton("Search");
		//Parameters are given in x, y, width, height format
		b.setBounds(600, 1, 100, 15);
		searchBar.setBounds(1, 1, 600, 15);
		
		//Add an event listener on b
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            searchBar.setText("");  
	    	        }  
	    	    });  
				
		//Actually add the button element
		frame.add(b);
		
		//Add the searchBar
		frame.add(searchBar);
		
		//Define size of f
		frame.setSize(800, 700);
		
		//Use no layout managers
		frame.setLayout(null);
		
		//Make it visible
		frame.setVisible(true);
	}

}
