/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pages;
        refNumber = "";
    }
    
    /**
     * Print the author's name.
     */
    public void printAuthor()
    {
        System.out.println(author);
    }
    
    /**
     * Print the book title.
     */
    public void printTitle()
    {
        System.out.println(title);
    }
    
    /*
     * Return the number of pages
     */
    public int getPages()
    {
        return pages;
    }
    
    /*
     * Print details of the book. 
     * Print reference number if it has been set.
     * else print, print ZZZ
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + ", pages: " + pages);
        
        if (refNumber.length()>0)
        {
            System.out.println("Reference number: " + refNumber);
        }
        
        else 
        {
            System.out.println("Reference number: ZZZ");
        }
    }
    
    /*
     * Set the reference number if it has
     * at least 3 characters
     */
    public void setRefNumber(String ref)
    {
        //Check to see if the ref number has at least 3 characters
        if (ref.length() >= 3) {
            refNumber = ref;
        }
        else 
        {
            System.out.println("Error: reference number must be at least 3");
        }
    }
    
    /*
     * Return the reference number
     */
    public String getRefeNumber()
    {
        return refNumber;
    }
}
