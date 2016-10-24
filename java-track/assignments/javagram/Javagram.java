package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;


public class Javagram {
	static ArrayList<Filter> filters = new ArrayList<Filter>();
	//Instantiate filters and add to ArrayList filters
	private static void createList(){
		filters.add(new BlackAndWhiteFilter());
		filters.add(new BlueFilter());
		filters.add(new BrighterFilter());
		filters.add(new FlipHorizFilter());
		filters.add(new GrayScaleFilter());
	}

	//Get the chosen Filter
	private static Filter getFilter(int menuChoice) {
		Filter chosenFilter=filters.get(menuChoice-1);
		return chosenFilter;
	}

	private static void displayFilterMenu(){
		System.out.println("Please select a filter");
		//Print filter choices
		for(int i=0; i<filters.size();i++){
			System.out.println((i+1)+". "+filters.get(i).getName());
		}
		System.out.println("Please Select an option");
	}

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		int menuChoice=0;

		// prompt user for image to filter and validate input
		do {

			String imagePath = "path not set";

			// try to open the file
			try {

				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();

				//				String[] relPathParts = relPath.split(File.separator);
				//				imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));

				imagePath = (dir + "\\" + relPath);
				picture = new Picture(imagePath);

			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}

		} while(picture == null);

		// Prompt user for filter and validate input
		
		createList();
		try{
			displayFilterMenu();
			menuChoice= in.nextInt();
			if (menuChoice<1||menuChoice>filters.size()){
				throw new RuntimeException();
			}
		}
		catch(RuntimeException e){
			do{
			System.out.println("Invalid selection: " + menuChoice + " Please try again");
				menuChoice= in.nextInt();
			} while(menuChoice<1||menuChoice>5);
		}

		//Pass filter ID int to getFilter, and get an instance of Filter back 
		Filter filter = getFilter(menuChoice);			

		// filter and display image
		Picture processed = filter.process(picture);
		processed.show();

		System.out.println("Image successfully filtered");

		// save image, if desired
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		File f = new File (dir +"\\" + fileName);

		// If the user enters the same file name as the input file, confirm that they want to overwrite the original

		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} 
		else if(f.exists()){
			System.out.println("Are you sure you want to overwrite the original file? Y/N");
			String selection = in.next();
			while (!(selection.equals("Y")|| selection.equals("N"))){
				System.out.println("Invalid choice. Are you sure you want to overwrite the original file? Y/N");
				selection = in.next();
			}
			if(selection.equals("N")){
				System.out.println("Save image to (relative to " + dir+")");
				fileName = in.next();
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
			}
			else if (selection.equals("Y")){
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName);
			}
		}
		else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	

		// close input scanner
		in.close();
	}
}