import java.util.Arrays;
import java.util.List;

public class Exercise3 {
  
  private static List<Integer> numbers;
  
  public static void main(String[] args) {
    numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
    numbers.stream().filter(i -> i * i < 20).forEach(System.out::println);
  }
}
