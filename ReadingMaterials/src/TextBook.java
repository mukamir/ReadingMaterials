
public class TextBook extends ReadingMaterial
{
/*** Class Constants ***/
	
	private final String DEFAULT_SUBJECT = "Computer Programming";
	private final int  DEFAULT_EDITION = 10;
	
	
	/*** Class Variables ***/
	
	private String subject;
	private int edition;
	
	
	/*** Constructors ***/
	
	public TextBook()
	{
		super();
		this.setSubject( DEFAULT_SUBJECT );
		this.setEdition( DEFAULT_EDITION );
	}
	
	public TextBook( String title, String editor, int numberOfPages, int yearPublished,
					 String subject, int edition )
	{
		super( title, editor, numberOfPages, yearPublished );
		this.setSubject( subject );
		this.setEdition( edition );
	}
	
	
	/*** Accessor Methods -- getters ***/
	
	public String getSubject()
	{
		return this.subject;
	}
	
	public int getEdition()
	{
		return this.edition;
	}
	
	@Override
	public String toString()
	{
		return "\nText Book: \n"            + super.toString() + 
			   "\n             Subject: "   + this.getSubject() +
			   "\n             Edition: "   + this.getEdition();
	}
	
	
	/*** Mutators/Transformers -- setters ***/
	
	public void setSubject( String subject )
	{
		this.subject = subject;
	}
	
	public void setEdition( int edition )
	{
		this.edition = edition;
	}
}
