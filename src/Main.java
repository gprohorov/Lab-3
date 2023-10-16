
/*
  @author   george
  @project   Default (Template) Project
  @class  ${NAME}
  @version  1.0.0 
  @since 16.10.23 - 17.32
*/

import java.util.Comparator;
import java.util.List;

//
public class Main {
    public static List<String> filterWordsAndToUpperCase(List<String> list,
                                                         String letter){
        // your code is here
        return list.stream().map(String::toUpperCase)
                .filter(word-> word.contains(letter.toUpperCase()))
                .toList();
    }
    public static List<Book> sortByYearAndLimit(List<Book> list,
                                                long limit) {
        // your code is here
        return list.stream()
                .sorted(Comparator.comparing(Book::getYear))
                .limit(limit)
                .toList();
    }



    public static void main(String[] args) {
    // nothing here
    }
}
