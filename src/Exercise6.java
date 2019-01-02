public class Exercise6 {
  
  public static void main(String[] args) {
    String text = "abCaBcAbC";
    StringBuilder characterStream = text.chars()
        .mapToObj(c -> (char) c)
        .filter(Character::isUpperCase)
        .collect(StringBuilder::new,
            StringBuilder::appendCodePoint,
            StringBuilder::append);
    
    System.out.println(characterStream);
  }
}