
public class LockerDemo 
{
	/*** Class Methods ***/
	
	public void startTesting()
	{
		
		/*** Local Variables ***/
		
		Locker mickeyMouseLocker = null;
		
		Locker donaldDuckLocker = null;
		
		
		
		/*** Instantiate object ***/
		
		mickeyMouseLocker = new Locker( 100, "Mickey Mouse", (byte) 3, 
				              new CombinationLock( (byte) 28, (byte) 17, (byte) 39 ) );
		
		donaldDuckLocker = new Locker( 275, "Donald Duck", (byte) 0, 
	              new CombinationLock( (byte) 35, (byte) 16, (byte) 27 ) );
		
		
		
		/*** Display initial state of objects ***/
		
		System.out.println( "\n Mickey Mouse's Locker: " +  "\n" + mickeyMouseLocker.toString()  );
		
		System.out.println( "\n\n Donald Duck's Locker: " +  "\n" + donaldDuckLocker.toString()  );
		
		
		
		/*** Attempt to Open Mickey's Locker ***/
		
//		if ( mickeyMouseLocker.openLocker( (byte) 35, (byte) 16, (byte) 27 ) )
//			System.out.println( "\nMickey's locker was opened!" );
//
//		else
//			System.out.println( "\nMickey's locker was NOT opened!" );	
		
		/*** Attempt to Open Mickey's Locker ***/
		
		if ( mickeyMouseLocker.openLocker( (byte) 28, (byte) 17, (byte) 39 ) )
			System.out.println( "\nMickey's locker was opened!" );

		else 
			System.out.println( "\nMickey's locker was NOT opened!" );			
		
		
		
		/*** Test setters ***/
		
	    mickeyMouseLocker.putBookInLocker( 3 );
		donaldDuckLocker.removeBookFromLocker( 1 );		
		
		
		
		/*** Display modified state of objects ***/
		
		System.out.println( "\nMickey Mouse's Locker Updated: " + "\n" + mickeyMouseLocker.toString()  );
		
		System.out.println( "\nDonald Duck's Locker Updated: " +  "\n" + donaldDuckLocker.toString()  );	
	}
	
	
	
	/*** Application ***/
	
	public static void main (String args[])
	{
		LockerDemo driver = new LockerDemo();
		
		driver.startTesting();
	}
}