package bean;

import java.io.Serializable;

public class Book implements Serializable {
    private int bookId;
    private String title;
    private String author;
    private int year;
    private boolean loan;
    private int loanExemplars;
    private boolean readingRoom;
    private int readingRoomExemplars;

    public Book(int bookId, String title, String author, int year, boolean loan,
                int loanExemplars, boolean readingRoom, int readingRoomExemplars) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.year = year;
        this.loan = loan;
        this.loanExemplars = loanExemplars;
        this.readingRoom = readingRoom;
        this.readingRoomExemplars = readingRoomExemplars;
    }

    public int getBookId()
    {
        return bookId;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getAuthor()
    {
        return author;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public boolean getLoan()
    {
        return loan;
    }

    public void setLoan(boolean loan)
    {
        this.loan = loan;
    }

    public int getLoanExemplars()
    {
        return loanExemplars;
    }

    public void setLoanExemplars(int loanExemplars)
    {
        this.loanExemplars = loanExemplars;
    }

    public boolean getReading()
    {
        return readingRoom;
    }

    public void setReadingRoom(boolean readingRoom)
    {
        this.readingRoom = readingRoom;
    }

    public int getReadingRoomExemplars()
    {
        return readingRoomExemplars;
    }

    public void setReadingRoomExemplars(int readingRoomExemplars)
    {
        this.readingRoomExemplars = readingRoomExemplars;
    }
}