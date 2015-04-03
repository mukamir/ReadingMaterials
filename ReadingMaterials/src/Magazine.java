
public class Magazine extends ReadingMaterial
{
	
	/*** Class Constants ***/
	
	private final String DEFAULT_ABOUT = "Richest Real People";
	
	
	/*** Class Variables ***/
	
	private String about;
	
	
	/*** Constructors ***/
	
	public Magazine()
	{
		super();
		this.setAbout( DEFAULT_ABOUT );
	}
	
	public Magazine( String title, String editor, int numberOfPages, int yearPublished,
					 String about)
	{
		super( title, editor, numberOfPages, yearPublished );
		this.setAbout( about );
	}
	
	
	/*** Accessor Methods -- getters ***/
	
	public String getAbout()
	{
		return this.about;
	}
	
	@Override
	public String toString()
	{
		return "Magazine: \n"                + super.toString() + 
			   "\n             About:"       + this.getAbout();
	}
	
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setAbout( String about )
	{
		this.about = about;
	}
}
