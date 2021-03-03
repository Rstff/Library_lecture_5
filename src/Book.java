public class Book {
    String title;
    String author;
    int seriesNumber;
    int pageCount;

    Book(String title, String author, int pageCount) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    Book(String title, String author,
         int seriesNumber, int pageCount) {
        this.title = title;
        this.author = author;
        this.seriesNumber = seriesNumber;
        this.pageCount = pageCount;
    }

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    Book(String title, int pageCount) {
        this.title = title;
        this.pageCount = pageCount;
    }

    @Override
    public String toString() {
        if (seriesNumber == 0 && pageCount == 0) {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
        if (author == null && seriesNumber == 0) {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", pageCount=" + pageCount +
                    '}';

        }
        if (seriesNumber == 0) {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", pageCount=" + pageCount +
                    '}';
        }
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", seriesNumber=" + seriesNumber +
                ", pageCount=" + pageCount +
                '}';
    }
}
