package Exercise10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
  
  public static void main(String[] args) {
    List<Fox> foxes = new ArrayList<Fox>();
    Fox fox1 = new Fox("Fox1", "green", 25);
    Fox fox2 = new Fox("Fox2", "yellow", 2);
    Fox fox3 = new Fox("Fox3", "green", 3);
    Fox fox4 = new Fox("Fox4", "reddish", 12);
    Fox fox5 = new Fox("Fox5", "green", 2);
    
    foxes.add(fox1);
    foxes.add(fox2);
    foxes.add(fox3);
    foxes.add(fox4);
    foxes.add(fox5);
    
    System.out.println("Foxes with green colour: ");
    foxes.stream().filter(fox -> fox.getColor().equals("green"))
        .forEach(fox -> System.out.println(fox.getName()));
    
    /*foxes.stream().filter(fox -> fox.getColor().equals("green"))
        .map(Fox::getName)
        .forEach(System.out::println);*/
    
    System.out.println("Young foxes with green colour: ");
    foxes.stream().filter(fox -> fox.getColor().equals("green"))
        .filter(fox -> fox.getAge() < 5)
        .map(Fox::getName)
        .forEach(System.out::println);
    
   /*
    Map<String, Integer> freq = new HashMap<>();
    foxes.stream()
        .map(Fox::getColor)
        .forEach();
  }*/
    Map<String, Long> freq = foxes.stream()
        .collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
    System.out.println("Frequency of foxes by colour: " + freq);
    
  }
}
