
public class TechnicalJournal extends ReadingMaterial
{
/*** Class Constants ***/
	
	private final boolean DEFAULT_SCIENTIFIC = true;
	private final String  DEFAULT_INVENTIONS = "New comptuers";
	
	
	/*** Class Variables ***/
	
	private boolean scientific;
	private String inventions;
	
	
	/*** Constructors ***/
	
	public TechnicalJournal()
	{
		super();
		this.setScientific( DEFAULT_SCIENTIFIC );
		this.setInventions( DEFAULT_INVENTIONS );
	}
	
	public TechnicalJournal( String title, String editor, int numberOfPages, int yearPublished,
							 boolean scientific, String inventions)
	{
		super( title, editor, numberOfPages, yearPublished );
		this.setScientific( scientific );
		this.setInventions( inventions );
	}
	
	
	/*** Accessor Methods -- getters 
	 * @return ***/
	
	public boolean getScientific()
	{
		return this.scientific;
	}
		
	public String getInventions()
	{
		return this.inventions;
	}
	
	@Override
	public String toString()
	{
		return "\nTechnical Journal: \n"              + super.toString() + 
				   "\n             Scientific: "      + this.getScientific() +
				   "\n             Inventions: "      + this.getInventions();
	}
	

	/*** Mutators/Transformers -- setters ***/
	
	public void setScientific( boolean scientific )
	{
		this.scientific = scientific;
	}
	
	public void setInventions( String inventions )
	{
		this.inventions = inventions;
	}
	
}
