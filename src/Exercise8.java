import java.util.Arrays;
import java.util.List;

public class Exercise8 {
  
  public static void main(String[] args) {
    List<Character> characterList = Arrays.asList('a', 'b', 'c', 'd', 'e');
    StringBuilder stringBuilder = new StringBuilder();
    characterList.forEach(stringBuilder::append);
    System.out.println(stringBuilder);
  }
  
}
