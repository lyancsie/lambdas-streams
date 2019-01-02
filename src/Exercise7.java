import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise7 {
  
  public static void main(String[] args) {
    List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
    Scanner read = new Scanner(System.in);
    char x = read.next().charAt(0);
    cities.stream().filter(i -> i.charAt(0) == x || Character.toLowerCase(i.charAt(0)) == x).forEach(System.out::println);
  }
}
