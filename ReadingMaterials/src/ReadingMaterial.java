
public class ReadingMaterial 
{

	/*** Class Constants ***/

	private final String DEFAULT_TITLE    		 = "Java is Fun!";
	private final String DEFAULT_EDITOR          = "John Doe";
	private final int  DEFAULT_NUMBER_OF_PAGES = 150;
	private final int  DEFAULT_YEAR_PUBLISHED  = 2015;        

	
	/*** Class Variables ***/
	
	private String title;
	private String editor;
	private int numberOfPages;
	private int yearPublished;
	
	
	/*** Constructors ***/
	
	public ReadingMaterial()
	{
		this.title 			= DEFAULT_TITLE;
		this.editor         = DEFAULT_EDITOR;
		this.numberOfPages  = DEFAULT_NUMBER_OF_PAGES;
		this.yearPublished  = DEFAULT_YEAR_PUBLISHED;
	
	}
	
	public ReadingMaterial( String title, String editor, int numberOfPages, int yearPublished )
	{
		
		this.title 		   = title;
		this.editor		   = editor;
		this.numberOfPages = numberOfPages;
		this.yearPublished = yearPublished;
	
	}

	
	/*** Accessor Methods -- getters ***/
	
	public String getTitle ()
	{
		return this.title;
	}
	
	public String getEditor()
	{
		return this.editor;
	}
	
	public int getNumberOfPages()
	{
		return this.numberOfPages;
	}
	
	public int getYearPublished()
	{
		return this.yearPublished;
	}
	
	
	@Override
	public String toString()
	{
		return "             Title: "                + getTitle() + 
			   "\n             Editor: "             + getEditor() + 
			   "\n             NumberOfPages: "      + getNumberOfPages() +
			   "\n             Year Published: "     + getYearPublished();
	}
	
	
	
	/*** Mutator/Transformer Methods -- setters ***/
	
	public void  setTitle ( String title )
	{
		this.title = title;
	}
	
	public void setEditor( String editor )
	{
		this.editor = editor;
	}
	
	public void setNumberOfPages( int numberOfPages )
	{
		this.numberOfPages = numberOfPages;
	}
	
	public void setYearPublished( int yearPublished )
	{
		this.yearPublished = yearPublished;
	}

}
