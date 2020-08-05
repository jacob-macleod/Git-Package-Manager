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
	
	public static String splitString (String string, String token, String newLineToken) {
		String[] arrOfString = string.split(token, string.length()); 
		
		string = null;
		for (String i : arrOfString) {
			if (i.equals(newLineToken)) {
				string = string + "\n";
			} else {
				string = string + i;
			}
		}
		return string;
	}

	public static String scrapeWebPage () {
		Document doc;
		try {
			doc = Jsoup.connect("https://github.com/search?q=git+package+manager&ref=simplesearch/").get();
			
			//Get title of page
			String title = doc.title();
			System.out.println(title);
			
			//Get elements with a class of v-align-middle - contains repository names
			String repoNames = doc.getElementsByClass("v-align-middle").text();
			String formattedRepoNames = splitString(repoNames, " ", " ");
			return formattedRepoNames;
			//Next, print out formattedRepoNames using jswing jlabel
			//System.out.println(formattedRepoNames);
			/*String strLinks = links.toString();
			//We need to split strLinks by class then by  href then by " to get the href = "This part only"
			strLinks = splitString(strLinks, "href");
			//strLinks = splitString(strLinks, """);
			strLinks = splitString(strLinks, "v-align-middle");
			System.out.println("STR LINKS: ________________________________________");
			System.out.println(strLinks);*/
		} catch (IOException e) {
			e.printStackTrace();
			return "Failed to scrape data";
		}
	}
	
	public static void main(String[] args) {
		scrapeWebPage();
		
		System.out.println("Before breakpoint 1");
		//Generate new window
		JFrame frame = new JFrame ();
		String hello = "Hello World";
		System.out.println("After breakpoint 1");
		//Create Text area for searching
		JTextArea searchBar = new JTextArea("Search here", 1, 1);
		JButton b = new JButton("Search");		
		String test = scrapeWebPage();
	    JLabel repoNames = new JLabel("null↵↵↵↵↵↵fsprojects/Paketocaml/\nopammob-sakai/UpmGitExtensionalpine-docker/gitgdotdesign/elm-github-installsvetlyak40wt/dotfileraerys/gpmmob-sakai/GitDependencyResolverForUnityTheLartians/CPM.cmakebioconda/bioconda.github.io"); 
		
		//Parameters are given in x, y, width, height format
		b.setBounds(600, 1, 100, 15);
		searchBar.setBounds(1, 1, 600, 15);
	    repoNames.setBounds(20, 1, 780, 680);  
	    System.out.println("After breakpoint 2");
		//Add an event listener on b
		/*
	    b.addActionListener(new ActionListener(){  
	    	public void actionPerformed(ActionEvent e){  
	    	            searchBar.setText("");  
	    	        }  
	    	    }); */
				
		//Add all the elements
		frame.add(b);
		frame.add(searchBar);
		frame.add(repoNames);
		
		
		//Define size of f
		frame.setSize(800, 700);
		
		//Use no layout managers
		frame.setLayout(null);
		
		//Make it visible
		frame.setVisible(true);
	}

}
