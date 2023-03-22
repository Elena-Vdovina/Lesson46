package homework;

import java.util.Comparator;

// Создайте компаратор, который позволит сортировать книги по убыванию количества страниц,
// а при совпадающем объёме - по названиям ("по возрастанию", по алфавиту).
public class BookPagesComparator implements Comparator<Book> {

  private final boolean ignoreCase;

  public BookPagesComparator(boolean ignoreCase) {
    this.ignoreCase = ignoreCase;
  }

  @Override
  public int compare(Book b1, Book b2) {
    if ( b1.getPages() != b2.getPages()){
      return b2.getPages()- b1.getPages();
    }
    String title1 = b1.getTitle();
    String title2 = b2.getTitle();
    if (ignoreCase) {
      title1 = title1.toLowerCase();
      title2 = title2.toLowerCase();
    }
    return title1.compareTo(title2);
  }
}
