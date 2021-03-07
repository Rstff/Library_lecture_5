import java.util.Random;

public class Reader {

    public Book choiceBook(Book[] arrayBooks) {
        Random random = new Random();
        int i = random.nextInt(arrayBooks.length);
        return arrayBooks[i];
    }

    public void readBook(Book selectBook) {

        System.out.println(selectBook.toString());
    }

    public void evaluation(Book selectBook) {
        Random random = new Random();
        int evaluationValue = 0;
        if (selectBook.title != null) {
            evaluationValue = evaluationValue + (selectBook.title).
                    replace(" ", "").length();
        } else {
            evaluationValue = evaluationValue - random.nextInt(10);
        }
        if (selectBook.author != null) {
            evaluationValue = evaluationValue + (selectBook.author).
                    replace(" ", "").length();
        } else {
            evaluationValue = evaluationValue - random.nextInt(10);
        }
        if (selectBook.seriesNumber != 0) {
            evaluationValue = evaluationValue - selectBook.seriesNumber;
        } else {
            evaluationValue = evaluationValue - random.nextInt(10);
        }
        if (selectBook.pageCount != 0) {
            evaluationValue = evaluationValue + selectBook.pageCount;
        } else {
            evaluationValue = evaluationValue - random.nextInt(10);
        }
        System.out.print("Rating book: " + evaluationValue +
                " Book title: " + selectBook.title);

    }
}