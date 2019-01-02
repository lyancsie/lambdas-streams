import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class Exercise4 {
  
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
    
    //OptionalDouble result = numbers.stream().filter(i -> i % 2 != 0).mapToDouble(i -> i).average();
    OptionalDouble result = numbers.stream().filter(i -> Math.abs(i) % 2 == 1).mapToDouble(i -> i).average();
    if (result.isPresent()) {
      System.out.println(result);
    } else {
      System.out.println("Error");
    }
  }
}