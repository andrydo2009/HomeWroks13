public class HomeWorks13 {
    public static void main(String[] args) {
        Author authorOne = new Author("Сорокин", "Питирим", "Александрович");
        System.out.println(authorOne);
        System.out.println(authorOne.equals(authorOne));
        Book bookOne = new Book("ЧЕЛОВЕК. ЦИВИЛИЗАЦИЯ. ОБЩЕСТВО", authorOne, 1992);
        System.out.println(bookOne);
        bookOne.setYearPublication(2010);
        System.out.println("Книга переиздавалась в " + bookOne.getYearPublication());



        Author authorToo = new Author("Мартин", "Роберт", "Сесил");
        System.out.println(authorToo);
        System.out.println(authorOne.equals(authorToo));
        Book bookToo = new Book("Чистый Код", authorToo, 2008);
        System.out.println(bookToo);
        System.out.println(bookToo.equals(bookToo));
        bookToo.setYearPublication(2022);
        System.out.println("Книга переиздавалась в " + bookToo.getYearPublication());
        System.out.println(bookToo.equals(bookOne));
        System.out.println(bookToo.hashCode());


    }

}