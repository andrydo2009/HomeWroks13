import java.util.Objects;

public class Book
{
    private final String nameBook;
    private final Author fullName;
    private int yearPublication;

    public Book(String nameBook,Author fullName,int yearPublication)
    {
        this.nameBook=nameBook;
        this.fullName=fullName;
        this.yearPublication=yearPublication;
    }

    public String getNameBook()
    {return  this.nameBook;}

    public Author getFullName()
    {return  this.fullName;}

    public int getYearPublication()
    {return this.yearPublication;}

    public void setYearPublication(int yearPublication)
    {this.yearPublication=yearPublication;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && nameBook.equals(book.nameBook) && fullName.equals(book.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, fullName, yearPublication);
    }

    @Override
    public String toString() {
     return fullName + ", Название книги - " + nameBook + ", Год издания - "+yearPublication;}


}

//the End&

