//Import all libraries from java swing - used to generate graphics
import java.awt.event.ActionEvent;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.select.*;
import org.jsoup.helper.*;
import org.jsoup.internal.*;
import org.jsoup.nodes.*;
import org.jsoup.safety.*;
import org.jsoup.safety.*;
import javax.swing.*;

public class Main {

	public static void scrape_web_page () {
		Document doc;
		try {
			doc = Jsoup.connect("https://github.com/search?q=git+package+manager&ref=simplesearch/").get();
			
			//Get title of page
			String title = doc.title();
			System.out.println(title);
			
			//Get elements with a href thing
			Elements links = doc.select("a[href]");
			String strLinks = links.toString();
			//We need to split strLinks by href then by " to get the href = "This part only"
			System.out.println(strLinks);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		scrape_web_page();
		//Generate new window
		JFrame frame = new JFrame ();
		
		//Create Text area for searching
		JTextArea searchBar = new JTextArea("Search here", 1, 1);
		
		JButton b = new JButton("Search");
		//Parameters are given in x, y, width, height format
		b.setBounds(600, 1, 100, 15);
		searchBar.setBounds(1, 1, 600, 15);
		
		//Add an event listener on b
		/*
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            searchBar.setText("");  
	    	        }  
	    	    }); */
				
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
