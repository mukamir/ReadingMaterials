
public class Novel extends ReadingMaterial
{
	
	/*** Class Constants ***/
	
	private final String DEFAULT_GENRE             = "Novel";
	private final String DEFAULT_PRIMARY_CHARACTER = "John Doe";
	
	
	/*** Class Variables ***/
	
	private String  genre;
	private String primaryCharacter; 
	
	
	/*** Constructors ***/
	
	public Novel()
	{
		super();
		this.setGenre( DEFAULT_GENRE );
		this.setPrimaryCharacter( DEFAULT_PRIMARY_CHARACTER );
	}
	
	public Novel( String title, String editor, int numberOfPages, int yearPublished,
					 String genre, String primaryCharacter )
	{
		super( title, editor, numberOfPages, yearPublished );
		this.setGenre( genre );
		this.setPrimaryCharacter( primaryCharacter );
	}
	
	
	/*** Accessor Methods -- getters ***/
	
	public String getGenre()
	{
		return this.genre;
	}
	
	public String getPrimaryCharacter()
	{
		return this.primaryCharacter;
	}
	
	@Override
	public String toString()
	{
		return "\nNovel: \n"                           + super.toString() + 
			   "\n             Genre: "                + this.getGenre() +
			   "\n             Primary character(s): " + this.getPrimaryCharacter();
	}
	
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setGenre( String genre )
	{
		this.genre = genre;
	}
	
	public void setPrimaryCharacter( String primaryCharacter )
	{
		this.primaryCharacter = primaryCharacter;
	}
}
