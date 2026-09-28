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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pages;
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
     */
    public void printDetails()
    {
        System.out.println("Title: " + title + ", Author: " + ", pages: " + pages);
    }
}
