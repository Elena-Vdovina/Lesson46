package homework;


import java.util.Comparator;

// Создайте компаратор, который позволит сортировать книги по названию,
// при одинаковых названиях - по автору (и там, и там - по алфавиту)
public class BookTitleComparator implements Comparator<Book> {

  private final boolean ignoreCase;

  public BookTitleComparator(boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }
}
