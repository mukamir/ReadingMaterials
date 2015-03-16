/*
 * 
 * 
 * 
 * Comments:  Any bad input gets default
 */

public class CombinationLock 
{

/******* Class Constants ***/
	
	private final byte MINIMUM_COMBO_NUMBER =  0;
	private final byte MAXIMUM_COMBO_NUMBER = 39;
	
	private final byte DEFAULT_COMB_1 = 10;
	private final byte DEFAULT_COMB_2 = 20;
	private final byte DEFAULT_COMB_3 = 30;
	
	private final int SIZE = 40;
	
	
	
/******* Class Variables -- state of the object ***/
	
	private byte com1;
	private byte com2;
	private byte com3;
	
	private byte currentPosition;

	
	
/******* Class Methods -- Constructors -- set the state ***/

	public CombinationLock()
	{
		this.setCom1( DEFAULT_COMB_1 );
		this.setCom2( DEFAULT_COMB_2 );
		this.setCom3( DEFAULT_COMB_3 );
		
		this.resetDial();
		this.turnRight( com1 );
		this.turnLeft(  com2 );		
		this.turnRight( com3 );
	}
	
	public CombinationLock( byte com1, byte com2, byte com3 )
	{
		this.setCom1( com1 );
		this.setCom2( com2 );
		this.setCom3( com3 );
		
		this.resetDial();
		this.turnRight( com1 );
		this.turnLeft(  com2 );		
		this.turnRight( com3 );		
	}
	
	
	
/******* Class methods - Accessors - getters -- return the state ***/
	
	public byte getCom1()
	{
		return this.com1;
	}
	
	
	public byte getCom2()
	{
		return this.com2;
	}
	
	
	public byte getCurrentPosition()
	{
		return this.currentPosition;
	}
	
	
	public byte getCom3()
	{
		return this.com3;
	}
		
	
	
	@Override 
	public String toString()
	{
		return "Combination 1: "   + this.getCom1() +
				" Combination 2: " + this.getCom2() +
				" Combination 3: " + this.getCom3();
	}
	
	
	
/******* Mutators/Transformers -- setter -- change the state ***/
	
	public void resetDial()
	{
		this.currentPosition = 0;
	}
	
	public void setCom1( byte com1 )
	{
		if ( validateComboNumber( com1 ) ) // validateComboNumber is declared below as a helper method
		{
		    this.com1 = com1;
		    this.resetDial();		    
			this.turnRight( com1 );
			this.turnLeft(  com2 );		
			this.turnRight( com3 );
		}
		
		else
		   this.com1 = DEFAULT_COMB_1;			
	}
	
	public void setCom2( byte com2 )
	{
		if ( validateComboNumber( com2 ) )	
		{
		    this.com2 = com2;
		    this.resetDial();
			this.turnRight( com1 );
			this.turnLeft(  com2 );		
			this.turnRight( com3 );
		}
		
		else
		   this.com1 = DEFAULT_COMB_2;			
	}
	
	public void setCom3( byte com3 )
	{
		if ( validateComboNumber( com3 ) )
		{
		    this.com3 = com3;
		    this.resetDial();
			this.turnRight( com1 );
			this.turnLeft(  com2 );		
			this.turnRight( com3 );
		}
		
		else
		   this.com1 = DEFAULT_COMB_3;			
	}	
	
	
	
	public boolean openLock( byte com1, byte com2, byte com3 )
	{
		/*** Local Variables ***/
		
		boolean openStatus = false;  //Assuming bad combo
		
		CombinationLock newLock = null;
		
		
		/*** Create combo lock ***/
	
		newLock = new CombinationLock( com1, com2, com3 );
		
		newLock.resetDial();
		newLock.turnRight( com1 );
		newLock.turnLeft(  com2 );		
		newLock.turnRight( com3 ); 
	
		
		if ( this.getCurrentPosition() == newLock.getCurrentPosition() )
			openStatus = true;
		
		return openStatus;
	}
	
	
	
/******* Class helper methods ***/
	
	private boolean validateComboNumber( byte combo ) // to validate the entered combination 
	{
		/*** Local Variables ***/
		
		boolean validNumber = false;  //Assume bad number
		
		
		/*** Validate number ***/
		
		if ( combo >= MINIMUM_COMBO_NUMBER &&
			 combo <= MAXIMUM_COMBO_NUMBER )
			validNumber = true;
		
		return validNumber;
	}
	
	
	private void turnLeft( byte ticks )
	{
		this.currentPosition -= ticks;
		if ( this.currentPosition < MINIMUM_COMBO_NUMBER )
			 this.turnRight( (byte) (SIZE + currentPosition ) );
	}
	
	
	private void turnRight( byte ticks )
	{
		this.currentPosition += ticks;
		
		if ( this.currentPosition >= MAXIMUM_COMBO_NUMBER )
			 this.currentPosition =  (byte) (this.currentPosition % SIZE);	
	}
}