package homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeworkMain {

  // Создайте компаратор, который позволит сортировать книги по названию,
  // при одинаковых названиях - по автору (и там, и там - по алфавиту)
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();

    books.add(new Book("Author 3", "Book 3", 250));
    books.add(new Book("Author 1", "Book 2", 251));
    books.add(new Book("Author 2", "Book 1", 252));

    Collections.sort(books);
    for (Book b : books) {
      System.out.println(b);
    }

    System.out.println("Книги по названию (по автору) по алфавиту");
    books.sort(new BookTitleComparator(true));
    for (Book b : books){
      System.out.println(b);
    }
  }
}
