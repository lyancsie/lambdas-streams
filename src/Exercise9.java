import java.util.Map;
import java.util.Scanner;

import static java.util.stream.Collectors.toMap;

public class Exercise9 {
  
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    String text = read.next();
    Map<Character, Integer> freq = text.chars().boxed()
        .collect(toMap(
            //key = char
            k -> (char) k.intValue(),
            v -> 1, //1 occurrence
            Integer::sum)); //counting
    
    System.out.println(freq);
  }
  
}

