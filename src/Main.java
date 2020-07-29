//Import all libraries from java swing - used to generate graphics
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		//Generate new window
		JFrame frame = new JFrame ();
		
		//Create Text area for searching
		JTextArea searchBar = new JTextArea("Search here");
		
		JButton b = new JButton("Search");
		//Parameters are given in x, y, width, height format
		b.setBounds(130,100,100, 40);
		searchBar.setBounds(1, 70, 100, 40);
		
		//Add an event listener on b
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            searchBar.setText("Welcome to Javatpoint.");  
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
