package homework;


import java.util.Comparator;

// Создайте компаратор, который позволит сортировать книги по названию,
// при одинаковых названиях - по автору (и там, и там - по алфавиту)
public class BookTitleComparator implements Comparator<Book> {

  private final boolean ignoreCase;

  public BookTitleComparator(boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  @Override
  public int compare(Book b1, Book b2) {
    String title1 = b1.getTitle();
    String title2 = b2.getTitle();
    if (ignoreCase) {
      title1 = title1.toLowerCase();
      title2 = title2.toLowerCase();
    }
    if (title1.equals(title2)) {
      return title1.compareTo(title2);
    }
    String author1 = b1.getAuthor();
    String author2 = b2.getAuthor();
    if (ignoreCase) {
      author1 = author1.toLowerCase();
      author2 = author2.toLowerCase();
    }
    return author1.compareTo(author2);
    }
  }
