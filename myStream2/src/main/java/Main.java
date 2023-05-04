// This is example from below links
// https://www.java67.com/2014/04/java-8-stream-examples-and-tutorial.html
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) {

    List<String> strList = Arrays.asList("abc", "bcd", "", "def", "jk", "");

    // Count for empty elements
    long count = strList.stream()
        .filter(x -> x.isEmpty())
        .count();

    System.out.println("Count is: " + count);

    // Count for elements with 3 chrs in length
    long num = strList.stream()
        .filter(x -> x.length()== 3)
        .count();

    System.out.println("Count where elements = 3 chrs" + num);

    // Count # of string which start with 'a'
   count = strList.stream()
       .filter(x -> x.startsWith("a"))
       .count();

    System.out.println("Count elements beginning with an 'a': " + count);

    // Collect into new list all non-empty strings from original list
   List<String> filtered = strList.stream()
       .filter(x -> !x.isEmpty())
       .collect(Collectors.toList());

    System.out.println("New filtered list is" + filtered);

     // Collect all G7 and convert to upper case
    List<String> G7 = Arrays.asList("USA", "Japan", "France","Germany", "Italy", "U.K", "Canada");

    String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));

    System.out.println("List of G7 Countries: [ " + G7Countries + " ]");

    // Create list of square of all distinct numbers
    List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
    List<Integer> distinct = numbers.stream()
        .map(i -> i*i).distinct()
        .collect(Collectors.toList());
    System.out.printf("Original list : %s, \nSquare Without duplicates : %s \n", numbers, distinct);

    // Get count, min, max, sum, and avg for numbers
    List<Integer> primes = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
    IntSummaryStatistics stats = primes.stream()
        .mapToInt((x) -> x)
        .summaryStatistics();
    System.out.println("Highest prime number in List : " + stats.getMax());
    System.out.println("Lowest prime number in List : " + stats.getMin());
    System.out.println("Sum of all prime number : " + stats.getSum());
    System.out.println("Average of all prime number : " + stats.getAverage());

    // How flatMap works -
    List<Integer> together = Stream.of(Arrays.asList(1,2,3), Arrays.asList(4,5,6))
        .flatMap(x -> x.stream())
        .collect(Collectors.toList());

    System.out.println("flatMap output is : " + together);

  }
}
