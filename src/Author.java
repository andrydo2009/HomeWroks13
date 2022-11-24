import java.util.Objects;

public class Author

{
    String firstNameAuthor;     //Имя
    String middleNameAuthor;   //Отчевство
    String lastNameAuthor;    //Фамилия



    public Author(String lastNameAuthor,String firstNameAuthor,String middleNameAuthor)
    {
        this.firstNameAuthor=firstNameAuthor;
        this.middleNameAuthor=middleNameAuthor;
        this.lastNameAuthor=lastNameAuthor;

    }
    public String getFirstNameAuthor()
    { return this.firstNameAuthor;}
    public String getMiddleNameAuthor()
    { return this.middleNameAuthor;}
    public String getLastNameAuthor()
    { return this.lastNameAuthor;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstNameAuthor,author.firstNameAuthor)
                && Objects.equals(middleNameAuthor,author.middleNameAuthor)
                && Objects.equals(lastNameAuthor,author.lastNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstNameAuthor, middleNameAuthor, lastNameAuthor);
    }

    @Override
    public String toString() {
        return "Автор - "+lastNameAuthor+" "+firstNameAuthor+" "+middleNameAuthor;
   }
}

//the End&