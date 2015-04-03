
import java.util.*;

public class ReadingMaterialsDemo 
{
	/*** Class Methods ***/
	
	public void startTest()
	{
		/*** Local Variables ***/
		
		ArrayList<ReadingMaterial> listOfReadingMaterials = new ArrayList<ReadingMaterial>();
		Magazine         magazine         = null;
		TextBook         textBook         = null;
		TechnicalJournal technicalJournal = null;
		Novel            novel            = null;
		
		/*** Instantiate one of each electronic device ***/

		magazine         = new Magazine( "Forbes", "Tanes Kanchanawanchai", 101, 2015, "Richest Programmers of USA" );
		textBook         = new TextBook( "Java Problem Solving", "Tanes K", 500, 2015, "Computer Science", 25 );		
		technicalJournal = new TechnicalJournal( "Futurama", "Amirkhan Mukashev", 100, 2016, true, "New Nano Technologies" );		
		novel            = new Novel( "A Study in Scarlet", "Arthur Conan Doyle", 550, 1886, "Detective", "Sherlock Holmes and Dr. Watson" );
		
		/*** Store them in arraylist ***/
		
		listOfReadingMaterials.add( magazine );
		listOfReadingMaterials.add( textBook );
		listOfReadingMaterials.add( technicalJournal );
		listOfReadingMaterials.add( novel );
		
		/*** Display each electronic device ***/
		
		for ( ReadingMaterial reading : listOfReadingMaterials )
		{
			System.out.println( reading.toString() );
		}
	}
	
	/*** Application ***/
	
	public static void main( String [] args )
	{
		ReadingMaterialsDemo driver = new ReadingMaterialsDemo();
		driver.startTest();
	}
}
