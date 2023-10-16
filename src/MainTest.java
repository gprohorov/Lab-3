import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/*
  @author   george
  @project   Lab-3
  @class  MainTest
  @version  1.0.0 
  @since 16.10.23 - 17.35
*/

class MainTest {
    List<String> list1 = List.of("Banana", "apple", "orange", "cherry");
    List<Book> books = List.of(
            new Book("Harry Potter", 2001),
            new Book("Clean Code", 2002),
            new Book("Java in action", 2003),
            new Book("Thinking in Java", 2004),
            new Book("Java Patterns", 2005)
    );

    @Test //1
    void filterWordsAndToUpperCase() {
        List<String> result = Main.filterWordsAndToUpperCase(list1,"a");
        assertEquals(3, result.size());
        assertTrue(result.contains("APPLE"));
    }
    @Test //2
    void test2() {
        List<Book> result2 = Main.sortByYearAndLimit(books, 3);
        assertEquals(3, result2.size());
        assertTrue(result2.get(0).getName().equals("Harry Potter"));
    }


}
