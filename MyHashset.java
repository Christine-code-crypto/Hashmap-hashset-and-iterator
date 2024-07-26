import java.util.HashSet;

//a Hashset is a collection of items where every item is unique
public class MyHashset {
    public static void main(String[] args) {
      HashSet<String> cars = new HashSet<String>();
      cars.add("Volvo");
      cars.add("BMW");
      cars.add("Ford");
      cars.add("BMW");
      cars.add("Mazda");
      System.out.println(cars);
      //Note: In the example above, even though BMW is added twice it only appears once in the set because every item in a set has to be unique.
      System.out.println(cars.contains("Mazda"));//to check if an item exists
      System.out.println(cars.remove("Volvo"));
      System.out.println(cars);
      System.out.println(cars.size()); //Hashset size
      //loop through a Hashset
      for (String i : cars) {
        System.out.println(i);
      }
      cars.clear();


      //Use a HashSet that stores Integer objects:
      HashSet<Integer> numbers = new HashSet<Integer>();

    // Add values to the set
    numbers.add(4);
    numbers.add(7);
    numbers.add(8);

    // Show which numbers between 1 and 10 are in the set
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) { //check if an item exists
        System.out.println(i + " was found in the set.");
      } else {
        System.out.println(i + " was not found in the set.");
      }
    }
  }



    }
  