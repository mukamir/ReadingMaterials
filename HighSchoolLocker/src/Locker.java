import java.util.Scanner;

public class Locker 
{
	Scanner keyboard = new Scanner(System.in);
	
	
	/*** Class Constants ***/
	
	private final int    DEFAULT_LOCKER_NUMBER   = 1;
	private final String DEFAULT_NAME            = "John Doe" ;
	private final byte   DEFAULT_NUMBER_OF_BOOKS = 0;
	
	
	
	/*** Class Attributes -- state of the object ***/
	
	private int             lockerNumber;
	private String          name;
	private byte            numberOfBooks;
	private CombinationLock combinationLock;
	
	
	
	/*** Class Methods -- Constructors -- setter -- set the state ***/
	
	public Locker()
	{
		this.lockerNumber    = DEFAULT_LOCKER_NUMBER;
		this.name            = DEFAULT_NAME;
		this.numberOfBooks   = DEFAULT_NUMBER_OF_BOOKS;
		this.combinationLock = new CombinationLock();	
	}		
	
	public Locker( int lockerNumber, String name, byte numberOfBooks, 
			       CombinationLock combinationLock )
	{
		this.lockerNumber    = lockerNumber;
		this.name            = name;
		this.numberOfBooks   = numberOfBooks;
		this.combinationLock = combinationLock;	
	}
	
	
	
	/*** Class Methods -- Accessor -- getter -- return the state ***/
	
	public int getLockerNumber()
	{
		return this.lockerNumber;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	
	public byte getNumberOfBooks()
	{
		return this.numberOfBooks;
	}
	
	
	public CombinationLock getCombinationLock()
	{
		return this.combinationLock;
	}
	
	
	@Override
	public String toString()
	{
		return "\nLocker Number: "      + this.getLockerNumber() +
				"\nName: "             + this.getName() + 
				"\nNumber of Books: "  + this.getNumberOfBooks() +
				"\nCombination Lock: " + combinationLock.toString();			
	}
	
	
	
	/*** Class Methods -- Mutators -- change the state ***/
	
	public void putBookInLocker( int books )
	{
		if ( books >= 0 )
		   this.numberOfBooks += books;
	}
	
	public void removeBookFromLocker( int books )
	{
		if ( books >= 0 )	
		   if ( books <= this.getNumberOfBooks() )	
		       this.numberOfBooks -= books;		
	}
	
	public boolean openLocker( byte com1, byte com2, byte com3 )
	{
		/*** Local Variables ***/
		short inputCombo1, inputCombo2, inputCombo3;
		
		System.out.println ("\nInput three numbers for your combination between 0 and 39: ");
		
		inputCombo1 = keyboard.nextShort();
		inputCombo2 = keyboard.nextShort();
		inputCombo3 = keyboard.nextShort();
		
		System.out.println ("Combination 1: " + inputCombo1 + "\nCombination 2: " + inputCombo2 + "\nCombination 3: " + inputCombo3);
		
		if ( inputCombo1 == com1 )
			if ( inputCombo2 == com2)
				if (inputCombo3 == com3)
		
		return combinationLock.openLock(  com1, com2, com3);
		return false;
	}
}
