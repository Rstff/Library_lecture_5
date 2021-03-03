public class Main {

    public static void main(String[] args) {
        Book[] arrayBooks = new Book[6];
        arrayBooks[0] = new Book("Testirovanie_dot_com", "Roman_Savin", 312);
        arrayBooks[1] = new Book("Core Java", "Сау S. Horstmann", 1, 864);
        arrayBooks[2] = new Book("Understanding SQL", "MARTIN GRUBER");
        arrayBooks[3] = new Book("Harry Potter and the Chamber of Secrets", 360);
        arrayBooks[4] = new Book("Harry Potter and Philosopher's Stone", 332);
        arrayBooks[5] = new Book("A Game of Thrones", "George R. R. Martin",
                1, 694);
        Reader reader = new Reader();
        Book selectBook = reader.choiceBook(arrayBooks);
        reader.readBook(selectBook);
        reader.evaluation(selectBook);
    }
}
